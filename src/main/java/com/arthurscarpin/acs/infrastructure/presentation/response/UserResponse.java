package com.arthurscarpin.acs.infrastructure.presentation.response;

import java.util.List;
import java.util.UUID;

public record UserResponse(
        UUID id,
        String name,
        String email,
        List<String> scopes
) {
}
