package com.arthurscarpin.acs.infrastructure.presentation.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;
import java.util.UUID;

public record UserResponse(

        @Schema(description = "Unique identifier of the user", example = "550e8400-e29b-41d4-a716-446655440020")
        UUID id,

        @Schema(description = "User full name", example = "Lionel Messi")
        String name,

        @Schema(description = "User email address", example = "lionel.messi@email.com")
        String email,

        @Schema(description = "List of user scopes", example = """
            [
            "550e8400-e29b-41d4-a716-446655440020",
            "550e8400-e29b-41d4-a716-446655440020"
            ]
            """)
        List<String> scopes
) {
}