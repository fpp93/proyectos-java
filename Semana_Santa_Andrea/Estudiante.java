package Semana_Santa_Andrea;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Estudiante extends Persona {
	
	SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
	
	private int id_estudiante;
	private String estudio;
	private int curso;
	private int notamedia;
	private String viaje;
	
	public Estudiante(String nombre, String apellido1, String apellido2, String dni, Date fechanacimiento, int telefono,
			String email,int id_estudiante,String estudio,int curso,int notamedia) {
		
		super(nombre, apellido1, apellido2, dni, fechanacimiento, telefono, email);
		this.id_estudiante=id_estudiante;
		this.estudio=estudio;
		this.curso=curso;
		
	}
	//com este metodo el usuario introduce por teclado los nombres y notas de los alumnos, ademas me comprueba sus calificaciones y si iran al viaje
	public void Datos(Estudiante[]estudiantes) {
		for(int i=0;i<estudiantes.length;i++) {
			 String nombre=JOptionPane.showInputDialog("Introduce el nombre del estudiante");
			estudiantes[i].setNombre(nombre);
			 int notamedia=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del estudiante"));
			estudiantes[i].notamedia=notamedia;
			
			if(estudiantes[i].notamedia<5) {
				System.out.println("Este alumno ha suspendido");
				estudiantes[i].viaje="No";
			}
			if(estudiantes[i].notamedia>=5 && estudiantes[i].notamedia<7) {
				System.out.println("Este alumno ha aprobado");
				estudiantes[i].viaje="Si";
			}
			if(estudiantes[i].notamedia>=7 && estudiantes[i].notamedia<9) {
				System.out.println("Este alumno ha sacado notable");
				estudiantes[i].viaje="Si";
			}
			if(estudiantes[i].notamedia>=9) {
				System.out.println("Este alumno ha sacado sobresaliente");
				estudiantes[i].viaje="Si";
			}
		}
	}

	
	public void Salida(Estudiante[]estudiantes) {
		for(int i=0;i<estudiantes.length;i++) {
		System.out.println( "id_estudiante:" + estudiantes[i].id_estudiante + ", estudio:" + estudiantes[i].estudio + ", curso:" + estudiantes[i].curso
				+ ", notamedia:" + estudiantes[i].notamedia + ", viaje:" + estudiantes[i].viaje + ", Nombre:" + estudiantes[i].getNombre() + ", Apellido 1:"
				+ estudiantes[i].getApellido1() + ", Apellido 2:" + estudiantes[i].getApellido2() + ", Dni:" + estudiantes[i].getDni()
				+ ", Fechanacimiento:" + formato.format(estudiantes[i].getFechanacimiento()) + ", Telefono :" + estudiantes[i].getTelefono()
				+ ", Email:" + estudiantes[i].getEmail());
		System.out.println("---------------------------------------------------------------------------------------");
		}
	}
	
	
	
	

}
