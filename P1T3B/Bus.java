package P1T3B;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bus extends Transporte {
	
	SimpleDateFormat formato=new SimpleDateFormat("HH:mm");
	Date horas = new Date(116,5,5,15,00);
	
	private int ejes;
	private boolean wc;

	public Bus(float precio, int capacidad,int ejes,boolean wc) {
		super(precio, capacidad);
		this.ejes=ejes;
		this.wc=wc;
		
		setTiempo(horas);
		
		if(wc==true) {
			setPrecio(getPrecio()+5);
		}
		

	}

	@Override
	public void velocidadmedia() {
		
	}
	public void velocidadmedia(Bus[]autobuses) {
		int hora = horas.getHours();
		for(int i=0;i<autobuses.length;i++) {
		autobuses[i].setVelocidad_media(920/hora);
		}
		
	}

	
	public void Salida(Bus[]autobuses) {
		for(int i=0;i<autobuses.length;i++) {
		System.out.println( "ejes : \t" + autobuses[i].ejes+"\n" + "wc : \t" + autobuses[i].wc+"\n" + "Precio : \t" + autobuses[i].getPrecio()+"\n" + ",Tiempo : \t" + formato.format(autobuses[i].getTiempo())+"\n"
				+ "Capacidad : \t" + autobuses[i].getCapacidad()+"\n" + "Velocidad media : "
				+ (float)autobuses[i].getVelocidad_media());
		System.out.println("..........................................");
		}
	}
	
	
	
	

}
