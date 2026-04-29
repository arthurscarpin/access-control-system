package com.arthurscarpin.acs.core.owner.domain;

import com.arthurscarpin.acs.core.owner.exception.DocumentInvalidException;

public record CPF(String value) implements Document {

    public CPF {
        value = DocumentUtils.normalize(value);

        if (value.isBlank()) {
            throw new DocumentInvalidException("Document cannot be null or blank");
        }

        if (value.length() != 11) {
            throw new DocumentInvalidException("Document must have 11 digits");
        }
    }
}
