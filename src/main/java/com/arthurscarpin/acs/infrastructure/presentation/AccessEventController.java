package com.arthurscarpin.acs.infrastructure.presentation;

import com.arthurscarpin.acs.core.accessevent.domain.AccessEvent;
import com.arthurscarpin.acs.core.accessevent.gateway.AccessEventGateway;
import com.arthurscarpin.acs.infrastructure.mapper.AccessEventMapper;
import com.arthurscarpin.acs.infrastructure.presentation.request.AccessEventRequest;
import com.arthurscarpin.acs.infrastructure.presentation.response.AccessEventResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/access-events")
@RequiredArgsConstructor
public class AccessEventController {

    private final AccessEventGateway gateway;

    private final AccessEventMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AccessEventResponse save(@Valid @RequestBody AccessEventRequest request) {
        AccessEvent domain = mapper.fromRequestToDomain(request);
        return mapper.fromDomainToResponse(gateway.save(domain));
    }
}
