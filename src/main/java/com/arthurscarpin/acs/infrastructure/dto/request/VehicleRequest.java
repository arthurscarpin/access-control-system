package com.arthurscarpin.acs.infrastructure.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record VehicleRequest(
        @NotBlank
        @Size(min = 5, max = 10)
        @Pattern(
                regexp = "^[a-zA-Z0-9- ]+$",
                message = "Plate must contain only letters and numbers"
        )
        String plate,

        @NotBlank
        String model,

        @NotNull
        UUID owner_id
) {
}
