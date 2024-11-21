package com.upc.api.simulacro.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SumDTO {
    private double total; // total de precios
    private String name; // nombre de la gama
}
