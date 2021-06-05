package com.wmp.htmlparser.domain;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sorter {

    public static final String DELIMITER = "";

    // AAAaaBBbCcDd
    public static String stringSort(final String str) {
        return Arrays.stream(str.split(DELIMITER))
                .sorted()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.joining());
    }

    public static String numberSort(final String numStr) {
        return Arrays.stream(numStr.split(DELIMITER))
                .sorted()
                .collect(Collectors.joining());
    }

}
