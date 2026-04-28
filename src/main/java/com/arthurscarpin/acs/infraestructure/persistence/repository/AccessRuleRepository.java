package com.arthurscarpin.acs.infraestructure.persistence.repository;

import com.arthurscarpin.acs.infraestructure.persistence.entity.AccessRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccessRuleRepository extends JpaRepository<AccessRule, UUID> {
}
