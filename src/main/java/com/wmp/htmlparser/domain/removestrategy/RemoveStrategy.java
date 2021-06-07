package com.wmp.htmlparser.domain.removestrategy;

public interface RemoveStrategy {

    String remove(final String str);

    boolean support(final int typeNumber);

}
