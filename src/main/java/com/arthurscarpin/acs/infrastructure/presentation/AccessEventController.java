package com.arthurscarpin.acs.infrastructure.presentation;

import com.arthurscarpin.acs.core.accessevent.domain.AccessEvent;
import com.arthurscarpin.acs.core.accessevent.usecase.GetAccessHistoryUseCase;
import com.arthurscarpin.acs.core.accessevent.usecase.ValidateAccessUseCase;
import com.arthurscarpin.acs.core.pagination.PageInput;
import com.arthurscarpin.acs.core.pagination.PageOutput;
import com.arthurscarpin.acs.infrastructure.mapper.AccessEventMapper;
import com.arthurscarpin.acs.infrastructure.presentation.request.AccessEventRequest;
import com.arthurscarpin.acs.infrastructure.presentation.response.AccessEventResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/access-events")
@RequiredArgsConstructor
public class AccessEventController {

    private final ValidateAccessUseCase validateAccessUseCase;

    private final GetAccessHistoryUseCase getAccessHistoryUseCase;

    private final AccessEventMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AccessEventResponse save(@Valid @RequestBody AccessEventRequest request) {
        AccessEvent domain = mapper.fromRequestToDomain(request);
        return mapper.fromDomainToResponse(validateAccessUseCase.execute(domain));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<AccessEventResponse> findAll(
            @RequestParam(required = false) String plate,
            @RequestParam(required = false) Instant from,
            @RequestParam(required = false) Instant to,
            Pageable pageable
    ) {
        PageInput pageInput = new PageInput(pageable.getPageNumber(), pageable.getPageSize(), plate, from, to);
        PageOutput<AccessEvent> response = getAccessHistoryUseCase.execute(pageInput);
        List<AccessEventResponse> content = response.content().stream().map(mapper::fromDomainToResponse).toList();
        return new PageImpl<>(content, pageable, response.totalElements());
    }
}
