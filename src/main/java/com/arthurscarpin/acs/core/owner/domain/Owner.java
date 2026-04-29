package com.arthurscarpin.acs.core.owner.entity;

import com.arthurscarpin.acs.core.owner.enums.DocumentType;

import java.util.UUID;

public record Owner(
        UUID id,
        String name,
        String document,
        DocumentType documentType,
        String email
) {
}
