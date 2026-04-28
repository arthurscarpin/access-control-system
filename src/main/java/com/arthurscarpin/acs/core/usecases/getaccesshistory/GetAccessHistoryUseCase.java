package com.arthurscarpin.acs.core.usecases;

import com.arthurscarpin.acs.core.entity.AccessEvent;
import com.arthurscarpin.acs.core.entity.Vehicle;

import java.util.List;

public interface GetAccessHistoryUseCase {

    List<AccessEvent> execute(Vehicle vehicle);
}
