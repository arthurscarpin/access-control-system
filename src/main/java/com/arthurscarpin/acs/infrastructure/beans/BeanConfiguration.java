package com.arthurscarpin.acs.infrastructure.beans;

import com.arthurscarpin.acs.core.accessevent.gateway.AccessEventGateway;
import com.arthurscarpin.acs.core.accessevent.usecase.ValidateAccessUseCase;
import com.arthurscarpin.acs.core.accessevent.usecase.ValidateAccessUseCaseImpl;
import com.arthurscarpin.acs.core.owner.gateway.OwnerGateway;
import com.arthurscarpin.acs.core.owner.usecase.RegisterOwnerImpl;
import com.arthurscarpin.acs.core.owner.usecase.RegisterOwnerUseCase;
import com.arthurscarpin.acs.core.vehicle.gateway.VehicleGateway;
import com.arthurscarpin.acs.core.vehicle.usecase.RegisterVehicleUseCase;
import com.arthurscarpin.acs.core.vehicle.usecase.RegisterVehicleUseCaseImpl;
import com.arthurscarpin.acs.core.vehicle.usecase.UpdateVehicleStatusUseCase;
import com.arthurscarpin.acs.core.vehicle.usecase.UpdateVehicleStatusUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public RegisterVehicleUseCase registerVehicleUseCase(VehicleGateway vehicleGateway, OwnerGateway ownerGateway) {
        return new RegisterVehicleUseCaseImpl(vehicleGateway, ownerGateway);
    }

    @Bean
    public RegisterOwnerUseCase registerOwnerUseCase(OwnerGateway ownerGateway) {
        return new RegisterOwnerImpl(ownerGateway);
    }

    @Bean
    public UpdateVehicleStatusUseCase updateVehicleStatusUseCase(VehicleGateway vehicleGateway) {
        return new UpdateVehicleStatusUseCaseImpl(vehicleGateway);
    }

    @Bean
    public ValidateAccessUseCase validateAccessUseCase(VehicleGateway vehicleGateway, AccessEventGateway accessEventGateway) {
        return new ValidateAccessUseCaseImpl(vehicleGateway, accessEventGateway);
    }
}
