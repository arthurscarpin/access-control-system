package com.arthurscarpin.acs.infraestructure.persistence.entity;

import com.arthurscarpin.acs.core.enums.AccessResult;
import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "access_event")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AccessEvent {

    private static final long serialVersionUUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String plate;

    @Column(nullable = false)
    private OffsetDateTime timestamp;

    @Column(nullable = false)
    private String direction;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccessResult result;
}
