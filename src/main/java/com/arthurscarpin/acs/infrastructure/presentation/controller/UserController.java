package com.arthurscarpin.acs.infrastructure.presentation.controller;

import com.arthurscarpin.acs.core.user.domain.User;
import com.arthurscarpin.acs.core.user.usecase.RegisterUserUseCase;
import com.arthurscarpin.acs.infrastructure.mapper.UserMapper;
import com.arthurscarpin.acs.infrastructure.presentation.request.UserRequest;
import com.arthurscarpin.acs.infrastructure.presentation.response.UserResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final RegisterUserUseCase registerUserUseCase;

    private final UserMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse save(@Valid @RequestBody UserRequest request) {
        User domain = mapper.fromRequestToDomain(request);
        return mapper.fromDomainToResponse(registerUserUseCase.execute(domain));
    }
}
