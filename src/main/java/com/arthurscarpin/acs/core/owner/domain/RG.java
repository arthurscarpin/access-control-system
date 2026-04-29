package com.arthurscarpin.acs.core.owner.domain;

import com.arthurscarpin.acs.core.owner.exception.DocumentInvalidException;

public record RG(String value) implements Document {

    public RG {
        value = DocumentUtils.normalize(value);

        if (value.isBlank()) {
            throw new DocumentInvalidException("Document cannot be empty");
        }

        if (value.length() < 7 || value.length() > 10) {
            throw new DocumentInvalidException("Document must be between 7 and 10 digits");
        }
    }
}
