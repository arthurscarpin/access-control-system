package com.arthurscarpin.acs.core.usecases;

import com.arthurscarpin.acs.core.entity.AccessEvent;
import com.arthurscarpin.acs.core.entity.Vehicle;

public interface RegisterAccessEventUseCase {

    AccessEvent execute(Vehicle vehicle);
}
