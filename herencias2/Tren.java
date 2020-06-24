package herencias2;

public class Tren extends Medio {
	
	private String compania;
	
	public Tren(String nombre,int pasajeros,int velocidad,String compania) {
		super(nombre,pasajeros,velocidad);
		this.compania=compania;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	public void salida(Tren[]trenes) {
		for(int i=0;i<trenes.length;i++) {
			System.out.println("Nombre: "+ trenes[i].getNombre()+ "\nPasajeros: "+ trenes[i].getPasajeros()
					+"\nVelocidad: "+trenes[i].getVelocidad()+ "\nCompania: "+ trenes[i].compania+ "\nPrecio: "+trenes[i].getPrecio());
			System.out.println("------------------------------------------");
		}
	}

}
