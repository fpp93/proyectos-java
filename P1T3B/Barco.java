package P1T3B;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Barco extends Transporte {
	
	SimpleDateFormat formato=new SimpleDateFormat("HH:mm");
	Date horas = new Date(0,0,0,7,00);
	
	private int categoria;
	
	
	public Barco(float precio,int capacidad,int categoria) {
		super(precio,capacidad);
		this.categoria=categoria;
		setTiempo(horas);
		
		
		if(categoria==1) {
			setPrecio(120);
		}
		if(categoria==2) {
			setPrecio(97);
		}
		if(categoria==3) {
			setPrecio(89);
		}
		if(getCapacidad()>1000) {
			setPrecio(getPrecio()-(float)(getPrecio()*0.09));
		}
	}

	@Override
	public void velocidadmedia() {
		
		
	}
	public void velocidadmedia(Barco[]barcos) {
		float hora = horas.getHours();
		//kilometros a nudos
		double nudos=920/1.85;
		for(int i=0;i<barcos.length;i++) {
		barcos[i].setVelocidad_media(nudos/hora);
		}
	}
	

	
	public void Salida (Barco[]barcos) {
		for(int i=0;i<barcos.length;i++) {
		
		System.out.println( "categoria :\t" + barcos[i].categoria+"\n" + "Precio : \t" + barcos[i].getPrecio()+"\n" + "Tiempo : \t" + formato.format(barcos[i].getTiempo())+"\n"
				+ "Capacidad : \t" + barcos[i].getCapacidad()+"\n" + "Velocidad media :"
				+ (float)barcos[i].getVelocidad_media());
		System.out.println("..........................................");
		}
	}

	
	

}
