package com.arthurscarpin.acs.infrastructure.presentation.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.OffsetDateTime;

public record AccessEventRequest(

        @NotBlank
        @Schema(description = "Vehicle plate", example = "ABC-1234")
        String plate,

        @NotBlank
        @Schema(description = "Access direction", example = "IN")
        String direction,

        @NotNull
        @PastOrPresent
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
        @Schema(description = "Event timestamp (must be in the past or present)", example = "2025-01-01T00:00:00-01:00")
        OffsetDateTime timestamp
) {
}