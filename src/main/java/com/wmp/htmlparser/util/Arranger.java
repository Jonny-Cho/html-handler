package com.wmp.htmlparser.domain;

import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
public class Arranger {

    private static final Pattern PATTERN = Pattern.compile("([A-Za-z]*)([0-9]*)");

    private final String sortedEnglish;
    private final String sortedNumber;

    public Arranger(final String str) {
        final Matcher matcher = PATTERN.matcher(str);

        StringBuilder sbStr = new StringBuilder();
        StringBuilder sbNum = new StringBuilder();
        while (matcher.find()) {
            sbStr.append(matcher.group(1));
            sbNum.append(matcher.group(2));
        }
        this.sortedEnglish = Sorter.stringSort(sbStr.toString());
        this.sortedNumber = Sorter.numberSort(sbNum.toString());
    }

}
