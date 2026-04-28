package com.arthurscarpin.acs.core.usecases.registervehicle;

import com.arthurscarpin.acs.core.entity.Vehicle;

public interface RegisterVehicleUseCase {

    Vehicle execute(RegisterVehicleRequest vehicle);
}
