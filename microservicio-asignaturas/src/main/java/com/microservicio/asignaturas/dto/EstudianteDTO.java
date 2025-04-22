package com.microservicio.asignaturas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteDTO {
    private String nombre;
    private String apellido;
    private String email;
    private Long asignaturaId;
}
