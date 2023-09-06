package com.kashmir.reservas.Servicios;

import com.kashmir.reservas.Entidades.Banda;
import com.kashmir.reservas.Repositorios.BandaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class BandaServicio {
    private final BandaRepositorio bandaRepositorio;
    @Autowired
    public BandaServicio(BandaRepositorio bandaRepositorio){
            this.bandaRepositorio = bandaRepositorio;
    }
    @Transactional
    public Banda crearBanda(Banda banda){
        return bandaRepositorio.save(banda);
    }
}
