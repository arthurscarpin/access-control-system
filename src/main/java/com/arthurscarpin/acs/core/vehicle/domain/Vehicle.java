package com.arthurscarpin.acs.core.vehicle.entity;

import com.arthurscarpin.acs.core.vehicle.enums.VehicleStatus;

import java.util.UUID;

public record Vehicle(
        UUID id,
        String plate,
        String model,
        VehicleStatus status,
        UUID ownerId
) {
}
