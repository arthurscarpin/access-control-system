package com.arthurscarpin.acs.infrastructure.presentation.response;

import io.swagger.v3.oas.annotations.media.Schema;

public record LoginResponse(

        @Schema(description = "JWT access token used for authenticated requests", example = "eyJhbGciOiJSUzI1NiJ9")
        String accessToken,

        @Schema(description = "Token expiration time in seconds", example = "6000")
        Long expiresIn
) {
}