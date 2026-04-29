package com.arthurscarpin.acs.core.accessevent.usecase;

import com.arthurscarpin.acs.core.accessevent.domain.AccessEvent;
import com.arthurscarpin.acs.core.vehicle.domain.Vehicle;

import java.util.List;

public interface GetAccessHistoryUseCase {

    List<AccessEvent> execute(Vehicle vehicle);
}
