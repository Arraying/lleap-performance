/*
 * Copyright (c) 2025, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package jdk.internal.util.regex;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

import static java.util.Map.entry;

public final class CaseFolding {

    private static final Map<Integer, Integer> expanded_case_map = Map.ofEntries(
        entry(0x0131, 0x0049),
        entry(0x00B5, 0x03BC),
        entry(0x0130, 0x0069),
        entry(0x017F, 0x0073),
        entry(0x01C5, 0x01C6),
        entry(0x01C8, 0x01C9),
        entry(0x01CB, 0x01CC),
        entry(0x01F2, 0x01F3),
        entry(0x0345, 0x03B9),
        entry(0x03C2, 0x03C3),
        entry(0x03D0, 0x03B2),
        entry(0x03D1, 0x03B8),
        entry(0x03D5, 0x03C6),
        entry(0x03D6, 0x03C0),
        entry(0x03F0, 0x03BA),
        entry(0x03F1, 0x03C1),
        entry(0x03F4, 0x03B8),
        entry(0x03F5, 0x03B5),
        entry(0x1C80, 0x0432),
        entry(0x1C81, 0x0434),
        entry(0x1C82, 0x043E),
        entry(0x1C83, 0x0441),
        entry(0x1C84, 0x0442),
        entry(0x1C85, 0x0442),
        entry(0x1C86, 0x044A),
        entry(0x1C87, 0x0463),
        entry(0x1C88, 0xA64B),
        entry(0x1E9B, 0x1E61),
        entry(0x1E9E, 0x00DF),
        entry(0x1FBE, 0x03B9),
        entry(0x1FD3, 0x0390),
        entry(0x1FE3, 0x03B0),
        entry(0x2126, 0x03C9),
        entry(0x212A, 0x006B),
        entry(0x212B, 0x00E5),
        entry(0xFB05, 0xFB06)
    );

    private static final int[] expanded_case_cps = expanded_case_map.keySet()
      .stream()
      .mapToInt(Integer::intValue)
      .toArray();

    private CaseFolding()  {}

    /**
     * Returns an expansion set to "close" a given regex Unicode character class range for case-sensitive
     * matching, according to the
     * <a href="https://www.unicode.org/reports/tr18/#Simple_Loose_Matches">Simple Loose Matches</a>
     * rule defined in Unicode Technical Standard #18: Unicode Regular Expressions.
     * <p>
     * To conform with Level 1 of UTS #18, specifically RL1.5: Simple Loose Matches, simple case folding must
     * be applied to literals and (optionally) to character classes. When applied to character classes, each
     * character class is expected to be closed under simple case folding. See the standard for the
     * detailed explanation and example of "closed".
     * <p>
     * RL1.5 states: To meet this requirement, an implementation that supports case-sensitive matching should
     * <ol>
     * <li>Provide at least the simple, default Unicode case-insensitive matching, and</li>
     * <li>Specify which character properties or constructs are closed under the matching.</li>
     * </ol>
     * <p>
     * In the {@code  Pattern} implementation, 5 types of constructs maybe case-sensitive when matching:
     * back-refs, string slice (sequences), single, family(char-property) and class range. Single and
     * family may appears independently or within a class.
     * <p>
     * For loose/case-insensitive matching, the back-refs, slices and singles apply {code toUpperCase} and
     * {@code toLowerCase} to both the pattern and the input string. This effectively 'close' the class for
     * matching.
     * <p>
     * The family/char-properties are not "closed" and should remain unchanged. This is acceptable per RL1.5,
     * if their behavior is clearly specified.
     * <p>
     * This method addresses that requirement for the "range" construct within in character class by computing
     * the additional characters that should be included to close the range under simple case folding:
     * <p>
     * For each character in the input range {@code [start, end]} (inclusive), if the character has a simple
     * case folding mapping in Unicode's CaseFolding.txt, the mapping is not a round-trip map, and the mapped
     * character is not already in the range, then that mapped character (typically lowercase) is added to
     * the expansion set.
     * <p>
     * This allows regex character class "range" implementation to use the returned expansion set to support
     * additional case-insensitive matching, without duplicating characters already covered by the existing
     * regex range implementation. The expectation is the matching is done using both the uppercase and
     * lowercase forms of the input character, for example
     *
     * <pre>{@code
     *
     *     ch -> inRange(lower, Character.toUpperCase(ch), upper) ||
     *           inRange(lower, Character.toLower(ch), upper) ||
     *           additionalClosingCharacters.contains(Character.toUpperCase(ch)) ||
     *           additionalClosingCharacters.contains(Character.toUpperCase(ch))
     * }</pre>
     *
     * <p>
     * @spec https://www.unicode.org/reports/tr18/#Simple_Loose_Matches
     * @param start the starting code point of the character range
     * @param end the ending code point of the character range
     * @return a {@code int[]} containing the all simple case equivalents of characters in the range, excluding
     *         those already in the range
     */
    public static int[] getClassRangeClosingCharacters(int start, int end) {
        int[] expanded = new int[expanded_case_cps.length];
        int off = 0;
        for (int cp : expanded_case_cps) {
            if (cp >= start && cp <= end) {
                int folding = expanded_case_map.get(cp);
                if (folding < start || folding > end) {
                    expanded[off++] = folding;
                }
            }
        }
        return Arrays.copyOf(expanded, off);
    }
}
