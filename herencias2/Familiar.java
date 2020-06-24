package herencias2;

public class Familiar extends Coche {
	
	private boolean isofix;
	
	public Familiar(String nombre,int pasajeros,int velocidad,int puertas,String color,String marca,String modelo,boolean isofix) {
		super(nombre,pasajeros,velocidad,puertas,color,marca,modelo);
		this.isofix=isofix;
	}

	public boolean isIsofix() {
		return isofix;
	}

	public void setIsofix(boolean isofix) {
		this.isofix = isofix;
	}
	
	public void salida(Familiar[]familiares) {
		for(int i=0;i<familiares.length;i++) {
			System.out.println("Nombre: "+ familiares[i].getNombre()+ "\nPasajeros: "+ familiares[i].getPasajeros()
					+"\nVelocidad: "+familiares[i].getVelocidad()+ "\nPuertas: "+ familiares[i].getPuertas()+
					"\nColor: "+familiares[i].getColor()+"\nMarca: "+familiares[i].getMarca()+"\nModelo: "+familiares[i].getModelo()+
					"\nisofix: "+familiares[i].isofix+"\nPrecio: "+familiares[i].getPrecio());
			System.out.println("------------------------------------------");
		}
	}

}
