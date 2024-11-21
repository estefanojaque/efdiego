package com.upc.api.simulacro.dtos;

import com.upc.api.simulacro.entities.Gama;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AutoDTO {
    private Long g5id;
    private String g5placanumber;
    private String g5brand;
    private String g5model;
    private LocalDate g5datefabrication;
    private float g5price;
    private Gama gama;
}
