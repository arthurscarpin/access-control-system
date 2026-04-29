package com.arthurscarpin.acs.core.usecases.registeraccessevent;

import com.arthurscarpin.acs.core.entity.AccessEvent;
import com.arthurscarpin.acs.core.entity.Vehicle;

public interface RegisterAccessEventUseCase {

    AccessEvent execute(Vehicle vehicle);
}
