package Semana_santa_Jesus;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Heroe extends Persona {
	private String nombre_heroe;
	private String superpoder;
	private int prisioneros_atrapados=0;
	
	SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");

	public Heroe(String nombre, String apellidos, Date fechanacimiento,String nombre_heroe,String superpoder) {
		super(nombre, apellidos, fechanacimiento);
		this.nombre_heroe=nombre_heroe;
		this.superpoder=superpoder;
		
		
		
		
	}

	@Override
	public void Calcular_edad() {
		
		
		
	}
	//sobrecarga
	public void Calcular_edad(Heroe[]heroes,int anioactual) {
	
		for(int i=0;i<heroes.length;i++) {
			
			int annio = heroes[i].getFechanacimiento().getYear()+1900;
			heroes[i].setEdad(anioactual-annio);
			
		}
		
	}
	//introduzco 3 arrays, delincuentes y supervillanos para comprobar el atributo captor, y si coincide, me va sumando el atributo de heroes que coincida.
	public void calcular_atrapados(Delincuente[]delincuentes,Supervillano[]supervillanos,Heroe[]heroes) {
		for(int i=0;i<delincuentes.length;i++) {
			if(delincuentes[i].getCaptor().equalsIgnoreCase("batman")) {
				heroes[0].prisioneros_atrapados++;
			}
			if(delincuentes[i].getCaptor().equalsIgnoreCase("robin")) {
				heroes[1].prisioneros_atrapados++;
			}
			if(delincuentes[i].getCaptor().equalsIgnoreCase("superman")) {
				heroes[2].prisioneros_atrapados++;
			}
		}
		for(int i=0;i<supervillanos.length;i++) {
			if(supervillanos[i].getCaptor().equalsIgnoreCase("batman")) {
				heroes[0].prisioneros_atrapados++;
			}
			if(supervillanos[i].getCaptor().equalsIgnoreCase("robin")) {
				heroes[1].prisioneros_atrapados++;
			}
			if(supervillanos[i].getCaptor().equalsIgnoreCase("superman")) {
				heroes[2].prisioneros_atrapados++;
			}
		}
	}

	
	public void Salida(Heroe[]heroes) {
		for(int i=0;i<heroes.length;i++) {
		System.out.println( "nombre de heroe: " + heroes[i].nombre_heroe + ", superpoder:" + heroes[i].superpoder + ", prisioneros atrapados:"
				+ heroes[i].prisioneros_atrapados + ",Nombre:" + heroes[i].getNombre() + ", Apellidos:" + heroes[i].getApellidos()
				+ ", Fecha de nacimiento:" + formato.format(heroes[i].getFechanacimiento()) + ",Edad:" + heroes[i].getEdad());
		System.out.println("---------------------------------");
		}
	}

	public String getNombre_heroe() {
		return nombre_heroe;
	}

	public void setNombre_heroe(String nombre_heroe) {
		this.nombre_heroe = nombre_heroe;
	}

	public String getSuperpoder() {
		return superpoder;
	}

	public void setSuperpoder(String superpoder) {
		this.superpoder = superpoder;
	}

	public int getPrisioneros_atrapados() {
		return prisioneros_atrapados;
	}

	public void setPrisioneros_atrapados(int prisioneros_atrapados) {
		this.prisioneros_atrapados = prisioneros_atrapados;
	}
	
	

}
