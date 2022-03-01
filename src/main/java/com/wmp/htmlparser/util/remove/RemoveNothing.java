package com.wmp.htmlparser.util.remove;

public class RemoveNothing implements RemoveStrategy {

    @Override
    public String remove(final String str) {
        return str;
    }

}
