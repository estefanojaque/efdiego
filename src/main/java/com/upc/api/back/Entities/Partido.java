package com.upc.api.back.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long marcId;

    private String marcResultado;

    private String marcTemporada;

    private LocalDate marcFecha;

    private double marcMontoInvertido;

    private double marcMontoRecaudado;

    @ManyToOne
    private Equipo marcEquipo;
}
