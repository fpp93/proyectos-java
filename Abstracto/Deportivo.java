package Abstracto;

public class Deportivo extends Vehiculo {
	
	private int cv;
	private String color;

	public Deportivo(String matricula, String marca, String modelo,int cv,String color) {
		super(matricula, marca, modelo);
		this.cv=cv;
		this.color=color;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", cv=" + cv +", color=" + color+"]";
	}

	@Override
	public void getvelocidadmax() {
		System.out.println("La velocidad maxima de un deportivo es 300kmH");
	}

}
