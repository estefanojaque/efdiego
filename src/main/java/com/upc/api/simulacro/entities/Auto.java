package com.upc.api.simulacro.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long g5id;
    private String g5placanumber;
    private String g5brand;
    private String g5model;
    private LocalDate g5datefabrication;
    private float g5price;
    @ManyToOne
    @JoinColumn(name = "gama_id")
    private Gama gama;

}

