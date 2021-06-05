package com.wmp.htmlparser.domain;

import com.wmp.htmlparser.domain.removestrategy.RemoveStrategy;
import lombok.Getter;

@Getter
public class Remover {

    private final String removedStr;

    public Remover(final String str, final RemoveStrategy removeStrategy) {
        removedStr = removeStrategy.remove(str);
    }

}
