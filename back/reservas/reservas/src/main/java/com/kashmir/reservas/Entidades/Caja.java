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
    private LocalDateTime fechaTransaccion;
    private Boolean ingreso=true;
    private int monto;
    private String descripcion;
    private String banda;
    /*asociacion reserva, venta de bebidas.*/
}
