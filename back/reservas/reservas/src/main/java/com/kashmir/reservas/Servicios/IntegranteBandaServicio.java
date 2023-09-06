package com.kashmir.reservas.Servicios;

import com.kashmir.reservas.Entidades.IntegranteBanda;
import com.kashmir.reservas.Repositorios.IntegranteBandaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class IntegranteBandaServicio {
    private final IntegranteBandaRepositorio integranteBandaRepositorio;
    @Autowired
    public IntegranteBandaServicio(IntegranteBandaRepositorio integranteBandaRepositorio){
        this.integranteBandaRepositorio = integranteBandaRepositorio;
    }
    @Transactional
    public IntegranteBanda crearIntegranteBanda(IntegranteBanda integranteBanda){
        return integranteBandaRepositorio.save(integranteBanda);
    }
}
