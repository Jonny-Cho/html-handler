package com.wmp.htmlparser.util.removestrategy;

public class RemoveNothing implements RemoveStrategy {

    @Override
    public String remove(final String str) {
        return str;
    }

}
