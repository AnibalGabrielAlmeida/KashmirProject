package com.kashmir.reservas.Servicios;

import com.kashmir.reservas.Entidades.Bebida;
import com.kashmir.reservas.Repositorios.BebidaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class BebidaServicio {
    private final BebidaRepositorio bebidaRepositorio;
    @Autowired
    public BebidaServicio(BebidaRepositorio bebidaRepositorio){
        this.bebidaRepositorio = bebidaRepositorio;
    }
    @Transactional
    public Bebida crearBebida(Bebida bebida){
        return bebidaRepositorio.save(bebida);
    }
}
