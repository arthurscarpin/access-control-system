package com.arthurscarpin.acs.core.accessevent.gateway;

import com.arthurscarpin.acs.core.accessevent.domain.AccessEvent;

public interface AccessEventGateway {

    AccessEvent save(AccessEvent accessEvent);
}
