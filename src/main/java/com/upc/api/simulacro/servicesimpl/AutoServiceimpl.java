package com.upc.api.simulacro.servicesimpl;

import com.upc.api.simulacro.dtos.CountDTO;
import com.upc.api.simulacro.dtos.SumDTO;
import com.upc.api.simulacro.entities.Auto;
import com.upc.api.simulacro.repositories.AutoRepository;
import com.upc.api.simulacro.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutoServiceimpl implements AutoService {
    @Autowired
    private AutoRepository autoRepository;

    @Override
    public Auto insertarAuto(Auto auto) {
        return autoRepository.save(auto);
    }

    @Override
    public void eliminarAuto(Long id) {
        if(autoRepository.existsById(id)) {
            autoRepository.deleteById(id);
        }

    }

    @Override
    public Auto modificarAuto(Auto auto) {
        if(autoRepository.findById(auto.getG5id()).isPresent()) {
            return autoRepository.save(auto);
        }
        return null;
    }

    @Override
    public List<Auto> listarAutos() {
        return autoRepository.findAll();    }

    @Override
    public Auto buscarAutoPorId(long id) {
        if(autoRepository.findById(id).isPresent()) {
            return autoRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<SumDTO> listSumGama() {
        return autoRepository.sumAutosGama();
    }

    @Override
    public List<CountDTO> listCountAutosGama() {
        return autoRepository.countAutosGama();
    }


}
