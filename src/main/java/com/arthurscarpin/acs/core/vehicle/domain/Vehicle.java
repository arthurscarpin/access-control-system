package com.arthurscarpin.acs.core.vehicle.domain;

import java.util.UUID;

public record Vehicle(
        UUID id,
        String plate,
        String model,
        VehicleStatus status,
        UUID ownerId
) {
}
