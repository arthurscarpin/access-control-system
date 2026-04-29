package com.arthurscarpin.acs.infrastructure.presentation;

import com.arthurscarpin.acs.core.owner.domain.Owner;
import com.arthurscarpin.acs.core.owner.usecase.RegisterOwnerUseCase;
import com.arthurscarpin.acs.infrastructure.presentation.request.OwnerRequest;
import com.arthurscarpin.acs.infrastructure.presentation.response.OwnerResponse;
import com.arthurscarpin.acs.infrastructure.mapper.OwnerMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/owners")
@RequiredArgsConstructor
public class OwnerController {

    private final RegisterOwnerUseCase registerOwnerUseCase;

    private final OwnerMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OwnerResponse save(@Valid @RequestBody OwnerRequest request) {
        Owner domain = mapper.fromRequestToDomain(request);
        return mapper.fromDomainToResponse(registerOwnerUseCase.execute(domain));
    }
}
