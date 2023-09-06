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
public class VentaBebidas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha")
    private LocalDateTime fecha;
    @Column(name = "cantidad")
    private int cantidad;
    /*asociacion bebida y caja*/
}
