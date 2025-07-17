package com.upc.api.back.Repositories;

import com.upc.api.back.Entities.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEquipo extends JpaRepository<Equipo, Long> {

}
