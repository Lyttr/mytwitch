package com.logicalshovel.mytwitch.external.model;

import java.util.List;

public record VideoResponse(
        List<Video> data
) {
}
