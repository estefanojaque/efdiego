package com.upc.api.back.Repositories;

import com.upc.api.back.DTO.PartidoDTO;
import com.upc.api.back.DTO.marcEquipoRecaudacionDTO;
import com.upc.api.back.Entities.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryPartido extends JpaRepository<Partido, Long> {

    @Query("SELECT new com.upc.api.back.DTO.marcEquipoRecaudacionDTO(e.marcNombre,SUM(p.marcMontoRecaudado)) " +
            "FROM Partido p " +
            "JOIN p.marcEquipo e " +
            "GROUP BY e.marcNombre " +
            "ORDER BY SUM(p.marcMontoRecaudado) DESC")
    List<marcEquipoRecaudacionDTO> obtenerRecaudacionPorEquipo();
}
