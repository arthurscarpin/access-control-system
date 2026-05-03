package com.arthurscarpin.acs.infrastructure.presentation.response;

import com.arthurscarpin.acs.core.owner.domain.DocumentType;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

public record OwnerResponse(

        @Schema(description = "Unique identifier of the owner", example = "550e8400-e29b-41d4-a716-446655440010")
        UUID id,

        @Schema(description = "Owner full name", example = "Cristiano Ronaldo")
        String name,

        @Schema(description = "Owner document number", example = "12549884614")
        String document,

        @Schema(description = "Type of document", example = "CPF")
        DocumentType documentType,

        @Schema(description = "Owner email address", example = "cristiano.ronaldo@email.com")
        String email
) {
}