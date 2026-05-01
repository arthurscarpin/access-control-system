package com.arthurscarpin.acs.infrastructure.presentation.request;

import jakarta.validation.constraints.*;

import java.util.List;
import java.util.UUID;

public record UserRequest(
        @NotBlank
        String name,

        @NotBlank
        @Email
        String email,

        @NotBlank
        @Size(min = 6, max = 20)
        String password,

        @NotNull
        @NotEmpty
        List<UUID> scopes
) {
}
