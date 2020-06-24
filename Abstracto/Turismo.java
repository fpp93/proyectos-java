package Abstracto;

public class Turismo extends Vehiculo {
	
	private int puertas;

	public Turismo(String matricula, String marca, String modelo,int puertas) {
		super(matricula, marca, modelo);
		this.puertas=puertas;
		
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", puertas=" + puertas +"]";
	}

	@Override
	public void getvelocidadmax() {
		System.out.println("La velocidad maxima de un turismo es 200kmH");
		
	}
	
	

}
