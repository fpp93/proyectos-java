package P1T3B;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class  Transporte {
	
	//para poder recoger el tiempo le doy este formato
	SimpleDateFormat formato=new SimpleDateFormat("HH:mm");
	
	private float precio;
	private Date tiempo;
	private int capacidad;
	private double velocidad_media;
	//creo el atributo velocidad media para poder trabajar mejor con el
	

//hago el constructor de la superclase sin pasarles el date tiempo a las subclases
	public Transporte(float precio,int capacidad) {
		this.precio=precio;
		this.capacidad=capacidad;
	}
	
	public abstract void velocidadmedia();

	@Override
	public String toString() {
		return "Transporte [precio=" + precio + ", tiempo=" + tiempo + ", capacidad=" + capacidad + "]";
	}
	
	public double getVelocidad_media() {
		return velocidad_media;
	}

	public void setVelocidad_media(double velocidad_media) {
		this.velocidad_media = velocidad_media;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Date getTiempo() {
		return tiempo;
	}

	public void setTiempo(Date tiempo) {
		this.tiempo = tiempo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	
	

}
