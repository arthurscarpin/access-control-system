package com.arthurscarpin.acs.core.accessevent.usecase;

import com.arthurscarpin.acs.core.accessevent.domain.AccessEvent;
import com.arthurscarpin.acs.core.vehicle.domain.Vehicle;

public interface RegisterAccessEventUseCase {

    AccessEvent execute(Vehicle vehicle);
}
