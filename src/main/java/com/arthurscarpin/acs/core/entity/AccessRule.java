package com.arthurscarpin.acs.core.entity;

import java.util.UUID;

public record AccessRule(
        UUID id,
        UUID vehicleId,
        boolean allowed
) {
}
