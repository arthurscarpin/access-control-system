package com.arthurscarpin.acs.core.usecases.registervehicle;

import com.arthurscarpin.acs.core.entity.Vehicle;
import com.arthurscarpin.acs.core.enums.VehicleStatus;
import com.arthurscarpin.acs.core.exception.DuplicateLicensePlateException;
import com.arthurscarpin.acs.core.exception.ResourceNotFoundException;
import com.arthurscarpin.acs.core.owner.gateway.OwnerGateway;
import com.arthurscarpin.acs.core.gateway.VehicleGateway;
import com.arthurscarpin.acs.core.usecases.registervehicle.normalization.PlateNormalization;

public class RegisterVehicleUseCaseImpl implements RegisterVehicleUseCase {

    private final VehicleGateway vehicleGateway;

    private final OwnerGateway ownerGateway;

    public RegisterVehicleUseCaseImpl(VehicleGateway vehicleGateway, OwnerGateway ownerGateway) {
        this.vehicleGateway = vehicleGateway;
        this.ownerGateway = ownerGateway;
    }

    @Override
    public Vehicle execute(RegisterVehicleRequest request) {
        PlateNormalization plateNormalizationNormalized = new PlateNormalization(request.plate());

        if (vehicleGateway.existsByPlate(plateNormalizationNormalized.plate())) {
            throw new DuplicateLicensePlateException("Vehicle with plate " + plateNormalizationNormalized.plate() + " already exists.");
        }

        if (!ownerGateway.existsById(request.ownerId())) {
            throw new ResourceNotFoundException("Owner with id " + request.ownerId() + " does not exist.");
        }

        Vehicle vehicle = new Vehicle(
                null,
                plateNormalizationNormalized.plate(),
                request.model(),
                VehicleStatus.ACTIVE,
                request.ownerId()
        );
        return vehicleGateway.save(vehicle);
    }
}
