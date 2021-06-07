package com.wmp.htmlparser.domain;

import com.wmp.htmlparser.domain.removestrategy.RemoveHtml;
import com.wmp.htmlparser.domain.removestrategy.RemoveNothing;
import com.wmp.htmlparser.domain.removestrategy.RemoveStrategy;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public class Remover {

    private final List<RemoveStrategy> removeStrategies = Arrays.asList(new RemoveHtml(), new RemoveNothing());
    private final String removedStr;

    public Remover(final String str, final int typeNumber) {
        final RemoveStrategy removeStrategy = removeStrategies.stream()
                .filter(strategy -> strategy.support(typeNumber))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("해당되는 RemoveType이 없습니다"));
        removedStr = removeStrategy.remove(str);
    }

}
