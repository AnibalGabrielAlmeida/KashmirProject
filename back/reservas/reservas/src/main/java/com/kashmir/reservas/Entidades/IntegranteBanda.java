package com.kashmir.reservas.Entidades;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Builder
public class IntegranteBanda {
    private Long id;
    private String nombre;
    /*asociacion a banda y caja*/
}
