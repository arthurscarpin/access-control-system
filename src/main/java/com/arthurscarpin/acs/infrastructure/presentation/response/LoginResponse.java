package com.arthurscarpin.acs.infrastructure.presentation.response;

public record LoginResponse(
    String accessToken,
    Long expiresIn
) {
}
