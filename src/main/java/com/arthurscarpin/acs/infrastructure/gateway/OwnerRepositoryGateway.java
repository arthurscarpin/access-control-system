package com.arthurscarpin.acs.infrastructure.gateway;

import com.arthurscarpin.acs.core.gateway.OwnerGateway;
import com.arthurscarpin.acs.infrastructure.persistence.repository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class OwnerRepositoryGateway implements OwnerGateway {

    private final OwnerRepository repository;

    @Override
    public boolean existsById(UUID id) {
        return repository.existsById(id);
    }
}
