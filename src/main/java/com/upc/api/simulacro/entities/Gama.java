package com.upc.api.simulacro.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Gama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long g5id_gama;

    private String g5name;
}
