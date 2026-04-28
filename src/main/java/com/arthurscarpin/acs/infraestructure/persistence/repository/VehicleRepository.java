package com.arthurscarpin.acs.infraestructure.persistence.repository;

import com.arthurscarpin.acs.infraestructure.persistence.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {
}
