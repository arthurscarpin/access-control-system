package com.arthurscarpin.acs.infrastructure.presentation.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import java.time.OffsetDateTime;
import java.util.List;

@Builder
public record ErrorResponse(

        @Schema(description = "Timestamp when the error occurred", example = "2025-01-01T00:00:00-01:00")
        OffsetDateTime timestamp,

        @Schema(description = "HTTP status code", example = "400")
        Integer status,

        @Schema(description = "General error message", example = "Validation error")
        String message,

        @Schema(description = "List of field validation errors")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        List<ErrorField> errors
) {
}
