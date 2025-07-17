package com.upc.api.back.Services;

import com.upc.api.back.DTO.PartidoDTO;
import com.upc.api.back.DTO.marcEquipoRecaudacionDTO;
import com.upc.api.back.Entities.Partido;
import com.upc.api.back.Interfaces.InterfacePartido;
import com.upc.api.back.Repositories.RepositoryPartido;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicePartido implements InterfacePartido {

    @Autowired
    private RepositoryPartido repoPartido;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<PartidoDTO> listPartidos() {
        return repoPartido.findAll().stream().map(x -> modelMapper.map(x, PartidoDTO.class)).collect(Collectors.toList());
    }

    @Override
    public PartidoDTO insertPartido(PartidoDTO partido) {
        Partido partido1 = modelMapper.map(partido, Partido.class);
        Partido partido2 = repoPartido.save(partido1);
        return modelMapper.map(partido2, PartidoDTO.class);
    }

    @Override
    public List<marcEquipoRecaudacionDTO> obtenerRecaudacionPorEquipo() {
        return modelMapper.map(repoPartido.obtenerRecaudacionPorEquipo(), List.class);
    }
}
