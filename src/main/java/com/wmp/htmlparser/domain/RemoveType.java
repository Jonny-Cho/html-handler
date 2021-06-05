package com.wmp.htmlparser.domain;

import com.wmp.htmlparser.domain.removestrategy.RemoveHtml;
import com.wmp.htmlparser.domain.removestrategy.RemoveNothing;
import com.wmp.htmlparser.domain.removestrategy.RemoveStrategy;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum RemoveType {
    REMOVE_HTML(1, new RemoveHtml()),
    ALL_TEXT(2, new RemoveNothing());

    private final int typeNumber;
    private final RemoveStrategy removeStrategy;

    public static RemoveType find(final int typeNumber) {
        return Arrays.stream(values())
                .filter(type -> type.typeNumber == typeNumber)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("해당되는 RemoveType이 없습니다"));
    }
}
