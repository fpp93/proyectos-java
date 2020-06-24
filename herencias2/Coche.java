package herencias2;

public class Coche extends Medio {
	
	private int puertas;
	private String color;
	private String marca;
	private String modelo;
	
	public Coche(String nombre,int pasajeros,int velocidad,int puertas,String color,String marca,String modelo) {
		super(nombre,pasajeros,velocidad);
		this.puertas=puertas;
		this.color=color;
		this.marca=marca;
		this.modelo=modelo;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
