package com.upc.api.simulacro.repositories;

import com.upc.api.simulacro.dtos.CountDTO;
import com.upc.api.simulacro.dtos.SumDTO;
import com.upc.api.simulacro.entities.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AutoRepository extends JpaRepository<Auto, Long> {
    //Cantidad de Autos registrados por gama
    @Query("select new com.upc.api.simulacro.dtos.CountDTO(count(e), e.gama.g5name)from Auto e group by e.gama")
    public List<CountDTO> countAutosGama();

    //Monto Total de precios de Autos registrados por Gama
    @Query("select new com.upc.api.simulacro.dtos.SumDTO(sum(e.g5price), e.gama.g5name) from Auto e group by e.gama")
    public List<SumDTO> sumAutosGama();
}
