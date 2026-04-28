package com.arthurscarpin.acs.infrastructure.dto.response;

import com.arthurscarpin.acs.core.enums.VehicleStatus;

import java.util.UUID;

public record VehicleResponse(
        UUID id,
        String plate,
        String model,
        VehicleStatus status,
        UUID ownerId
) {
}
