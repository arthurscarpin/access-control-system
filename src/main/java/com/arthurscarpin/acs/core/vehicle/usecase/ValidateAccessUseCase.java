package com.arthurscarpin.acs.core.vehicle.usecase;

import com.arthurscarpin.acs.core.vehicle.domain.Vehicle;
import com.arthurscarpin.acs.core.accessevent.domain.AccessResult;

public interface ValidateAccessUseCase {

    AccessResult execute(Vehicle vehicle);
}
