package com.logicalshovel.mytwitch.external.model;

import java.util.List;

public record GameResponse(
        List<Game> data
) {
}
