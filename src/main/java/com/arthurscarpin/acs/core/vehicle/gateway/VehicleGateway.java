package com.arthurscarpin.acs.core.gateway;

import com.arthurscarpin.acs.core.entity.Vehicle;

public interface VehicleGateway {

    boolean existsByPlate(String plate);

    Vehicle save(Vehicle vehicle);
}
