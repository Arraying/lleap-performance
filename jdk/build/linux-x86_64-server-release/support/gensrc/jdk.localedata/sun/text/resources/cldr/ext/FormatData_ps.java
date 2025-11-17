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

public class FormatData_ps extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "يونۍ",
            "دونۍ",
            "درېنۍ",
            "څلرنۍ",
            "پينځنۍ",
            "جمعه",
            "اونۍ",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "غ.م.",
            "غ.و.",
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
            "جنوري",
            "فبروري",
            "مارچ",
            "اپریل",
            "مۍ",
            "جون",
            "جولای",
            "اګست",
            "سېپتمبر",
            "اکتوبر",
            "نومبر",
            "دسمبر",
            "",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "لومړۍ ربعه",
            "۲مه ربعه",
            "۳مه ربعه",
            "۴مه ربعه",
        };
        final String[] metaValue_java_time_long_Eras = new String[] {
            "له میلاد څخه وړاندې",
            "له میلاد څخه وروسته",
        };
        final String[] metaValue_java_time_Eras = new String[] {
            "له میلاد وړاندې",
            "م.",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "H:mm:ss (zzzz)",
            "H:mm:ss (z)",
            "H:mm:ss",
            "H:mm",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
        };
        final String metaValue_generic_DateFormatItem_yw = "اونۍ w د Y";
        final String metaValue_generic_DateFormatItem_MMMEd = "E, MMM d";
        final String metaValue_generic_DateFormatItem_GyMd = "M/d/y GGGGG";
        final String metaValue_generic_DateFormatItem_MMMMW = "اونۍ W د MMMM";
        final String[] metaValue_MonthNarrows = new String[] {
            "ج",
            "ف",
            "م",
            "ا",
            "م",
            "ج",
            "ج",
            "ا",
            "س",
            "ا",
            "ن",
            "د",
            "",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE د G y د MMMM d",
            "د G y د MMMM d",
            "G y MMM d",
            "GGGGG y/M/d",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE د GGGG y د MMMM d",
            "د GGGG y د MMMM d",
            "GGGG y MMM d",
            "G y/M/d",
        };
        final String metaValue_calendarname_gregorian = "ګريګورين جنتري";
        final String[] metaValue_ListPatterns_standard = new String[] {
            "{0}، {1}",
            "{0}، {1}",
            "{0}، او {1}",
            "{0} او {1}",
            "",
        };
        final String[] metaValue_ListPatterns_or = new String[] {
            "",
            "",
            "{0}, یا {1}",
            "",
            "",
        };
        final Object[][] data = new Object[][] {
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DayAbbreviations", metaValue_generic_DayNames },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.Hm", "H:mm" },
            { "generic.DateFormatItem.MMMMd", "d MMMM" },
            { "generic.DateFormatItem.H", "H" },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.Md", "M/d" },
            { "generic.DateFormatItem.Hms", "H:mm:ss" },
            { "generic.DateFormatItem.yM", "G y/M" },
            { "generic.DateFormatItem.yMMMM", "د G y د MMMM" },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames",
                new String[] {
                    "جنوري",
                    "فېبروري",
                    "مارچ",
                    "اپریل",
                    "مۍ",
                    "جون",
                    "جولای",
                    "اګست",
                    "سپتمبر",
                    "اکتوبر",
                    "نومبر",
                    "دسمبر",
                    "",
                }
            },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "جنوري",
                    "فبروري",
                    "مارچ",
                    "اپریل",
                    "مۍ",
                    "جون",
                    "جولای",
                    "اګست",
                    "سپتمبر",
                    "اکتوبر",
                    "نومبر",
                    "دسمبر",
                    "",
                }
            },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "DayNames", metaValue_generic_DayNames },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "DayAbbreviations", metaValue_generic_DayNames },
            { "standalone.DayAbbreviations", metaValue_generic_DayNames },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.long.Eras", metaValue_java_time_long_Eras },
            { "long.Eras", metaValue_java_time_long_Eras },
            { "java.time.Eras", metaValue_java_time_Eras },
            { "Eras", metaValue_java_time_Eras },
            { "java.time.narrow.Eras", metaValue_java_time_Eras },
            { "narrow.Eras", metaValue_java_time_Eras },
            { "field.era", "دور" },
            { "field.year", "کال" },
            { "field.month", "مياشت" },
            { "field.week", "اونۍ" },
            { "field.weekday", "د اونۍ ورځ" },
            { "field.dayperiod", "ورځ شېبه" },
            { "field.hour", "ساعت" },
            { "timezone.regionFormat", "د {0} په وخت" },
            { "timezone.regionFormat.daylight", "{0} رڼا ورځ وخت" },
            { "timezone.regionFormat.standard", "{0} معیاری وخت" },
            { "field.minute", "دقيقه" },
            { "field.second", "ثانيه" },
            { "field.zone", "وخت سيمه" },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "EEEE د y د MMMM d",
                    "y MMMM d",
                    "y MMM d",
                    "y/M/d",
                }
            },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "PluralRules", "one:n = 1" },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayNames },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayNames },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DatePatterns",
                new String[] {
                    "EEEE د GGGG yyyy د MMMM d",
                    "د GGGG yyyy د MMMM d",
                    "GGGG y MMM d",
                    "G y/M/d",
                }
            },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic.MonthNames",
                new String[] {
                    "محرم",
                    "صفر",
                    "ربيع",
                    "ربيع II",
                    "جماعه",
                    "جماعه II",
                    "رجب",
                    "شعبان",
                    "رمضان",
                    "شوال",
                    "ذي القعده",
                    "ذي الحج",
                    "",
                }
            },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "محرم",
                    "صفر",
                    "ربيع",
                    "ربيع II",
                    "جماد",
                    "جماد ۲",
                    "رجب",
                    "شعبان",
                    "رمضان",
                    "شوال",
                    "دالقاعده",
                    "ذي الحج",
                    "",
                }
            },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayNames },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "calendarname.islamic-civil", "اسلامي جنتري (جدولي، مدني عصر)" },
            { "calendarname.islamic", "اسلامي جنتري" },
            { "calendarname.buddhist", "بودايي جنتري" },
            { "calendarname.japanese", "جاپاني جنتري" },
            { "calendarname.roc", "منگوو جنتري" },
            { "calendarname.islamic-umalqura", "اسلامي کلیزه (ام القری)" },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "DefaultNumberingSystem", "arabext" },
            { "arab.NumberElements",
                new String[] {
                    "٫",
                    "٬",
                    "؛",
                    "٪؜",
                    "٠",
                    "#",
                    "؜-",
                    "^",
                    "؉",
                    "∞",
                    "NaN",
                    "",
                    "",
                    "-－﹣‐‑‒–−⁻₋➖",
                }
            },
            { "arab.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00 ¤",
                    "#,##0%",
                    "",
                }
            },
            { "arabext.NumberElements",
                new String[] {
                    "٫",
                    "٬",
                    "؛",
                    "٪",
                    "۰",
                    "#",
                    "‎-‎",
                    "×۱۰^",
                    "؉",
                    "∞",
                    "NaN",
                    "",
                    "",
                    "-－﹣‐‑‒–−⁻₋➖",
                }
            },
            { "arabext.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "¤ #,##0.00",
                    "#,##0%",
                    "",
                }
            },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "0",
                    "#",
                    "‎−",
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
                    "¤ #,##0.00",
                    "#,##0%",
                    "¤#,##0.00;(¤#,##0.00)",
                }
            },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{other:0K}",
                    "{other:00K}",
                    "{other:000K}",
                    "{other:0M}",
                    "{other:00M}",
                    "{other:000M}",
                    "{one:0B other:0B}",
                    "{one:00B other:00B}",
                    "{one:000G other:000B}",
                    "{other:0T}",
                    "{other:00T}",
                    "{other:000T}",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "{one:0G other:0G}",
                    "{one:00G other:00G}",
                    "{one:000G other:000G}",
                }
            },
            { "ListPatterns_standard", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-short", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-narrow",
                new String[] {
                    "{0}، {1}",
                    "{0}، {1}",
                    "{0}، او {1}",
                    "{0}، {1}",
                    "",
                }
            },
            { "ListPatterns_or", metaValue_ListPatterns_or },
            { "ListPatterns_or-short", metaValue_ListPatterns_or },
            { "ListPatterns_or-narrow", metaValue_ListPatterns_or },
            { "ListPatterns_unit", metaValue_ListPatterns_standard },
            { "ListPatterns_unit-short",
                new String[] {
                    "{0}, {1}",
                    "{0}, {1}",
                    "{0}, {1}",
                    "{0} و {1}",
                    "",
                }
            },
            { "ListPatterns_unit-narrow",
                new String[] {
                    "{0} {1}",
                    "{0} {1}",
                    "{0} {1}",
                    "{0} {1}",
                    "",
                }
            },
        };
        return data;
    }
}
