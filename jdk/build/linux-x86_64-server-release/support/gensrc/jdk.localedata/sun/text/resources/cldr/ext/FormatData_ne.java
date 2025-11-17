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

public class FormatData_ne extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "पूर्वाह्न",
            "अपराह्न",
            "मध्यरात",
            "मध्यान्ह",
            "बिहान",
            "",
            "अपरान्ह",
            "साँझ",
            "बेलुकी",
            "",
            "रात",
            "",
        };
        final String[] metaValue_MonthNames = new String[] {
            "जनवरी",
            "फेब्रुअरी",
            "मार्च",
            "अप्रिल",
            "मे",
            "जुन",
            "जुलाई",
            "अगस्ट",
            "सेप्टेम्बर",
            "अक्टोबर",
            "नोभेम्बर",
            "डिसेम्बर",
            "",
        };
        final String[] metaValue_generic_DayNames = new String[] {
            "आइतबार",
            "सोमबार",
            "मङ्गलबार",
            "बुधबार",
            "बिहिबार",
            "शुक्रबार",
            "शनिबार",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "आइत",
            "सोम",
            "मङ्गल",
            "बुध",
            "बिहि",
            "शुक्र",
            "शनि",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "आ",
            "सो",
            "म",
            "बु",
            "बि",
            "शु",
            "श",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "पहिलो त्रैमासिक",
            "दोस्रो त्रैमासिक",
            "तेस्रो त्रैमासिक",
            "चौथो त्रैमासिक",
        };
        final String[] metaValue_QuarterNarrows = new String[] {
            "१",
            "२",
            "३",
            "४",
        };
        final String[] metaValue_java_time_long_Eras = new String[] {
            "ईसा पूर्व",
            "सन्",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String metaValue_generic_DateFormatItem_yw = "Y को w हप्ता";
        final String metaValue_generic_DateFormatItem_GyMd = "M/d/y G";
        final String metaValue_generic_DateFormatItem_MMMMW = "MMMM को W हप्ता";
        final String metaValue_generic_DateFormatItem_Ed = "d E";
        final String[] metaValue_MonthNarrows = new String[] {
            "जन",
            "फेब",
            "मार्च",
            "अप्र",
            "मे",
            "जुन",
            "जुल",
            "अग",
            "सेप",
            "अक्टो",
            "नोभे",
            "डिसे",
            "",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "G y MMMM d, EEEE",
            "G y MMMM d",
            "G y MMM d",
            "GGGGG y-MM-dd",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "GGGG y MMMM d, EEEE",
            "GGGG y MMMM d",
            "GGGG y MMM d",
            "G y-MM-dd",
        };
        final String metaValue_calendarname_gregorian = "ग्रेगोरियन पात्रो";
        final String[] metaValue_ListPatterns_standard = new String[] {
            "{0},{1}",
            "",
            "{0} र {1}",
            "{0} र {1}",
            "",
        };
        final String[] metaValue_ListPatterns_or = new String[] {
            "",
            "",
            "{0}, वा {1}",
            "{0} वा {1}",
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
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1},{0}",
                    "{1},{0}",
                }
            },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.MEd", "MM/dd, E" },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "standalone.MonthAbbreviations", metaValue_MonthNames },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "standalone.MonthNarrows",
                new String[] {
                    "जन",
                    "फेेब",
                    "मार्च",
                    "अप्र",
                    "मे",
                    "जुन",
                    "जुल",
                    "अग",
                    "सेप",
                    "अक्टो",
                    "नोभे",
                    "डिसे",
                    "",
                }
            },
            { "DayNames", metaValue_generic_DayNames },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.QuarterNames",
                new String[] {
                    "प्रथम त्रैमासिक",
                    "द्वितीय त्रैमासिक",
                    "तृतीय त्रैमासिक",
                    "चतुर्थ त्रैमासिक",
                }
            },
            { "QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "QuarterNarrows", metaValue_QuarterNarrows },
            { "standalone.QuarterNarrows", metaValue_QuarterNarrows },
            { "AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "java.time.long.Eras", metaValue_java_time_long_Eras },
            { "long.Eras", metaValue_java_time_long_Eras },
            { "java.time.Eras", metaValue_java_time_long_Eras },
            { "Eras", metaValue_java_time_long_Eras },
            { "java.time.narrow.Eras", metaValue_java_time_long_Eras },
            { "narrow.Eras", metaValue_java_time_long_Eras },
            { "field.era", "काल" },
            { "field.year", "वर्ष" },
            { "field.month", "महिना" },
            { "field.week", "हप्ता" },
            { "field.weekday", "हप्ताको बार" },
            { "field.dayperiod", "पूर्वाह्न / अपराह्न" },
            { "field.hour", "घण्टा" },
            { "timezone.regionFormat", "{0} समय" },
            { "timezone.regionFormat.daylight", "{0} (+१)" },
            { "timezone.regionFormat.standard", "{0} (+०)" },
            { "field.minute", "मिनेट" },
            { "field.second", "सेकेन्ड" },
            { "field.zone", "क्षेत्र" },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "y MMMM d, EEEE",
                    "y MMMM d",
                    "y MMM d",
                    "yy/M/d",
                }
            },
            { "DateTimePatterns",
                new String[] {
                    "{1} {0}",
                    "{1} {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
            { "PluralRules", "one:n = 1" },
            { "DayPeriodRules", "midnight:00:00;noon:12:00;night1:22:00-04:00;afternoon1:12:00-16:00;morning1:04:00-12:00;afternoon2:16:00-19:00;evening1:19:00-22:00" },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.QuarterNarrows", metaValue_QuarterNarrows },
            { "japanese.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DatePatterns",
                new String[] {
                    "GGGG yyyy MMMM d, EEEE",
                    "GGGG yyyy MMMM d",
                    "GGGG y MMM d",
                    "G y-MM-dd",
                }
            },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.QuarterNarrows", metaValue_QuarterNarrows },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "calendarname.islamic-civil", "हिजरी पात्रो (टेबुलर, नागरिक युग)" },
            { "calendarname.islamic", "हिजरी पात्रो" },
            { "calendarname.buddhist", "बुद्धिष्ट पात्रो" },
            { "calendarname.japanese", "जापानी पात्रो" },
            { "calendarname.roc", "चिनियाँ गणतन्त्रको पात्रो" },
            { "calendarname.islamic-umalqura", "इस्लामी पात्रो" },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "DefaultNumberingSystem", "deva" },
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
                    "#,##,##0.###",
                    "¤ #,##,##0.00",
                    "#,##0%",
                    "",
                }
            },
            { "deva.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "०",
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
            { "deva.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "¤ #,##0.00",
                    "#,##,##0%",
                    "",
                }
            },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0 हजार other:0 हजार}",
                    "{one:00 हजार other:00 हजार}",
                    "{one:0 लाख other:0 लाख}",
                    "{one:00 लाख other:00 लाख}",
                    "{one:0 करोड other:0 करोड}",
                    "{one:00 करोड other:00 करोड}",
                    "{one:0 अरब other:0 अरब}",
                    "{one:00 अरब other:00 अरब}",
                    "{one:0 खरब other:0 खरब}",
                    "{one:00 खरब other:00 खरब}",
                    "{one:0 शंख other:0 शंख}",
                    "{one:00 शंख other:00 शंख}",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' 'हजार other:0' 'हजार}",
                    "{one:00' 'हजार other:00' 'हजार}",
                    "{one:0' 'लाख other:0' 'लाख}",
                    "{one:0' 'करोड other:0' 'करोड}",
                    "{one:00' 'करोड other:00' 'करोड}",
                    "{one:000' 'करोड other:000' 'करोड}",
                    "{one:0' 'अरब other:0' 'अरब}",
                    "{one:00' 'अरब other:00' 'अरब}",
                    "{one:000' 'अरब other:000' 'अरब}",
                    "{one:00' 'खरब other:00' 'खरब}",
                    "{one:0' 'शंख other:0' 'शंख}",
                    "{one:00' 'शंख other:00' 'शंख}",
                }
            },
            { "ListPatterns_standard", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-short", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-narrow",
                new String[] {
                    "{0},{1}",
                    "",
                    "{0}, {1}",
                    "{0}, {1}",
                    "",
                }
            },
            { "ListPatterns_or", metaValue_ListPatterns_or },
            { "ListPatterns_or-short", metaValue_ListPatterns_or },
            { "ListPatterns_or-narrow", metaValue_ListPatterns_or },
            { "ListPatterns_unit",
                new String[] {
                    "{0},{1}",
                    "",
                    "{0} र {1}",
                    "{0},{1}",
                    "",
                }
            },
            { "ListPatterns_unit-short",
                new String[] {
                    "{0},{1}",
                    "",
                    "{0},{1}",
                    "{0} {1}",
                    "",
                }
            },
            { "ListPatterns_unit-narrow",
                new String[] {
                    "{0} {1}",
                    "{0}{1}",
                    "{0} {1}",
                    "{0} र {1}",
                    "",
                }
            },
        };
        return data;
    }
}
