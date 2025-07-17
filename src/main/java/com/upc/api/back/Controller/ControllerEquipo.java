package com.upc.api.back.Controller;

import com.upc.api.back.DTO.EquipoDTO;
import com.upc.api.back.Entities.Equipo;
import com.upc.api.back.Interfaces.InterfaceEquipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200",
        allowCredentials = "true",
        exposedHeaders = "Authorization")
@RequestMapping("/api")
public class ControllerEquipo {
    @Autowired
    private InterfaceEquipo interfaceEquipo;

    @GetMapping("/equipos")
    public List<EquipoDTO> getEquipos() {
        return interfaceEquipo.listaEquipo();
    }

    @PostMapping("/equipo")
    public EquipoDTO addEquipo(@RequestBody EquipoDTO equipo) {
        return interfaceEquipo.insertEquipo(equipo);
    }
}
