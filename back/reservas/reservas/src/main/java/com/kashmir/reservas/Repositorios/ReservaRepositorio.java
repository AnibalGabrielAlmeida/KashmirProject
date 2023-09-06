package com.kashmir.reservas.Repositorios;

import com.kashmir.reservas.Entidades.Reserva;
import com.kashmir.reservas.Entidades.VentaBebidas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepositorio extends JpaRepository<Reserva, Long> {
}
