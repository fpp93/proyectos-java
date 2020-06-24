package Semana_Santa_Andrea;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Profesor extends Equipo_docente {
	
	SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
	
	private String asignatura;
	private String tutor;

	public Profesor(String nombre, String apellido1, String apellido2, String dni, Date fechanacimiento, int telefono,
			String email, int id_equipo, int antiguedad, int sueldobase,String asignatura,String tutor) {
		
		super(nombre, apellido1, apellido2, dni, fechanacimiento, telefono, email, id_equipo, antiguedad, sueldobase);
		this.asignatura=asignatura;
		this.tutor=tutor;
		setSueldobase(1320);
		
	
		
	}
	//dentro de este metodo hago un do while para que siempre deba haber dos tutores por teclado, y si lo es, modifico su sueldo
	public void tutor(Profesor[]profesores) {
		int cont;
		do {
			JOptionPane.showMessageDialog(null,"Debes elegir al menos dos tutores");
			cont=0;
		for(int i=0;i<profesores.length;i++) {
			profesores[i].tutor=JOptionPane.showInputDialog("El profesor "+(i+1)+ " es tutor?");
			
			if(profesores[i].tutor.equalsIgnoreCase("si")) {
				profesores[i].setSueldobase(profesores[i].getSueldobase()+(int)(profesores[i].getSueldobase()*0.2));
				cont++;
			}
			
		}
		}while(cont<2);
		
	}
	
	public void Salida(Profesor[]profesores) {
		for(int i=0;i<profesores.length;i++) {
		System.out.println( "id_equipo:" + profesores[i].getId_equipo() + ", antiguedad:" + profesores[i].getAntiguedad() + ", sueldo:" + profesores[i].getSueldobase()
				+ ", asignatura:" + profesores[i].asignatura + ", Tutor:" + profesores[i].tutor + ", Nombre:" + profesores[i].getNombre() + ", Apellido 1:"
				+ profesores[i].getApellido1() + ", Apellido 2:" + profesores[i].getApellido2() + ", Dni:" + profesores[i].getDni()
				+ ", Fechanacimiento:" + formato.format(profesores[i].getFechanacimiento()) + ", Telefono :" + profesores[i].getTelefono()
				+ ", Email:" + profesores[i].getEmail());
		System.out.println("---------------------------------------------------------------------------------------");
		}
	}

}

