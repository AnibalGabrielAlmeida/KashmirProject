package com.kashmir.reservas.Entidades;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Builder
@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fechaHora")
    private LocalDateTime fechaHora;
    @Column(name = "duracion")
    private int duracion;


}
