package P1T3B;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tren extends Transporte {
	
	SimpleDateFormat formato=new SimpleDateFormat("HH:mm");
	Date horas = new Date(116,5,5,6,00);
	
	private String energia;

	public Tren(float precio, int capacidad,String energia) {
		super(precio, capacidad);
		this.energia=energia;
		
		setTiempo(horas);
		
		if(energia.equalsIgnoreCase("diesel")) {
			setPrecio(88);
		}
		if(energia.equalsIgnoreCase("electrico")) {
			setPrecio(76);
		}
		if(getCapacidad()>300) {
			setPrecio(getPrecio()-(float)(getPrecio()*0.12));
		}
		
	}

	@Override
	public void velocidadmedia() {
		
	}
	public void velocidadmedia(Tren[]trenes) {
		float hora = horas.getHours();
		double m_s=920/0.56;
		for(int i=0;i<trenes.length;i++) {
		trenes[i].setVelocidad_media(m_s/hora);
		}
	}

	
	public void Salida(Tren[]trenes) {
		for(int i=0;i<trenes.length;i++) {
		System.out.println( "energia : \t" + trenes[i].energia+"\n" + "Precio : \t" + trenes[i].getPrecio()+"\n" + "Tiempo : \t" + formato.format(trenes[i].getTiempo())+"\n"
				+ "Capacidad : \t" + trenes[i].getCapacidad()+"\n" +"Velocidad media : "
				+ (float)trenes[i].getVelocidad_media());
		System.out.println("..........................................");
		}
	}
	
	
	
	

}
