package com.kashmir.reservas.Servicios;

import com.kashmir.reservas.Entidades.VentaBebidas;
import com.kashmir.reservas.Repositorios.VentaBebidasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class VentaBebidasServicio {
    private final VentaBebidasRepositorio ventaBebidasRepositorio;
    @Autowired
    public VentaBebidasServicio(VentaBebidasRepositorio ventaBebidasRepositorio){
        this.ventaBebidasRepositorio = ventaBebidasRepositorio;
    }
    public VentaBebidas crearVentaBebidas(VentaBebidas ventaBebidas){
        return ventaBebidasRepositorio.save(ventaBebidas);
    }
}
