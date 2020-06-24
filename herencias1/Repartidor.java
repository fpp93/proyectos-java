package herencias1;

public class Repartidor extends Empleado {
	
	private int entregas;
	private int zona;
	
	public Repartidor(String nombre,int edad,int salario,int entregas,int zona) {
		super(nombre,edad,salario);
		this.entregas=entregas;
		this.zona=zona;
		
		setSalario (getSalario()+(entregas*12));
		if(getEdad()>=30 && (zona==2 || zona==3) && entregas>5) {
			setSalario (getSalario()+getPlus());
			
		}
	}

	public int getEntregas() {
		return entregas;
	}

	public void setEntregas(int entregas) {
		this.entregas = entregas;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}
	
	public void salida() {
		System.out.println("Nombre: "+ getNombre()+ " \nEdad: "+ getEdad()+ "\nSalario: "+ getSalario()+ "\nEntregas: "+ getEntregas()+ "\nZona: "+getZona());
		System.out.println("--------------------------------------------------------");
	}

}
