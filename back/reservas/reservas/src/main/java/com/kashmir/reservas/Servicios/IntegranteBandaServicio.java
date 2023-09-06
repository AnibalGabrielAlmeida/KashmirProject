package com.kashmir.reservas.Servicios;

import com.kashmir.reservas.Entidades.IntegranteBanda;
import com.kashmir.reservas.Repositorios.IntegranteBandaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class IntegranteBandaServicio {
    private final IntegranteBandaRepositorio integranteBandaRepositorio;
    @Autowired
    public IntegranteBandaServicio(IntegranteBandaRepositorio integranteBandaRepositorio){
        this.integranteBandaRepositorio = integranteBandaRepositorio;
    }
    public IntegranteBanda crearIntegranteBanda(IntegranteBanda integranteBanda){
        return integranteBandaRepositorio.save(integranteBanda);
    }
}
