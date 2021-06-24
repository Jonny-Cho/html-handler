package com.wmp.htmlparser.util;

import com.wmp.htmlparser.util.removestrategy.RemoveStrategy;
import lombok.Getter;

@Getter
public class Remover {

    private final String removedStr;

    public Remover(final String str, final RemoveStrategy removeStrategy) {
        removedStr = removeStrategy.remove(str);
    }

}
