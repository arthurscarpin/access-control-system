package com.arthurscarpin.acs.infrastructure.presentation.request;

import com.arthurscarpin.acs.core.owner.domain.DocumentType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record OwnerRequest(
        @NotBlank
        @Size(min = 3, max = 100)
        String name,

        @NotBlank
        @Size(min = 9, max = 20)
        String document,

        @NotNull
        DocumentType documentType,

        @NotBlank
        @Email
        String email
) {
}
