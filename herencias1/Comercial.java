package herencias1;

public class Comercial extends Empleado {
	
	private int ventas;
	
	public Comercial(String nombre,int edad,int salario,int ventas) {
		super(nombre,edad,salario);
		this.ventas=ventas;
		
		setSalario (getSalario()+ventas*40);
		if(getEdad()>40 && ventas>4) {
			setSalario (getSalario()+getPlus());
		}
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	
	public void salida() {
		System.out.println("Nombre: "+ getNombre()+ " \nEdad: "+ getEdad()+ "\nSalario: "+ getSalario()+ "\nVentas: "+ getVentas());
		System.out.println("--------------------------------------------------------");
	}


}
