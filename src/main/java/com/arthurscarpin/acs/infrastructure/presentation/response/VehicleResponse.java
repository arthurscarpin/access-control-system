package com.arthurscarpin.acs.infrastructure.presentation.response;

import com.arthurscarpin.acs.core.vehicle.domain.VehicleStatus;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

public record VehicleResponse(

        @Schema(description = "Unique identifier of the vehicle", example = "550e8400-e29b-41d4-a716-446655440030")
        UUID id,

        @Schema(description = "Vehicle plate", example = "ABC-1234")
        String plate,

        @Schema(description = "Vehicle model", example = "BMW 320i")
        String model,

        @Schema(description = "Current vehicle status", example = "ACTIVE")
        VehicleStatus status,

        @Schema(description = "Identifier of the vehicle owner", example = "550e8400-e29b-41d4-a716-446655440010")
        UUID ownerId
) {
}