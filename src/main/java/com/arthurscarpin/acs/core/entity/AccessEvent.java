package com.arthurscarpin.acs.core.entity;

import com.arthurscarpin.acs.core.enums.AccessResult;

import java.time.OffsetDateTime;
import java.util.UUID;

public record AccessEvent(
        UUID id,
        String plate,
        OffsetDateTime timestamp,
        String direction,
        AccessResult result
) {
}
