package com.kashmir.reservas.Entidades;

import lombok.*;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Builder
public class VentaBebidas {
    private Long id;
    private LocalDateTime fecha;
    private int cantidad;
    /*asociacion bebida y caja*/
}
