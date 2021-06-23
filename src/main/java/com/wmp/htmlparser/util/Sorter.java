package com.wmp.htmlparser.util;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Component
public class Sorter {

    public static final String DELIMITER = "";

    // AAAaaBBbCcDd
    public String stringSort(final String str) {
        return Arrays.stream(str.split(DELIMITER))
                .sorted()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.joining());
    }

    public String numberSort(final String numStr) {
        return Arrays.stream(numStr.split(DELIMITER))
                .sorted()
                .collect(Collectors.joining());
    }

}
