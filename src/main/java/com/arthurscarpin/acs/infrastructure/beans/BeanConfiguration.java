package com.arthurscarpin.acs.infrastructure.beans;

import com.arthurscarpin.acs.core.gateway.OwnerGateway;
import com.arthurscarpin.acs.core.gateway.VehicleGateway;
import com.arthurscarpin.acs.core.usecases.registervehicle.RegisterVehicleUseCase;
import com.arthurscarpin.acs.core.usecases.registervehicle.RegisterVehicleUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public RegisterVehicleUseCase registerVehicleUseCase(VehicleGateway vehicleGateway, OwnerGateway ownerGateway) {
        return new RegisterVehicleUseCaseImpl(vehicleGateway, ownerGateway);
    }
}
