package com.arthurscarpin.acs.core.vehicle.usecase;

import com.arthurscarpin.acs.core.vehicle.domain.Vehicle;

public interface UpdateVehicleStatusUseCase {

    Vehicle execute(Vehicle vehicle);
}
