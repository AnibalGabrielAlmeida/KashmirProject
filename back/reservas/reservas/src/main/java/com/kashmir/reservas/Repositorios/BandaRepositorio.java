package com.kashmir.reservas.Repositorios;

import com.kashmir.reservas.Entidades.Banda;
import com.kashmir.reservas.Entidades.VentaBebidas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandaRepositorio extends JpaRepository<Banda, Long> {
}
