package com.arthurscarpin.acs.infrastructure.presentation.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

import java.time.OffsetDateTime;
import java.util.Map;

@Builder
public record ErrorResponse(
        OffsetDateTime timestamp,
        Integer status,
        String message,

        @JsonInclude(JsonInclude.Include.NON_NULL)
        Map<String, String> errors
) {
}
