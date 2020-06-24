package Semana_santa_Jesus;

import java.util.Date;

public class Carcelero extends Persona {
	
	private int id;
	private int dia_trabajo1;
	private int dia_trabajo2;
	private int sueldo;
	private boolean sancionado=false;

	public Carcelero(String nombre, String apellidos, Date fechanacimiento,int id,int dia_trabajo1,int dia_trabajo2,int sueldo) {
		super(nombre, apellidos, fechanacimiento);
		this.id=id;
		this.dia_trabajo1=dia_trabajo1;
		this.dia_trabajo2=dia_trabajo2;
		this.sueldo=sueldo;
		
	}

	@Override
	public void Calcular_edad() {
		
		
	}
//sobrecargo el metodo
	public void Calcular_edad(Carcelero[]carceleros,int anioactual) {
		//en este metodo calculo la edad, cogiendo por parametro, el año del sistema del main y lo resto al año de la fechadenacimiento
		for(int i=0;i<carceleros.length;i++) {
			//al estar deprecated, no me cogia bien el año(solo los dos ultimos numeros del año) asi que lo intente con calendars y gregorian
			//al no poder operar un date con ellos, y no querer cambiar toda la estructura de las fechas de los objetos, le sume al año un 1900 y ya me daba la fecha correcta
			int annio = carceleros[i].getFechanacimiento().getYear()+1900;
			carceleros[i].setEdad(anioactual-annio);
			
		}
		
	}
//mientras recorro el array de carceleros, recorro delincuentes y comparo el dia de su fuga con los dias de trabajo de los carceleros,
	//si coinciden, entrara en uno de los if, dependiendo del nivel de amenaza del delincuente, y aplicara el descuento al sueldo.
	public void Aplicar_sancion(Carcelero[]carceleros,Delincuente[]delincuentes) {
		for(int i=0;i<carceleros.length;i++) {
			for(int j=0;j<delincuentes.length;j++) {
				if(delincuentes[j].getDia_de_fuga()==carceleros[i].dia_trabajo1 || delincuentes[j].getDia_de_fuga()==carceleros[i].dia_trabajo2) {
					carceleros[i].sancionado=true;
					if(delincuentes[j].getNivel_amenaza()==1) {
						carceleros[i].sueldo=carceleros[i].sueldo-(int)(carceleros[i].sueldo*0.1);
					}
					if(delincuentes[j].getNivel_amenaza()==2) {
						carceleros[i].sueldo=carceleros[i].sueldo-(int)(carceleros[i].sueldo*0.2);
					}
					if(delincuentes[j].getNivel_amenaza()==3) {
						carceleros[i].sueldo=carceleros[i].sueldo-(int)(carceleros[i].sueldo*0.3);
					}
					if(delincuentes[j].getNivel_amenaza()==4) {
						carceleros[i].sueldo=carceleros[i].sueldo-(int)(carceleros[i].sueldo*0.4);
					}
					if(delincuentes[j].getNivel_amenaza()==5) {
						carceleros[i].sueldo=carceleros[i].sueldo-(int)(carceleros[i].sueldo*0.5);
					}
				}
			}
		}
		
	}

	
	public void Identificacion(Carcelero[]carceleros) {
		for(int i=0;i<carceleros.length;i++) {
		System.out.println( "Carcelero [id:" + carceleros[i].id + ", Nombre:" + carceleros[i].getNombre() + ", Apellidos:" + carceleros[i].getApellidos()
				+ ", Edad:" + carceleros[i].getEdad());
		System.out.println("---------------------------------");
		}
	}

	
	public void info_empleado(Carcelero[]carceleros) {
		for(int i=0;i<carceleros.length;i++) {
		System.out.println( "id:" + carceleros[i].id + ", dia 1 de trabajo:" + carceleros[i].dia_trabajo1 + ", dia 2 de trabajo:" + carceleros[i].dia_trabajo2 + ", sueldo:"
				+ carceleros[i].sueldo + ", sancionado:" + carceleros[i].sancionado);
		System.out.println("---------------------------------");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDia_trabajo1() {
		return dia_trabajo1;
	}

	public void setDia_trabajo1(int dia_trabajo1) {
		this.dia_trabajo1 = dia_trabajo1;
	}

	public int getDia_trabajo2() {
		return dia_trabajo2;
	}

	public void setDia_trabajo2(int dia_trabajo2) {
		this.dia_trabajo2 = dia_trabajo2;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isSancionado() {
		return sancionado;
	}

	public void setSancionado(boolean sancionado) {
		this.sancionado = sancionado;
	}
	
	
	
	
	
	

}
