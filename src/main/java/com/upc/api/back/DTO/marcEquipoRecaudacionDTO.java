package com.upc.api.back.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class marcEquipoRecaudacionDTO {

    private String marcNombreEquipo;
    private Double marcTotalRecaudado;
}
