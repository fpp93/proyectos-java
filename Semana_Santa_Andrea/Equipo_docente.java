package Semana_Santa_Andrea;

import java.util.Date;

public abstract class Equipo_docente extends Persona {
	
	private int id_equipo;
	private int antiguedad;
	private int sueldobase;

	public Equipo_docente(String nombre, String apellido1, String apellido2, String dni, Date fechanacimiento,
			int telefono, String email,int id_equipo,int antiguedad,int sueldobase) {
		super(nombre, apellido1, apellido2, dni, fechanacimiento, telefono, email);
		this.id_equipo=id_equipo;
		this.antiguedad=antiguedad;
		this.sueldobase=sueldobase;
		
	}

	public int getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(int id_equipo) {
		this.id_equipo = id_equipo;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getSueldobase() {
		return sueldobase;
	}

	public void setSueldobase(int sueldobase) {
		this.sueldobase = sueldobase;
	}
	
	

}
