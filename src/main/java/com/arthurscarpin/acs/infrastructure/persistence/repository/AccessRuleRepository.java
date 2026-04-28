package com.arthurscarpin.acs.infrastructure.persistence.repository;

import com.arthurscarpin.acs.infrastructure.persistence.entity.AccessRuleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccessRuleRepository extends JpaRepository<AccessRuleEntity, UUID> {
}
