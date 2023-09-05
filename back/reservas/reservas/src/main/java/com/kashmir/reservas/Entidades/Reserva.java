package com.kashmir.reservas.Entidades;

import lombok.*;


import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Builder
public class Reserva {
    private Long id;
    private LocalDateTime fechaHora;
    private int duracion;


}
