package com.upc.api.simulacro.services;

import com.upc.api.simulacro.dtos.CountDTO;
import com.upc.api.simulacro.dtos.SumDTO;
import com.upc.api.simulacro.entities.Auto;

import java.util.List;

public interface AutoService {
    public Auto insertarAuto(Auto auto);
    public void eliminarAuto(Long id);
    public Auto modificarAuto(Auto auto);
    public List<Auto> listarAutos();
    public Auto buscarAutoPorId(long id);
    public List<SumDTO> listSumGama();
    public List<CountDTO> listCountAutosGama();


}
