package com.arthurscarpin.acs.infrastructure.mapper;

import com.arthurscarpin.acs.core.entity.Vehicle;
import com.arthurscarpin.acs.core.usecases.registervehicle.RegisterVehicleRequest;
import com.arthurscarpin.acs.infrastructure.persistence.entity.OwnerEntity;
import com.arthurscarpin.acs.infrastructure.persistence.entity.VehicleEntity;
import com.arthurscarpin.acs.infrastructure.dto.request.VehicleRequest;
import com.arthurscarpin.acs.infrastructure.dto.response.VehicleResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    @Mapping(target = "owner", source = "ownerId")
    VehicleEntity toEntity(Vehicle vehicle);

    @Mapping(target = "ownerId", source = "owner.id")
    Vehicle toDomain(VehicleEntity entity);

    RegisterVehicleRequest toRequest(VehicleRequest request);

    VehicleResponse toResponse(Vehicle vehicle);

    default OwnerEntity map(UUID ownerId) {
        if (ownerId == null) return null;
        OwnerEntity owner = new OwnerEntity();
        owner.setId(ownerId);
        return owner;
    }

    default UUID map(OwnerEntity owner) {
        return owner != null ? owner.getId() : null;
    }
}
