package Semana_Santa_Andrea;

import java.util.Date;

public abstract class Persona {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Date fechanacimiento;
	private int telefono;
	private String email;
	
	public Persona(String nombre,String apellido1,String apellido2,String dni,Date fechanacimiento,int telefono,String email) {
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.dni=dni;
		this.fechanacimiento=fechanacimiento;
		this.telefono=telefono;
		this.email=email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
