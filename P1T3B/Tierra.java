package P1T3B;



public abstract class Tierra extends Transporte {
	
	
	public Tierra(float precio,int capacidad) {
		super(precio,capacidad);
	}
	
	public abstract void velocidadmedia() ;

	@Override
	public String toString() {
		return "Tierra [getPrecio()=" + getPrecio() + ", getTiempo()=" + getTiempo() + ", getCapacidad()="
				+ getCapacidad() + "]";
	}

	
	
	

}
