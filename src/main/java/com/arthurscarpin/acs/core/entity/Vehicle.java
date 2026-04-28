package com.arthurscarpin.acs.core.entity;

import java.util.UUID;

public record Vehicle(
        UUID id,
        String plate,
        String model,
        String status,
        UUID ownerId
) {
}
