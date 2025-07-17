package com.upc.api.back.Interfaces;

import com.upc.api.back.DTO.PartidoDTO;
import com.upc.api.back.DTO.marcEquipoRecaudacionDTO;
import com.upc.api.back.Entities.Equipo;

import java.util.List;

public interface InterfacePartido {
    public List<PartidoDTO> listPartidos();
    public PartidoDTO insertPartido(PartidoDTO partido);
    public List<marcEquipoRecaudacionDTO> obtenerRecaudacionPorEquipo();
}
