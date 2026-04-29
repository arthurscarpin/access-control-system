package com.arthurscarpin.acs.infrastructure.presentation;

import com.arthurscarpin.acs.core.vehicle.domain.Vehicle;
import com.arthurscarpin.acs.core.vehicle.usecase.RegisterVehicleUseCase;
import com.arthurscarpin.acs.core.vehicle.usecase.UpdateVehicleStatusUseCase;
import com.arthurscarpin.acs.infrastructure.mapper.VehicleMapper;
import com.arthurscarpin.acs.infrastructure.presentation.request.VehicleRequest;
import com.arthurscarpin.acs.infrastructure.presentation.response.VehicleResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
public class VehicleController {

    private final RegisterVehicleUseCase registerVehicleUseCase;

    private final UpdateVehicleStatusUseCase updateVehicleStatusUseCase;

    private final VehicleMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VehicleResponse save(@Valid @RequestBody VehicleRequest request) {
        Vehicle domain = mapper.fromRequestToDomain(request);
        return mapper.fromDomainToResponse(registerVehicleUseCase.execute(domain));
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public VehicleResponse findById(@PathVariable UUID id) {
        Vehicle domain = updateVehicleStatusUseCase.execute(id);
        return mapper.fromDomainToResponse(domain);
    }
}
