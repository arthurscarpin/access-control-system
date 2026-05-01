package com.arthurscarpin.acs.core.user.gateway;

import com.arthurscarpin.acs.core.user.domain.User;

public interface UserGateway {

    boolean existsByEmail(String email);

    User save(User user);
}
