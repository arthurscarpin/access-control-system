package com.arthurscarpin.acs.core.accessrule;

import java.util.UUID;

public record AccessRule(
        UUID id,
        UUID vehicleId,
        boolean allowed
) {
}
