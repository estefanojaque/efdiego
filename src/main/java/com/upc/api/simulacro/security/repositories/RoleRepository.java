package com.upc.api.simulacro.security.repositories;

import com.upc.api.simulacro.security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role, Long> {
}
