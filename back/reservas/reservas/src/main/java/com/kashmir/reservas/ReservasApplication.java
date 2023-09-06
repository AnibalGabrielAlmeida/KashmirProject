package com.kashmir.reservas;

import com.kashmir.reservas.Entidades.*;
import com.kashmir.reservas.Servicios.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ReservasApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ReservasApplication.class, args);
		BandaServicio bandaServicio = context.getBean(BandaServicio.class);
		BebidaServicio bebidaServicio = context.getBean(BebidaServicio.class);
		CajaServicio cajaServicio = context.getBean(CajaServicio.class);
		IntegranteBandaServicio integranteBandaServicio = context.getBean(IntegranteBandaServicio.class);
		ReservaServicio reservaServicio = context.getBean(ReservaServicio.class);
		VentaBebidasServicio ventaBebidasServicio = context.getBean(VentaBebidasServicio.class);
		try{
			Banda banda = new Banda();
			Banda bandaGuardado = bandaServicio.crearBanda(banda);
			System.out.println("Banda guardado con éxito. ID: " + bandaGuardado.getId());
		} catch (Exception e) {
			System.err.println("Error al guardar la banda: " + e.getMessage());
		}
		try {
			Bebida bebida = new Bebida();
			Bebida bebidaGuardada = bebidaServicio.crearBebida(bebida);
			System.out.println("Bebida guardada con éxito. ID: " + bebidaGuardada.getId());
		} catch (Exception e) {
			System.err.println("Error al guardar la bebida: " + e.getMessage());
		}
		try {
			Caja caja = new Caja();
			Caja cajaGuardada = cajaServicio.crearCaja(caja);
			cajaGuardada.setDescripcion("Prueba");
			System.out.println("Caja guardada con éxito. ID: " + cajaGuardada.getDescripcion());
		} catch (Exception e) {
			System.err.println("Error al guardar la caja: " + e.getMessage());
		}

		try {
			IntegranteBanda integrante = new IntegranteBanda();
			IntegranteBanda integranteGuardado = integranteBandaServicio.crearIntegranteBanda(integrante);
			System.out.println("Integrante de banda guardado con éxito. ID: " + integranteGuardado.getId());
		} catch (Exception e) {
			System.err.println("Error al guardar el integrante de banda: " + e.getMessage());
		}
		try {
			Reserva reserva = new Reserva();
			Reserva reservaGuardada = reservaServicio.crearReserva(reserva);
			System.out.println("Reserva guardada con éxito. ID: " + reservaGuardada.getId());
		} catch (Exception e) {
			System.err.println("Error al guardar la reserva: " + e.getMessage());
		}
		try {
			VentaBebidas venta = new VentaBebidas();
			VentaBebidas ventaGuardada = ventaBebidasServicio.crearVentaBebidas(venta);
			System.out.println("Venta de bebidas guardada con éxito. ID: " + ventaGuardada.getId());
		} catch (Exception e) {
			System.err.println("Error al guardar la venta de bebidas: " + e.getMessage());
		}
	}
}
