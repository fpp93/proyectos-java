package Semana_santa_Jesus;

import java.util.Date;

public  abstract class Persona {
	
	private String nombre;
	private String apellidos;
	private Date fechanacimiento;
	private int edad;
	
	public Persona(String nombre,String apellidos,Date fechanacimiento) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechanacimiento=fechanacimiento;
		
	}
	//metodo que heredaran todas las clases
	public abstract void Calcular_edad();

	
	public void Identificar() {
		System.out.println( "nombre:" + nombre + ", apellidos:" + apellidos + ", fechanacimiento:" + fechanacimiento );
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
