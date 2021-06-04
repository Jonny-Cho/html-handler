package com.wmp.domain;

import lombok.Getter;

@Getter
public class OutputSet {

    private final String quotient;
    private final String remainder;

    public OutputSet(final String str, final int unitCount) {
        final int length = str.length();
        final int remainCount = length % unitCount;
        final int devideStandard = length - remainCount;
        quotient = str.substring(0, devideStandard);
        remainder = str.substring(devideStandard, length);
    }

}
