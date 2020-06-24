package Semana_Santa_Andrea;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Trabajador extends Persona {
	
	SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
	
	private int id_trabajador;
	private String area;
	private int horastrabajo;
	private int horasextra;
	private int sueldobase;

	
	public Trabajador(String nombre, String apellido1, String apellido2, String dni, Date fechanacimiento, int telefono,
			String email,int id_trabajador,String area,int horastrabajo,int horasextra,int sueldobase) {
		super(nombre, apellido1, apellido2, dni, fechanacimiento, telefono, email);
		this.id_trabajador=id_trabajador;
		this.area=area;
		this.horastrabajo=horastrabajo;
		this.horasextra=horasextra;
		//en el mismo constructor modifico el sueldo en base a las condiciones del enunciado
		sueldobase=horastrabajo*9;
		this.sueldobase=sueldobase;
		if(area.equalsIgnoreCase("limpieza")) {
			if(horastrabajo>=20) {
				this.horasextra=horastrabajo-20;
				this.sueldobase=this.sueldobase+(horasextra*11);
			}
		}
	}
	
	public void Salida(Trabajador[]trabajadores) {
		for(int i=0;i<trabajadores.length;i++) {
		System.out.println( "id_trabajador:" + trabajadores[i].id_trabajador+ ", area:" + trabajadores[i].area + ", horas de trabajo:" + trabajadores[i].horastrabajo
				+ ", horas extra:" + trabajadores[i].horasextra + ", sueldo:" + trabajadores[i].sueldobase + ", Nombre:" + trabajadores[i].getNombre() + ", Apellido 1:"
				+ trabajadores[i].getApellido1() + ", Apellido 2:" + trabajadores[i].getApellido2() + ", Dni:" + trabajadores[i].getDni()
				+ ", Fechanacimiento:" + formato.format(trabajadores[i].getFechanacimiento()) + ", Telefono :" + trabajadores[i].getTelefono()
				+ ", Email:" + trabajadores[i].getEmail());
		System.out.println("---------------------------------------------------------------------------------------");
		}
	}
	
	

}
