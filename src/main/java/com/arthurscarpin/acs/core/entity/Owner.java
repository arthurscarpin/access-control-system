package com.arthurscarpin.acs.core.entity;

import java.util.UUID;

public record Owner(
        UUID id,
        String name,
        String document,
        String email
) {
}
