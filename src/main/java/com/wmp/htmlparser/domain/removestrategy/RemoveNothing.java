package com.wmp.htmlparser.domain.removestrategy;

public class RemoveNothing implements RemoveStrategy {

    public static final int REMOVE_NOTHING_TYPE_NUMBER = 2;

    @Override
    public String remove(final String str) {
        return str;
    }

    @Override
    public boolean support(final int typeNumber) {
        return typeNumber == REMOVE_NOTHING_TYPE_NUMBER;
    }
}
