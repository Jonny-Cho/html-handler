package com.wmp.htmlparser.util.removestrategy;

public class RemoveHtml implements RemoveStrategy {

    public static final String REMOVE_TAG_PATTERN = "<[^>]*>";
    public static final String EMPTY = "";

    @Override
    public String remove(final String str) {
        return str.replaceAll(REMOVE_TAG_PATTERN, EMPTY);
    }
}
