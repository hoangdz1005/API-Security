package com.apisecurity.JWT.repository;

import com.apisecurity.JWT.model.ERole;
import com.apisecurity.JWT.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
