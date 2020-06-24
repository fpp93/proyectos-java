package herencias2;

public class Deportivo extends Coche{
	
	private int caballos;
	
	public Deportivo(String nombre,int pasajeros,int velocidad,int puertas,String color,String marca,String modelo,int caballos) {
		super(nombre,pasajeros,velocidad,puertas,color,marca,modelo);
		this.caballos=caballos;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	
	public void salida(Deportivo[]deportivos) {
		for(int i=0;i<deportivos.length;i++) {
			System.out.println("Nombre: "+ deportivos[i].getNombre()+ "\nPasajeros: "+ deportivos[i].getPasajeros()
					+"\nVelocidad: "+deportivos[i].getVelocidad()+ "\nPuertas: "+ deportivos[i].getPuertas()+
					"\nColor: "+deportivos[i].getColor()+"\nMarca: "+deportivos[i].getMarca()+"\nModelo: "+deportivos[i].getModelo()+
					"\nCaballos: "+deportivos[i].caballos+"\nPrecio: "+deportivos[i].getPrecio());
			System.out.println("------------------------------------------");
		}
	}

}
