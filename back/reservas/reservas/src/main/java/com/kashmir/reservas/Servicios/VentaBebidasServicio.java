package com.kashmir.reservas.Servicios;

import com.kashmir.reservas.Entidades.VentaBebidas;
import com.kashmir.reservas.Repositorios.VentaBebidasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VentaBebidasServicio {
    private final VentaBebidasRepositorio ventaBebidasRepositorio;
    @Autowired
    public VentaBebidasServicio(VentaBebidasRepositorio ventaBebidasRepositorio){
        this.ventaBebidasRepositorio = ventaBebidasRepositorio;
    }
    @Transactional
    public VentaBebidas crearVentaBebidas(VentaBebidas ventaBebidas){
        return ventaBebidasRepositorio.save(ventaBebidas);
    }
}
