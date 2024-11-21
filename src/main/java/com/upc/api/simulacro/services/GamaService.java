package com.upc.api.simulacro.services;

import com.upc.api.simulacro.entities.Gama;

import java.util.List;

public interface GamaService {
    public Gama insertarGama(Gama gama);
    public void eliminarGama(Long id);
    public Gama modificarGama(Gama gama);
    public List<Gama> listarGamas();
    public Gama buscarGamaPorId(long id);
}
