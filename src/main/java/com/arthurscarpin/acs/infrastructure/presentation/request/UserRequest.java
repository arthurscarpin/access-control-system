package com.arthurscarpin.acs.infrastructure.presentation.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

import java.util.List;
import java.util.UUID;

public record UserRequest(

        @NotBlank
        @Schema(description = "User full name", example = "Kylian Mbappé")
        String name,

        @NotBlank
        @Email
        @Schema(description = "User email address", example = "kylian.mbappé@email.com")
        String email,

        @NotBlank
        @Size(min = 6, max = 20)
        @Schema(description = "User password", example = "world_cup_2026")
        String password,

        @NotNull
        @NotEmpty
        @Schema(description = "List of scope IDs assigned to the user", example = """
            [
            "550e8400-e29b-41d4-a716-446655440020",
            "550e8400-e29b-41d4-a716-446655440020"
            ]
            """
        )
        List<UUID> scopes
) {
}