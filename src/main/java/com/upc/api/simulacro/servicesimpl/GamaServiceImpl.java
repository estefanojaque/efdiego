package com.upc.api.simulacro.servicesimpl;

import com.upc.api.simulacro.entities.Gama;
import com.upc.api.simulacro.repositories.GamaRepository;
import com.upc.api.simulacro.services.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class GamaServiceImpl implements GamaService {
    @Autowired
    private GamaRepository gamaRepository;

    @Override
    public Gama insertarGama(Gama gama) {
        return gamaRepository.save(gama);
    }

    @Override
    public void eliminarGama(Long id) {
        if (gamaRepository.existsById(id)) {
            gamaRepository.deleteById(id);
        }

    }

    @Override
    public Gama modificarGama(Gama gama) {
        if(gamaRepository.findById(gama.getG5id_gama()).isPresent()){
            return gamaRepository.save(gama);
        }
        return null;
    }

    @Override
    public List<Gama> listarGamas() {
        return gamaRepository.findAll();
    }

    @Override
    public Gama buscarGamaPorId(long id) {
        if(gamaRepository.findById(id).isPresent()){
            return gamaRepository.findById(id).get();
        }
        return null;
    }
}
