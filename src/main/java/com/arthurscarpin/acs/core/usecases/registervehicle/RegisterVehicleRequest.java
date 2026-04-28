package com.arthurscarpin.acs.core.usecases.registervehicle;

import java.util.UUID;

public record RegisterVehicleRequest(
        String plate,
        String model,
        UUID ownerId
) {
}
