package com.arthurscarpin.acs.infrastructure.presentation.response;

import com.arthurscarpin.acs.core.owner.domain.DocumentType;

import java.util.UUID;

public record OwnerResponse(
        UUID id,
        String name,
        String document,
        DocumentType documentType,
        String email
) {
}
