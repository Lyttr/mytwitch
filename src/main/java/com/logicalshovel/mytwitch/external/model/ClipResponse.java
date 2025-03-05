package com.logicalshovel.mytwitch.external.model;

import java.util.List;

public record ClipResponse(
        List<Clip> data
) {
}
