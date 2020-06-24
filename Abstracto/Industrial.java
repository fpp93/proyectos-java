package Abstracto;

public class Industrial extends Vehiculo {
	
	private int carga;
	private int plazas;
	
	public Industrial(String matricula, String marca, String modelo,int carga,int plazas) {
		super(matricula, marca, modelo);
		this.carga=carga;
		this.plazas=plazas;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", carga=" + carga +", plazas=" + plazas+"]";
	}

	@Override
	public void getvelocidadmax() {
		System.out.println("La velocidad maxima de un industrial es 180kmH");
	}
	
	
	

}
