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
public class Caja {
    @Column(name = "fechaTransaccion")
    private LocalDateTime fechaTransaccion;
    @Column(name = "ingreso")
    private Boolean ingreso=true;
    @Column(name = "monto")
    private int monto;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "banda")
    private String banda;
    /*asociacion reserva, venta de bebidas.*/
}
