package com.arthurscarpin.acs.infrastructure.presentation.response;

import io.swagger.v3.oas.annotations.media.Schema;

public record ErrorField(

        @Schema(description = "Field name", example = "email")
        String field,

        @Schema(description = "Error message", example = "must be a well-formed email address")
        String message
) {
}
