package com.kashmir.reservas.Entidades;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Builder
public class Bebidas {
    private Long id;
    private String marca;
    private int precio;
    private String tipo;
}
