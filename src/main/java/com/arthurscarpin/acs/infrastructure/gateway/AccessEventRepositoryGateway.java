package com.arthurscarpin.acs.infrastructure.gateway;

import com.arthurscarpin.acs.core.accessevent.domain.AccessEvent;
import com.arthurscarpin.acs.core.accessevent.gateway.AccessEventGateway;
import com.arthurscarpin.acs.infrastructure.mapper.AccessEventMapper;
import com.arthurscarpin.acs.infrastructure.persistence.entity.AccessEventEntity;
import com.arthurscarpin.acs.infrastructure.persistence.repository.AccessEventRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccessEventRepositoryGateway implements AccessEventGateway {

    private final AccessEventRepository repository;

    private final AccessEventMapper mapper;

    @Transactional
    @Override
    public AccessEvent save(AccessEvent domain) {
        AccessEventEntity entity = mapper.fromDomainToEntity(domain);
        return mapper.fromEntityToDomain(repository.save(entity));
    }
}
