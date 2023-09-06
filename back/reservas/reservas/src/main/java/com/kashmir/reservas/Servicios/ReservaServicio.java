package com.kashmir.reservas.Servicios;

import com.kashmir.reservas.Entidades.Reserva;
import com.kashmir.reservas.Repositorios.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class ReservaServicio{
    private final ReservaRepositorio reservaRepositorio;
    @Autowired
    public ReservaServicio(ReservaRepositorio reservaRepositorio){
        this.reservaRepositorio = reservaRepositorio;
    }
    public Reserva crearReserva(Reserva reserva){
        return reservaRepositorio.save(reserva);
    }
}
