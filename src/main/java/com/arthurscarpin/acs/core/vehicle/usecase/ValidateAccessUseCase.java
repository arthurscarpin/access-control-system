package com.arthurscarpin.acs.core.usecases.validateaccess;

import com.arthurscarpin.acs.core.entity.Vehicle;
import com.arthurscarpin.acs.core.enums.AccessResult;

public interface ValidateAccessUseCase {

    AccessResult execute(Vehicle vehicle);
}
