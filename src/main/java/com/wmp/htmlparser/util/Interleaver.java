package com.wmp.htmlparser.util;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Iterator;

@Component
public class Interleaver {

    public static final String DELIMITER = "";

    public String interleave(final String str1, final String str2) {
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

        return sb.toString();
    }

}
