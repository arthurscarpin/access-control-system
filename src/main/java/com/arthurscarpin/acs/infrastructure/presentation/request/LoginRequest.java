package com.arthurscarpin.acs.infrastructure.presentation.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record LoginRequest(

        @NotBlank
        @Email
        @Schema(description = "User email address", example = "neymar.junior@email.com")
        String email,

        @NotBlank
        @Schema(description = "User password", example = "world_cup_2026")
        String password
) {
}