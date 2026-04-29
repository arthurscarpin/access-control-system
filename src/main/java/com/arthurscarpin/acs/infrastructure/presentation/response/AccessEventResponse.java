package com.arthurscarpin.acs.infrastructure.presentation.response;

import com.arthurscarpin.acs.core.accessevent.domain.AccessResult;

import java.time.OffsetDateTime;
import java.util.UUID;

public record AccessEventResponse(
        UUID id,
        String plate,
        OffsetDateTime timestamp,
        String direction,
        AccessResult result) {
}
