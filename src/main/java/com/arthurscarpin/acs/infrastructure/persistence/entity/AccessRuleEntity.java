package com.arthurscarpin.acs.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "access_rule")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AccessRuleEntity {

    private static final long serialVersionUUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id", nullable = false)
    private VehicleEntity vehicle;

    @Column(nullable = false)
    private boolean allowed;
}
