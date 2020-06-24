package Semana_santa_Jesus;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Delincuente extends Prisionero {
	
	private String causa_encarcelamiento;
	private String nombre_jefe;
	
	SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");

	public Delincuente(String nombre, String apellidos, Date fechanacimiento, int num_celda, int id_prisionero,
			int nivel_amenaza, String captor,String causa_encarcelamiento,String nombre_jefe) {
		super(nombre, apellidos, fechanacimiento, num_celda, id_prisionero, nivel_amenaza, captor);
		this.causa_encarcelamiento=causa_encarcelamiento;
		this.nombre_jefe=nombre_jefe;
		
	}

	@Override
	public void Calcular_edad() {
		
		
	}
	@Override
	public void Escape() {
		
		
	}

	@Override
	public void Vuelta_carcel() {
		
		
	}
	//sobrecargo los tres metodos, uno de persona y dos de prisionero.
	public void Calcular_edad(Delincuente[]delincuentes,int anioactual) {
		for(int i=0;i<delincuentes.length;i++) {
			
			int annio = delincuentes[i].getFechanacimiento().getYear()+1900;
			delincuentes[i].setEdad(anioactual-annio);
			
		}
		
	}
	//le asigno un numero del 1 al 30 random y cambio el estado de fugado a true
	public void Escape(Delincuente[]delincuentes) {
		for(int i=0;i<delincuentes.length;i++) {
			delincuentes[i].setDia_de_fuga((int)(Math.random()*30+1));
			delincuentes[i].setFugado(true);	
		}
		
	}
	public void Vuelta_carcel(Delincuente[]delincuentes) {
		for(int i=0;i<delincuentes.length;i++) {
			delincuentes[i].setFugado(false);
		}
		
	}

	
	public void Identificacion(Delincuente[]delincuentes) {
		for(int i=0;i<delincuentes.length;i++) {
		System.out.println( "causa de encarcelamiento:" + delincuentes[i].causa_encarcelamiento + ",jefe:" + delincuentes[i].nombre_jefe
				+ ", Nombre:" + delincuentes[i].getNombre() + ", Apellidos:" + delincuentes[i].getApellidos() + ", Fecha de nacimiento:"
				+ formato.format(delincuentes[i].getFechanacimiento()) + ", Edad:" + delincuentes[i].getEdad());
		System.out.println("---------------------------------");
		}
	}

	public String getCausa_encarcelamiento() {
		return causa_encarcelamiento;
	}

	public void setCausa_encarcelamiento(String causa_encarcelamiento) {
		this.causa_encarcelamiento = causa_encarcelamiento;
	}

	public String getNombre_jefe() {
		return nombre_jefe;
	}

	public void setNombre_jefe(String nombre_jefe) {
		this.nombre_jefe = nombre_jefe;
	}

	
	
	
	
	

}
