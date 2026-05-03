package com.arthurscarpin.acs.infrastructure.presentation.response;

import com.arthurscarpin.acs.core.accessevent.domain.AccessResult;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.OffsetDateTime;
import java.util.UUID;

public record AccessEventResponse(

        @Schema(description = "Unique identifier of the access event", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID id,

        @Schema(description = "Vehicle plate", example = "ABC-1234")
        String plate,

        @Schema(description = "Timestamp of the access event", example = "2023-10-01T10:00:00Z")
        OffsetDateTime timestamp,

        @Schema(description = "Direction of the vehicle", example = "IN")
        String direction,

        @Schema(description = "Result of the access validation", example = "AUTHORIZED")
        AccessResult result
) {
}