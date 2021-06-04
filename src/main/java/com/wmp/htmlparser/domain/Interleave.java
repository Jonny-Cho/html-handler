package com.wmp.htmlparser.domain;

import lombok.Getter;

import java.util.Arrays;
import java.util.Iterator;

@Getter
public class Interleave {

    public static final String DELIMITER = "";
    private final String result;

    public Interleave(final String str1, final String str2) {
        StringBuilder sb = new StringBuilder();

        Iterator<String> it1 = Arrays.stream(str1.split(DELIMITER)).iterator();
        Iterator<String> it2 = Arrays.stream(str2.split(DELIMITER)).iterator();

        while (it1.hasNext() || it2.hasNext()) {
            if (it1.hasNext()) {
                sb.append(it1.next());
            }
            if (it2.hasNext()) {
                sb.append(it2.next());
            }
        }

        result = sb.toString();
    }

}
