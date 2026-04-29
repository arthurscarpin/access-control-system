package com.arthurscarpin.acs.infrastructure.presentation.response;

import com.arthurscarpin.acs.core.vehicle.domain.VehicleStatus;

import java.util.UUID;

public record VehicleResponse(
        UUID id,
        String plate,
        String model,
        VehicleStatus status,
        UUID ownerId
) {
}
