package com.kashmir.reservas.Entidades;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Builder
public class Banda {
    private Long id;
    private String nombre;
    private String contacto;
    /*Asociacion integrantes de banda y caka*/
}
