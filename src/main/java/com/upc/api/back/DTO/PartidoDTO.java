package com.upc.api.back.DTO;

import com.upc.api.back.Entities.Equipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PartidoDTO {
    private Long marcId;
    private String marcResultado;
    private String marcTemporada;
    private LocalDate marcFecha;
    private double marcMontoInvertido;
    private double marcMontoRecaudado;
    private Equipo marcEquipo;

}
