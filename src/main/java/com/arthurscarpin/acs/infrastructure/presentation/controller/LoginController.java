package com.arthurscarpin.acs.infrastructure.presentation.controller;

import com.arthurscarpin.acs.core.user.domain.User;
import com.arthurscarpin.acs.core.user.usecase.LoginUserUseCase;
import com.arthurscarpin.acs.infrastructure.mapper.LoginMapper;
import com.arthurscarpin.acs.infrastructure.presentation.request.LoginRequest;
import com.arthurscarpin.acs.infrastructure.presentation.response.LoginResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginUserUseCase loginUserUseCase;

    private final LoginMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public LoginResponse login(@Valid @RequestBody LoginRequest request) {
        User domain = mapper.fromRequestToDomain(request);
        Object[] response = loginUserUseCase.execute(domain);
        return new LoginResponse((String) response[0], (Long) response[1]);
    }
}
