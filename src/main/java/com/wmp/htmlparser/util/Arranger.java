package com.wmp.htmlparser.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
@RequiredArgsConstructor
@Component
public class Arranger {

    private final Sorter sorter;
    private final Pattern PATTERN = Pattern.compile("([A-Za-z]*)([0-9]*)");

    private String sortedEnglish;
    private String sortedNumber;

    public Arranger rearrange(final String str) {
        final Matcher matcher = PATTERN.matcher(str);

        StringBuilder sbStr = new StringBuilder();
        StringBuilder sbNum = new StringBuilder();
        while (matcher.find()) {
            sbStr.append(matcher.group(1));
            sbNum.append(matcher.group(2));
        }

        this.sortedEnglish = sorter.stringSort(sbStr.toString());
        this.sortedNumber = sorter.numberSort(sbNum.toString());
        return this;
    }

}
