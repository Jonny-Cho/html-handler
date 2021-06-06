package com.wmp.htmlparser.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arranger {

    private static final Pattern PATTERN = Pattern.compile("([A-Za-z]*)([0-9]*)");

    public static String rearrange(final String str) {
        final Matcher matcher = PATTERN.matcher(str);

        StringBuilder sbStr = new StringBuilder();
        StringBuilder sbNum = new StringBuilder();
        while (matcher.find()) {
            sbStr.append(matcher.group(1));
            sbNum.append(matcher.group(2));
        }
        return Sorter.stringSort(sbStr.toString()) + Sorter.numberSort(sbNum.toString());
    }

}
