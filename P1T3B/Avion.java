package P1T3B;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Avion extends Transporte {
	
	SimpleDateFormat formato=new SimpleDateFormat("HH:mm");
	Date horas = new Date(0,0,0,0,30);
	
	private int nMotores;
	
	public Avion(float precio, int capacidad,int nMotores) {
		super(precio, capacidad);
		this.nMotores=nMotores;
		setTiempo(horas);
		
		if(nMotores==2) {
			setPrecio(110);
		}else {
			setPrecio(127);
		}
		
		
	}

	@Override
	public void velocidadmedia() {
		
	}
	public void velocidadmedia(Avion[]aviones) {
		//aqui tenia el inconveniente de que al tiempo hay que añadirle los minutos, asi que creo otra variable que recoga los minutos
		float hora = horas.getHours();
		float min= horas.getMinutes();
		//convierto los minutos en horas y se la sumo a mi variable que recogio las horas
		min=min/60;
		hora=hora+min;
		//paso los kilometros a millas
		double millas=920/1.609;
		for(int i=0;i<aviones.length;i++) {
		aviones[i].setVelocidad_media(millas/hora);
		}
		
	}

	
	public void Salida(Avion[]aviones) {
		for(int i=0;i<aviones.length;i++) {
		
		System.out.println( "numero de Motores : \t" + aviones[i].nMotores+"\n" + ",Precio : \t" +  aviones[i].getPrecio()+"\n" + "Tiempo : \t" +  formato.format(aviones[i].getTiempo())+"\n"
				+ "Capacidad : \t" +  aviones[i].getCapacidad()+"\n" +"Velocidad media : "
				+ (float)aviones[i].getVelocidad_media());
		System.out.println("..........................................");
		}
	}

	
	
	
	

	
	

}
