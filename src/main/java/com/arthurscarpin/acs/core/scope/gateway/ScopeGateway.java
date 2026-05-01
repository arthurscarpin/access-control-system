package com.arthurscarpin.acs.core.scope.gateway;

import java.util.List;
import java.util.UUID;

public interface ScopeGateway {

    List<UUID> findAllIdsByIds(List<UUID> scopes);
}
