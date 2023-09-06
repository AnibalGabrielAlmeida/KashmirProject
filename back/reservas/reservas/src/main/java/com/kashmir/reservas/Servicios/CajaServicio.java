package com.kashmir.reservas.Servicios;

import com.kashmir.reservas.Entidades.Caja;
import com.kashmir.reservas.Repositorios.CajaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class CajaServicio {
    private final CajaRepositorio cajaRepositorio;
    @Autowired
    public CajaServicio(CajaRepositorio cajaRepositorio){
        this.cajaRepositorio = cajaRepositorio;
    }
    public Caja crearCaja(Caja caja){
        return cajaRepositorio.save(caja);
    }
}
