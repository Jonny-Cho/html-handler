package com.wmp.htmlparser.util.remove;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RemoveType {

    REMOVE_HTML(new RemoveHtml()), REMOVE_NOTHING(new RemoveNothing());

    private final RemoveStrategy removeStrategy;

}
