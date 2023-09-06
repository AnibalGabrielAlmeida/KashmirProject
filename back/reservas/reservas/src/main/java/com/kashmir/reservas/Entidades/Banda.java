package com.kashmir.reservas.Entidades;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Builder
@Entity
public class Banda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "contacto", nullable = false)
    private String contacto;
    /*Asociacion integrantes de banda y caka*/
}
