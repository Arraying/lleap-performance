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

public class FormatData_bo extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "སྔ་དྲོ་",
            "ཕྱི་དྲོ་",
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
        final String[] metaValue_MonthAbbreviations = new String[] {
            "ཟླ་༡",
            "ཟླ་༢",
            "ཟླ་༣",
            "ཟླ་༤",
            "ཟླ་༥",
            "ཟླ་༦",
            "ཟླ་༧",
            "ཟླ་༨",
            "ཟླ་༩",
            "ཟླ་༡༠",
            "ཟླ་༡༡",
            "ཟླ་༡༢",
            "",
        };
        final String[] metaValue_generic_DayNames = new String[] {
            "གཟའ་ཉི་མ་",
            "གཟའ་ཟླ་བ་",
            "གཟའ་མིག་དམར་",
            "གཟའ་ལྷག་པ་",
            "གཟའ་ཕུར་བུ་",
            "གཟའ་པ་སངས་",
            "གཟའ་སྤེན་པ་",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "ཉི་མ་",
            "ཟླ་བ་",
            "མིག་དམར་",
            "ལྷག་པ་",
            "ཕུར་བུ་",
            "པ་སངས་",
            "སྤེན་པ་",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "ཉི",
            "ཟླ",
            "མིག",
            "ལྷག",
            "ཕུར",
            "སངས",
            "སྤེན",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "དུས་ཚིགས་དང་པོ།",
            "དུས་ཚིགས་གཉིས་པ།",
            "དུས་ཚིགས་གསུམ་པ།",
            "དུས་ཚིགས་བཞི་པ།",
        };
        final String[] metaValue_java_time_long_Eras = new String[] {
            "སྤྱི་ལོ་སྔོན་",
            "སྤྱི་ལོ་",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String metaValue_generic_DateFormatItem_yMMMMd = "སྤྱི་ལོ་y MMMMའི་ཚེས་d";
        final String metaValue_generic_DateFormatItem_yMMMd = "y ལོའི་MMMཚེས་d";
        final String metaValue_generic_DateFormatItem_yMMM = "y LLL";
        final String metaValue_generic_DateFormatItem_MMMMd = "MMMMའི་ཚེས་d";
        final String metaValue_generic_DateFormatItem_MMMEd = "MMMཚེས་d, E";
        final String metaValue_generic_DateFormatItem_MMMd = "MMMཚེས་d";
        final String metaValue_generic_DateFormatItem_GyMMM = "G y LLLL";
        final String[] metaValue_MonthNames = new String[] {
            "ཟླ་བ་དང་པོ",
            "ཟླ་བ་གཉིས་པ",
            "ཟླ་བ་གསུམ་པ",
            "ཟླ་བ་བཞི་པ",
            "ཟླ་བ་ལྔ་པ",
            "ཟླ་བ་དྲུག་པ",
            "ཟླ་བ་བདུན་པ",
            "ཟླ་བ་བརྒྱད་པ",
            "ཟླ་བ་དགུ་པ",
            "ཟླ་བ་བཅུ་པ",
            "ཟླ་བ་བཅུ་གཅིག་པ",
            "ཟླ་བ་བཅུ་གཉིས་པ",
            "",
        };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
            "",
            "G སྤྱི་ལོ་y MMMMའི་ཚེས་d",
            "G y ལོའི་MMMཚེས་d",
            "",
        };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
            "",
            "GGGG སྤྱི་ལོ་y MMMMའི་ཚེས་d",
            "GGGG y ལོའི་MMMཚེས་d",
            "",
        };
        final Object[][] data = new Object[][] {
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.generic.DatePatterns",
                new String[] {
                    "G y MMMM d, EEEE",
                    "G སྤྱི་ལོ་y MMMMའི་ཚེས་d",
                    "G y ལོའི་MMMཚེས་d",
                    "GGGGG y-MM-dd",
                }
            },
            { "generic.DatePatterns",
                new String[] {
                    "GGGG y MMMM d, EEEE",
                    "GGGG སྤྱི་ལོ་y MMMMའི་ཚེས་d",
                    "GGGG y ལོའི་MMMཚེས་d",
                    "G y-MM-dd",
                }
            },
            { "generic.DateFormatItem.yyyyMMMd", "G y ལོའི་MMMཚེས་d" },
            { "generic.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames",
                new String[] {
                    "ཟླ་བ་དང་པོ་",
                    "ཟླ་བ་གཉིས་པ་",
                    "ཟླ་བ་གསུམ་པ་",
                    "ཟླ་བ་བཞི་པ་",
                    "ཟླ་བ་ལྔ་པ་",
                    "ཟླ་བ་དྲུག་པ་",
                    "ཟླ་བ་བདུན་པ་",
                    "ཟླ་བ་བརྒྱད་པ་",
                    "ཟླ་བ་དགུ་པ་",
                    "ཟླ་བ་བཅུ་པ་",
                    "ཟླ་བ་བཅུ་གཅིག་པ་",
                    "ཟླ་བ་བཅུ་གཉིས་པ་",
                    "",
                }
            },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "DayNames", metaValue_generic_DayNames },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "java.time.long.Eras", metaValue_java_time_long_Eras },
            { "long.Eras", metaValue_java_time_long_Eras },
            { "java.time.Eras", metaValue_java_time_long_Eras },
            { "Eras", metaValue_java_time_long_Eras },
            { "java.time.narrow.Eras", metaValue_java_time_long_Eras },
            { "narrow.Eras", metaValue_java_time_long_Eras },
            { "field.year", "ལོ།" },
            { "field.month", "ཟླ་བ་" },
            { "field.hour", "ཆུ་ཚོད་" },
            { "field.minute", "སྐར་མ།" },
            { "field.second", "སྐར་ཆ།" },
            { "field.zone", "དུས་ཚོད།" },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "y MMMMའི་ཚེས་d, EEEE",
                    "སྤྱི་ལོ་y MMMMའི་ཚེས་d",
                    "y ལོའི་MMMཚེས་d",
                    "y-MM-dd",
                }
            },
            { "DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "buddhist.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.japanese.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "japanese.DatePatterns",
                new String[] {
                    "",
                    "GGGG སྤྱི་ལོ་yyyy MMMMའི་ཚེས་d",
                    "GGGG y ལོའི་MMMཚེས་d",
                    "",
                }
            },
            { "japanese.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "islamic.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic-civil.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic-umalqura.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "tibt.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "༠",
                    "#",
                    "-",
                    "E",
                    "‰",
                    "∞",
                    "ཨང་མེན་",
                    "",
                    "",
                    "-－﹣‐‑‒–−⁻₋➖",
                }
            },
            { "tibt.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "¤ #,##0.00",
                    "#,##0%",
                    "",
                }
            },
        };
        return data;
    }
}
