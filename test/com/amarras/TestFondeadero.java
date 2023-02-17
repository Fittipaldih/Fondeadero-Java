package com.amarras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFondeadero {

	@Test
	public void testQueSePuedaCrearUnFondeadero()  {
		Fondeadero fondeadero = new Fondeadero("Yacht Puerto Black", 70);
		assertNotNull(fondeadero);
		assertEquals(fondeadero.getCantidadDeAmarrasDisponibles(), 70);
		assertEquals(fondeadero.getCantidadDeYatesAmarrados(), 0);	
	}

	@Test
	public void testQueSePuedaAmarrarUnYateMotorYSeCobreCorrectamente() throws noSePudoAmarrarException  {
		Fondeadero fondeadero = new Fondeadero("Yacht Puerto Black", 70);
		assertNotNull(fondeadero);
		
		Yate motor1 = new YateMotor("A71", "Andres Borgeat", 18.87, 5.15, 119.0, 5500.0, 37, 5959, 9000, 23, 6500);
		fondeadero.amarrarYate(motor1);
		
		assertEquals(fondeadero.getCantidadDeYatesAmarrados(), 1);
		assertEquals(fondeadero.getCantidadDeAmarrasDisponibles(), 69);
		assertEquals(fondeadero.getRecaudacionTotal(), 13000);
	}
	
	@Test
	public void testQueSePuedaAmarrarUnYateVelaYSeCobreCorrectamente() throws noSePudoAmarrarException  {
		Fondeadero fondeadero = new Fondeadero("Yacht Puerto Black", 70);
		assertNotNull(fondeadero);
		
		Yate vela1 = new YateVela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 1400.0, 5, 21.5, 85, 133);
		fondeadero.amarrarYate(vela1);
		
		assertEquals(fondeadero.getCantidadDeYatesAmarrados(), 1);
		assertEquals(fondeadero.getCantidadDeAmarrasDisponibles(), 69);
		assertEquals(fondeadero.getRecaudacionTotal(), 11000);
	}
	
	@Test
	public void testQueSePuedaDesamarrarUnYateYSeGuardeLaRecaudacion() throws noSePudoAmarrarException {
		Fondeadero fondeadero = new Fondeadero("Yacht Puerto Black", 70);
		assertNotNull(fondeadero);
		
		Yate vela1 = new YateVela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 1400.0, 5, 21.5, 85, 133);
		fondeadero.amarrarYate(vela1);
		assertEquals(fondeadero.getCantidadDeYatesAmarrados(), 1);
		fondeadero.desamarrarYate(vela1);
		
		assertEquals(fondeadero.getCantidadDeYatesAmarrados(), 0);
		assertEquals(fondeadero.getCantidadDeAmarrasDisponibles(), 70);
		assertEquals(fondeadero.getRecaudacionTotal(), 11000);
	}
	
}
