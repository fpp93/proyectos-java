package herencias2;

public class Avion extends Medio{
	
	private String modelo;
	
	public Avion(String nombre,int pasajeros,int velocidad,String modelo) {
		super(nombre,pasajeros,velocidad);
		this.modelo=modelo;
		
	}
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void precios(Avion[]aviones) {
		for(int i=0;i<aviones.length;i++) {
			aviones[i].setPrecio (aviones[i].getPrecio()+180);
			if(aviones[i].modelo.contentEquals("737")) {
				aviones[i].setPrecio (aviones[i].getPrecio()*0);
			}
			if(aviones[i].modelo.contentEquals("A300")) {
				aviones[i].setPrecio (aviones[i].getPrecio()*0);
				aviones[i].setPrecio (aviones[i].getPrecio()+200);
			}
			
		}
	}
	
	

	public void salida(Avion[]aviones) {
		for(int i=0;i<aviones.length;i++) {
			System.out.println("Nombre: "+ aviones[i].getNombre()+ "\nPasajeros: "+ aviones[i].getPasajeros()
					+"\nVelocidad: "+aviones[i].getVelocidad()+ "\nModelo: "+ aviones[i].modelo+ "\nPrecio: "+aviones[i].getPrecio());
			System.out.println("------------------------------------------");
		}
	}
}
