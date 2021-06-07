package com.wmp.htmlparser.domain.removestrategy;

public class RemoveHtml implements RemoveStrategy {

    public static final String REMOVE_TAG_PATTERN = "<[^>]*>";
    public static final String EMPTY = "";
    public static final int REMOVE_HTML_TYPE_NUMBER = 1;

    @Override
    public String remove(final String str) {
        return str.replaceAll(REMOVE_TAG_PATTERN, EMPTY);
    }

    @Override
    public boolean support(final int typeNumber) {
        return typeNumber == REMOVE_HTML_TYPE_NUMBER;
    }
}
