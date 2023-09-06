package com.kashmir.reservas.Servicios;

import com.kashmir.reservas.Entidades.Reserva;
import com.kashmir.reservas.Repositorios.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ReservaServicio{
    private final ReservaRepositorio reservaRepositorio;
    @Autowired
    public ReservaServicio(ReservaRepositorio reservaRepositorio){
        this.reservaRepositorio = reservaRepositorio;
    }
    @Transactional
    public Reserva crearReserva(Reserva reserva){
        return reservaRepositorio.save(reserva);
    }
}
