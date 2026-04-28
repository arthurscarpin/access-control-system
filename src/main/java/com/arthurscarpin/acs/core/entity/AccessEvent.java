package com.arthurscarpin.acs.core.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

public record AccessEvent(
        UUID id,
        String plate,
        OffsetDateTime timestamp,
        String direction,
        String result
) {
}
