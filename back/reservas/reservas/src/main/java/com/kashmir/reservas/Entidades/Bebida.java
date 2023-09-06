package com.kashmir.reservas.Entidades;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Builder
@Entity
public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "marca", nullable = false)
    private String marca;
    @Column(name = "precio", nullable = false)
    private int precio;
    @Column(name = "tipo")
    private String tipo;
}
