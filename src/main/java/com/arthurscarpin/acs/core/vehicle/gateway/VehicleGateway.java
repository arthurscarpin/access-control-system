package com.arthurscarpin.acs.core.vehicle.gateway;

import com.arthurscarpin.acs.core.vehicle.domain.Vehicle;

import java.util.Optional;

public interface VehicleGateway {

    Optional<Vehicle> findByPlate(String plate);

    Vehicle save(Vehicle vehicle);
}
