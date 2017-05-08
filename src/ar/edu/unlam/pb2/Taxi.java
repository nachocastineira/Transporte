package ar.edu.unlam.pb2;

public class Taxi extends Vehiculo {
	
	private String licencia;
	
	
	public Taxi (String patente, String marca, String modelo, String licencia)
	{
		super(patente, marca, modelo);
		this.licencia = licencia;		
	}

		//Getters y Setters
	public String getLicencia() {
		return licencia;
	}


	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	
	

}
