package com.arthurscarpin.acs.core.gateway;

import java.util.UUID;

public interface OwnerGateway {

    boolean existsById(UUID id);
}
