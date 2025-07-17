package com.upc.api.back.security.repositories;

import com.upc.api.back.security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role, Long> {
}
