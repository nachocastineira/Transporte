package ar.edu.unlam.pb2;

public class Autobus extends Vehiculo{
	
	private Integer cantidadDePlazas;
	
	public Autobus (String patente, String marca, String modelo, Integer cantidadDePlazas)
	{
		super(patente, marca, modelo);
		this.cantidadDePlazas = cantidadDePlazas;		
	}

	
				//Getters y Setters
	public Integer getCantidadDePlazas() {
		return cantidadDePlazas;
	}

	public void setCantidadDePlazas(Integer cantidadDePlazas) {
		this.cantidadDePlazas = cantidadDePlazas;
	}


				//Equals y Hash --> Con la opcion de setCantidadDePlazas. No borra lo heredado, escribe la parte nueva
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cantidadDePlazas == null) ? 0 : cantidadDePlazas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autobus other = (Autobus) obj;
		if (cantidadDePlazas == null) {
			if (other.cantidadDePlazas != null)
				return false;
		} else if (!cantidadDePlazas.equals(other.cantidadDePlazas))
			return false;
		return true;
	}
	
	
	

}
