package com.arthurscarpin.acs.core.model;

import com.arthurscarpin.acs.core.exception.LicensePlateInvalidException;

public record LicensePlate (
        String plate
) {
    public LicensePlate{
        plate = normalized(plate);
        validate(plate);
    }

    private static String normalized(String plate) {
        return plate.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
    }

    private static void validate(String plateNormalized) {
        if (plateNormalized.length() != 7) {
            throw new LicensePlateInvalidException("License plate must have 7 characters");
        }
    }
}
