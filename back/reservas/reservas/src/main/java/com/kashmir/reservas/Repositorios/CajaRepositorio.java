package com.kashmir.reservas.Repositorios;

import com.kashmir.reservas.Entidades.Caja;
import com.kashmir.reservas.Entidades.VentaBebidas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CajaRepositorio extends JpaRepository<Caja, Long> {
}
