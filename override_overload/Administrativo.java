package override_overload;

public class Administrativo extends TrabajadorFesac {
	
	
	
	
	@Override
	public double getSueldo() {
		
		return getSueldo();
	}
	
	public void getSueldo(double sueldo) {
		System.out.println(sueldo);
		
	}
	
	

}
