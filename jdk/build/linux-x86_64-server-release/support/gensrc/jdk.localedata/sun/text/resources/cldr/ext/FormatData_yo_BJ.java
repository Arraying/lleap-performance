/*
 * Copyright (c) 2012, 2025, Oracle and/or its affiliates. All rights reserved.
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

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (c) 1991-2022 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in https://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that either
 * (a) this copyright and permission notice appear with all copies
 * of the Data Files or Software, or
 * (b) this copyright and permission notice appear in associated
 * Documentation.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_yo_BJ extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "Àárɔ̀",
            "Ɔ̀sán",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
        };
        final String[] metaValue_MonthNames = new String[] {
            "Oshù Shɛ́rɛ́",
            "Oshù Èrèlè",
            "Oshù Ɛrɛ̀nà",
            "Oshù Ìgbé",
            "Oshù Ɛ̀bibi",
            "Oshù Òkúdu",
            "Oshù Agɛmɔ",
            "Oshù Ògún",
            "Oshù Owewe",
            "Oshù Ɔ̀wàrà",
            "Oshù Bélú",
            "Oshù Ɔ̀pɛ̀",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "S",
            "È",
            "Ɛ",
            "Ì",
            "Ɛ̀",
            "Ò",
            "A",
            "Ò",
            "O",
            "Ɔ̀",
            "B",
            "Ɔ̀",
            "",
        };
        final String[] metaValue_generic_DayNames = new String[] {
            "Ɔjɔ́ Àìkú",
            "Ɔjɔ́ Ajé",
            "Ɔjɔ́ Ìsɛ́gun",
            "Ɔjɔ́rú",
            "Ɔjɔ́bɔ",
            "Ɔjɔ́ Ɛtì",
            "Ɔjɔ́ Àbámɛ́ta",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "Àìkú",
            "Ajé",
            "Ìsɛ́gun",
            "Ɔjɔ́rú",
            "Ɔjɔ́bɔ",
            "Ɛtì",
            "Àbámɛ́ta",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "À",
            "A",
            "Ì",
            "Ɔ",
            "Ɔ",
            "Ɛ",
            "À",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "Ìdámɛ́rin kíní",
            "Ìdámɛ́rin Kejì",
            "Ìdámɛ́rin Kɛta",
            "Ìdámɛ́rin Kɛrin",
        };
        final String[] metaValue_generic_QuarterNarrows = new String[] {
            "kíní",
            "Kejì",
            "Kɛta",
            "Kɛin",
        };
        final String metaValue_calendarname_gregorian = "Kàlɛ́ńdà Gregory";
        final Object[][] data = new Object[][] {
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "standalone.MonthAbbreviations", metaValue_MonthNames },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "DayNames", metaValue_generic_DayNames },
            { "standalone.DayNames", metaValue_generic_DayAbbreviations },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "field.year", "Ɔdún" },
            { "field.week", "Ɔ̀sɛ̀" },
            { "field.weekday", "Ɔjɔ́ tó wà láàárín ɔ̀sɛ̀" },
            { "field.dayperiod", "Àárɔ̀/ɔ̀sán" },
            { "timezone.regionFormat.daylight", "{0} Àkókò ojúmɔmɔ" },
            { "field.minute", "Ìsɛ́jú" },
            { "field.second", "Ìsɛ́jú Ààyá" },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "buddhist.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "japanese.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "calendarname.buddhist", "Kàlɛ́ńdà Buddhist" },
            { "calendarname.japanese", "Kàlɛ́ńdà ti Jàpánù" },
            { "calendarname.islamic-civil", "Kàlɛ́ńdà ti Musulumi" },
            { "calendarname.islamic", "Kàlɛ́ńdà Lárúbáwá" },
            { "calendarname.islamic-umalqura", "Kàlɛ́ńdà Musulumi" },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "calendarname.roc", "Kàlɛ́ńdà Minguo" },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "‰",
                    "∞",
                    "NaN",
                    "",
                    "",
                    "-－﹣‐‑‒–−⁻₋➖",
                }
            },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "¤#,##0.00",
                    "#,##0%",
                    "¤#,##0.00;(¤#,##0.00)",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{other:0' 'ɛgbɛ̀rún}",
                    "{other:00' 'ɛgbɛ̀rún}",
                    "{other:000' 'ɛgbɛ̀rún}",
                    "{other:0' 'mílíɔ̀nù}",
                    "{other:00' 'mílíɔ̀nù}",
                    "{other:000' 'mílíɔ̀nù}",
                    "{other:0' 'bilíɔ̀nù}",
                    "{other:00' 'bilíɔ̀nù}",
                    "{other:000' 'bilíɔ̀nù}",
                    "{other:0' 'tiriliɔ̀nù}",
                    "{other:00' 'tiriliɔ̀nù}",
                    "{other:000' 'tiriliɔ̀nù}",
                }
            },
        };
        return data;
    }
}
