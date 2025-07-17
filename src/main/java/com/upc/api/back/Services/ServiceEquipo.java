package com.upc.api.back.Services;

import com.upc.api.back.DTO.EquipoDTO;
import com.upc.api.back.Entities.Equipo;
import com.upc.api.back.Interfaces.InterfaceEquipo;
import com.upc.api.back.Repositories.RepositoryEquipo;
import com.upc.api.back.Repositories.RepositoryPartido;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceEquipo implements InterfaceEquipo {

    @Autowired
    private RepositoryEquipo repoEquipo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<EquipoDTO> listaEquipo() {
        return repoEquipo.findAll().stream().map(x -> modelMapper.map(x, EquipoDTO.class)).collect(Collectors.toList());
    }

    @Override
    public EquipoDTO insertEquipo(EquipoDTO equipo) {
        Equipo equipoAux = modelMapper.map(equipo, Equipo.class);
        equipoAux = repoEquipo.save(equipoAux);
        return modelMapper.map(equipoAux, EquipoDTO.class);
    }
}
