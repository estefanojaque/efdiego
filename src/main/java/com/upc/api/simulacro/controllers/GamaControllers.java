package com.upc.api.simulacro.controllers;

import com.upc.api.simulacro.dtos.GamaDTO;
import com.upc.api.simulacro.entities.Gama;
import com.upc.api.simulacro.services.GamaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "Authorization")

@RequestMapping("/api")
public class GamaControllers {
    @Autowired
    private GamaService gamaService;

    @GetMapping("/gamas")
    @PreAuthorize("hasRole('ADMIN')")
    public List<GamaDTO> listagamas(){
        List<Gama> gamas = gamaService.listarGamas();
        ModelMapper modelMapper = new ModelMapper();
        return gamas.stream()
                .map(gama -> modelMapper.map(gama, GamaDTO.class))
                .collect(Collectors.toList());

    }

    @PostMapping("/gama")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<GamaDTO> incertargama(@RequestBody GamaDTO gamaDTO){
        ModelMapper modelMapper = new ModelMapper();
        Gama gama = modelMapper.map(gamaDTO, Gama.class);
        gama = gamaService.insertarGama(gama);
        gamaDTO = modelMapper.map(gama, GamaDTO.class);
        return ResponseEntity.ok(gamaDTO);
    }
    @PutMapping("/gama")
    public ResponseEntity<GamaDTO> editarGama(@RequestBody GamaDTO gamaDTO){
        ModelMapper modelMapper = new ModelMapper();
        Gama gama = modelMapper.map(gamaDTO, Gama.class);
        gama = gamaService.modificarGama(gama);
        gamaDTO = modelMapper.map(gama, GamaDTO.class);
        return ResponseEntity.ok(gamaDTO);
    }
    @DeleteMapping("/gama/{id}")

    public void eliminarGama(@PathVariable long id) {
        gamaService.eliminarGama(id);
    }

    @GetMapping("/gama/{id}")
    public ResponseEntity<GamaDTO> buscarGama(@PathVariable long id){
        ModelMapper modelMapper = new ModelMapper();
        Gama gama = gamaService.buscarGamaPorId(id);
        GamaDTO gamaDTO = modelMapper.map(gama, GamaDTO.class);
        return ResponseEntity.ok(gamaDTO);
    }
}
