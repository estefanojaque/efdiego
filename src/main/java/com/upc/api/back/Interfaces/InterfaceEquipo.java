package com.upc.api.back.Interfaces;

import com.upc.api.back.DTO.EquipoDTO;
import com.upc.api.back.Entities.Equipo;

import java.util.List;

public interface InterfaceEquipo {
    public List<EquipoDTO> listaEquipo();
    public EquipoDTO insertEquipo(EquipoDTO equipo);

}
