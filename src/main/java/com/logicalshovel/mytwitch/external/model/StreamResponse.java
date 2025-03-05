package com.logicalshovel.mytwitch.external.model;

import java.util.List;

public record StreamResponse(
        List<Stream> data
) {
}
