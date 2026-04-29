package com.arthurscarpin.acs.core.vehicle.usecase;

import com.arthurscarpin.acs.core.owner.domain.Owner;
import com.arthurscarpin.acs.core.vehicle.domain.Vehicle;
import com.arthurscarpin.acs.core.vehicle.domain.VehicleStatus;
import com.arthurscarpin.acs.core.vehicle.exception.PlateDuplicateException;
import com.arthurscarpin.acs.core.owner.exception.OwnerNotFoundException;
import com.arthurscarpin.acs.core.owner.gateway.OwnerGateway;
import com.arthurscarpin.acs.core.vehicle.gateway.VehicleGateway;
import com.arthurscarpin.acs.core.vehicle.domain.Plate;

public class RegisterVehicleUseCaseImpl implements RegisterVehicleUseCase {

    private final VehicleGateway vehicleGateway;

    private final OwnerGateway ownerGateway;

    public RegisterVehicleUseCaseImpl(VehicleGateway vehicleGateway, OwnerGateway ownerGateway) {
        this.vehicleGateway = vehicleGateway;
        this.ownerGateway = ownerGateway;
    }

    @Override
    public Vehicle execute(Vehicle vehicle) {
        Plate plate = new Plate(vehicle.plate());

        if (vehicleGateway.findByPlate(plate.plate()).isPresent()) {
            throw new PlateDuplicateException("Plate already exists");
        }

        Owner owner = ownerGateway.findById(vehicle.ownerId())
                .orElseThrow(() -> new OwnerNotFoundException("Owner not found"));

        Vehicle vehicleToSave = new Vehicle(
                vehicle.id(),
                plate.plate(),
                vehicle.model(),
                VehicleStatus.ACTIVE,
                owner.id()
        );

        return vehicleGateway.save(vehicleToSave);
    }
}
