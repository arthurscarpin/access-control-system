package com.arthurscarpin.acs.core.usecases.registervehicle;

import com.arthurscarpin.acs.core.entity.Vehicle;
import com.arthurscarpin.acs.core.enums.VehicleStatus;
import com.arthurscarpin.acs.core.exception.DuplicateLicensePlateException;
import com.arthurscarpin.acs.core.exception.ResourceNotFoundException;
import com.arthurscarpin.acs.core.gateway.OwnerGateway;
import com.arthurscarpin.acs.core.gateway.VehicleGateway;
import com.arthurscarpin.acs.core.model.LicensePlate;

public class RegisterVehicleUseCaseImpl implements RegisterVehicleUseCase {

    private final VehicleGateway vehicleGateway;

    private final OwnerGateway ownerGateway;

    public RegisterVehicleUseCaseImpl(VehicleGateway vehicleGateway, OwnerGateway ownerGateway) {
        this.vehicleGateway = vehicleGateway;
        this.ownerGateway = ownerGateway;
    }

    @Override
    public Vehicle execute(RegisterVehicleRequest request) {
        LicensePlate plateNormalized = new LicensePlate(request.plate());

        if (vehicleGateway.existsByPlate(plateNormalized.plate())) {
            throw new DuplicateLicensePlateException("Vehicle with plate " + plateNormalized.plate() + " already exists.");
        }

        if (!ownerGateway.existsById(request.ownerId())) {
            throw new ResourceNotFoundException("Owner with id " + request.ownerId() + " does not exist.");
        }

        Vehicle vehicle = new Vehicle(
                null,
                plateNormalized.plate(),
                request.model(),
                VehicleStatus.ACTIVE,
                request.ownerId()
        );
        return vehicleGateway.save(vehicle);
    }
}
