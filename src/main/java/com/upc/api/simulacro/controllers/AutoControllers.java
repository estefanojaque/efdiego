package com.upc.api.simulacro.controllers;

import com.upc.api.simulacro.dtos.AutoDTO;
import com.upc.api.simulacro.dtos.CountDTO;
import com.upc.api.simulacro.dtos.SumDTO;
import com.upc.api.simulacro.entities.Auto;
import com.upc.api.simulacro.services.AutoService;
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
public class AutoControllers {
    @Autowired
    private AutoService autoService;
    @GetMapping("/Autos")
    public List<AutoDTO> listarAutos() {
        List<Auto> autos = autoService.listarAutos();
        ModelMapper modelMapper = new ModelMapper();
        return autos.stream()
                .map(auto -> modelMapper.map(auto, AutoDTO.class))
                .collect(Collectors.toList());
    }

    @PostMapping("/Auto")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<AutoDTO> InsertarAuto(@RequestBody AutoDTO autoDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Auto auto = modelMapper.map(autoDTO, Auto.class);
        auto = autoService.insertarAuto(auto);
        autoDTO = modelMapper.map(auto, AutoDTO.class);
        return ResponseEntity.ok(autoDTO);
    }
    @PutMapping("/Auto")
    public ResponseEntity<AutoDTO>  editarAuto(@RequestBody AutoDTO autoDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Auto auto = modelMapper.map(autoDTO, Auto.class);
        auto = autoService.modificarAuto(auto);
        autoDTO = modelMapper.map(auto, AutoDTO.class);
        return ResponseEntity.ok(autoDTO);
    }
    @DeleteMapping("/Auto/{id}")
    public void eliminarProveedor(@PathVariable long id) {
        autoService.eliminarAuto(id);
    }
    @GetMapping("/Auto/{id}")
    public ResponseEntity<AutoDTO> buscaProveedor(@PathVariable long id) {
        ModelMapper modelMapper = new ModelMapper();
        Auto auto = autoService.buscarAutoPorId(id);
        AutoDTO autoDTO = modelMapper.map(auto, AutoDTO.class);
        return ResponseEntity.ok(autoDTO);
    }

    @GetMapping("/listSum")
    @PreAuthorize("hasRole('ADMIN')")
    public List<SumDTO> listSumprices(){
        return autoService.listSumGama();
    }

    @GetMapping("/listCount")
    @PreAuthorize("hasRole('ADMIN')")
    public List<CountDTO> listCountautos(){
        return autoService.listCountAutosGama();
    }

}
