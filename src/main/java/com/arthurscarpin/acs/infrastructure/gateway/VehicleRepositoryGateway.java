package com.arthurscarpin.acs.infrastructure.gateway;

import com.arthurscarpin.acs.core.entity.Vehicle;
import com.arthurscarpin.acs.core.gateway.VehicleGateway;
import com.arthurscarpin.acs.infrastructure.persistence.entity.VehicleEntity;
import com.arthurscarpin.acs.infrastructure.mapper.VehicleMapper;
import com.arthurscarpin.acs.infrastructure.persistence.repository.VehicleRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VehicleRepositoryGateway implements VehicleGateway {

    private final VehicleRepository repository;

    private final VehicleMapper mapper;

    @Override
    public boolean existsByPlate(String plate) {
        return repository.existsByPlate(plate);
    }

    @Transactional
    @Override
    public Vehicle save(Vehicle vehicle) {
        VehicleEntity entity = mapper.toEntity(vehicle);
        return mapper.toDomain(repository.save(entity));
    }
}
