package com.arthurscarpin.acs.infrastructure.presentation;

import com.arthurscarpin.acs.core.entity.Vehicle;
import com.arthurscarpin.acs.core.usecases.registervehicle.RegisterVehicleRequest;
import com.arthurscarpin.acs.core.usecases.registervehicle.RegisterVehicleUseCase;
import com.arthurscarpin.acs.infrastructure.mapper.VehicleMapper;
import com.arthurscarpin.acs.infrastructure.dto.request.VehicleRequest;
import com.arthurscarpin.acs.infrastructure.dto.response.VehicleResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
public class VehicleController {

    private final RegisterVehicleUseCase registerVehicleUseCase;

    private final VehicleMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VehicleResponse save(@Valid @RequestBody VehicleRequest request) {
        RegisterVehicleRequest registerVehicleRequest = mapper.toRequest(request);
        Vehicle vehicle = registerVehicleUseCase.execute(registerVehicleRequest);
        return mapper.toResponse(vehicle);
    }
}
