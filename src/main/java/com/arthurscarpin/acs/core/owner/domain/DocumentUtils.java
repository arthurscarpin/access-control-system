package com.arthurscarpin.acs.core.owner.domain;

import com.arthurscarpin.acs.core.owner.exception.DocumentInvalidException;

public final class DocumentUtils {

    private DocumentUtils() {}

    public static String normalize(String value) {
        if (value == null || value.isBlank()) {
            throw new DocumentInvalidException("Document cannot be null or blank");
        }
        return value.replaceAll("\\D", "");
    }
}