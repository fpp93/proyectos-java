package P1T3B;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Coche extends Transporte{
	
	SimpleDateFormat formato=new SimpleDateFormat("HH:mm");
	//despues de instanciar el formato, creo un nuevo date y le añado las horas que en este caso son 9
	Date horas = new Date(0,0,0,9,00);
	
	private String marca;
	private String modelo;
	private String color;
	
	public Coche(float precio, int capacidad,String marca,String modelo,String color) {
		super(precio, capacidad);
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		//en el constructor igualo mi nuevo date a mi atributo tiempo
		setTiempo(horas);
		
		//condicionales para calcular el precio
		if(marca.equalsIgnoreCase("mercedes") || marca.equalsIgnoreCase("BMW")||marca.equalsIgnoreCase("tesla")) {
			setPrecio(getPrecio()+(float)(getPrecio()*0.20));
		}
		if(color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("negro")) {
			setPrecio(getPrecio()+(float)(getPrecio()*0.04));
		}
	}
	//sobrescribo el metodo de la superclase
	@Override
	public void velocidadmedia() {
		
		
	}
	//lo sobrecargo dandole un parametro y poder trabajar con el 
	public void velocidadmedia(Coche[]coches) {
		//para poder operar con las horas, he cogido una variable y he recogido las horas de mi date,con un array hago el calculo con esa nueva variable
		//se que esto esta deprecated, pero es la forma a la que mas facil me he agarrado despues de probar varias cosas
		int hora = horas.getHours();
		for(int i=0;i<coches.length;i++) {
		coches[i].setVelocidad_media(920/hora);
		}
		
	}
	
	

	//lo saco por pantalla, aplicandole el formato de arriba al atributo tiempo.
	public void Salida(Coche[]coches) {
		for(int i=0;i<coches.length;i++) {
		System.out.println( "marca : \t" +coches[i].marca+"\n" + "modelo : \t" + coches[i].modelo+"\n" + "color : \t" + coches[i].color+"\n" + "Precio : \t" + coches[i].getPrecio()+"\n"
				+ "Tiempo : \t" + formato.format(coches[i].getTiempo())+"\n" + "Capacidad : \t" + coches[i].getCapacidad()+"\n" + "Velocidad media :"
				+ (float)coches[i].getVelocidad_media() );
		System.out.println("..........................................");
		}
	}
	
	
	
	

}
