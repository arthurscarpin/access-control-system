package com.arthurscarpin.acs.infrastructure.presentation.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.OffsetDateTime;

public record AccessEventRequest(
        @NotBlank
        String plate,

        @NotBlank
        String direction,

        @NotNull
        @PastOrPresent
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
        OffsetDateTime timestamp
) {
}
