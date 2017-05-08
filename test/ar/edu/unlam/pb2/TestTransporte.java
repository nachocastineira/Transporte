package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTransporte {

	@Test
	public void testQueCreaObjetosVehiculoYLosCompara() {
		Vehiculo miVehiculo1 = new Vehiculo ("ABC123", "Fiat", "Palio");
		Vehiculo miVehiculo2 = new Vehiculo ("EEE208", "Fiat", "Palio");
		Vehiculo miVehiculo3 = new Vehiculo ("TEE456", "Fiat", "Siena");
		
		assertTrue(miVehiculo1.equals(miVehiculo2));
		assertEquals(miVehiculo1.getMarca(), "Fiat");
		assertEquals(miVehiculo2.getModelo(), "Palio");
		assertFalse(miVehiculo1.equals(miVehiculo3));				
	}

	@Test
	public void testQueCreaObjetosTaxiYLosCompara(){
		Taxi miTaxi1 = new Taxi ("OPQ789", "Renault", "12", "E1234A");
		Taxi miTaxi2 = new Taxi ("VMH657", "Renault", "12", "E7169L");
		Taxi miTaxi3 = new Taxi ("STY179", "Ford", "Fiesta", "F7319M");
		
		assertTrue(miTaxi1.equals(miTaxi2)); //COMPARO VALORES DE OBJETOS DIFERENTES, para que funcione es necesario generar el metodo equals
		assertFalse(miTaxi3.equals(miTaxi1));
		assertEquals(miTaxi1.getLicencia(), "E1234A");
	}
	
	@Test
	public void testQueCreaObjetosAutobus()
	{
		Autobus miAutobus1 = new Autobus ("SDF309", "Mercedes", "A98", 45);
		Autobus miAutobus2 = new Autobus ("SGH731", "Mercedes", "A18", 59);
		Autobus miAutobus3 = new Autobus ("SPO904", "Mercedes", "A98", 45);
		Autobus miAutobus4 = new Autobus ("SPO104", "Mercedes", "A98", 48);
		
		assertTrue(miAutobus1.equals(miAutobus3));
		assertFalse(miAutobus2.equals(miAutobus4));
		assertEquals(miAutobus2.getMarca(), "Mercedes");
	}
		
	
}
