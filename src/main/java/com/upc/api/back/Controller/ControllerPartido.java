package com.upc.api.back.Controller;

import com.upc.api.back.DTO.PartidoDTO;
import com.upc.api.back.DTO.marcEquipoRecaudacionDTO;
import com.upc.api.back.Interfaces.InterfaceEquipo;
import com.upc.api.back.Interfaces.InterfacePartido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200",
        allowCredentials = "true",
        exposedHeaders = "Authorization")
@RequestMapping("/api")
public class ControllerPartido {
    @Autowired
    private InterfacePartido interfacePartido;

    @GetMapping("/partidos")
    public List<PartidoDTO> getPartidos() {
        return interfacePartido.listPartidos();
    }

    @PostMapping("/partido")
    public PartidoDTO addPartido(@RequestBody PartidoDTO partidoDTO) {
        return interfacePartido.insertPartido(partidoDTO);
    }

    @GetMapping("/equiposRecaudacion")
    public List<marcEquipoRecaudacionDTO> obtenerRecaudacionPorEquipo() {
        return interfacePartido.obtenerRecaudacionPorEquipo();
    }

}
