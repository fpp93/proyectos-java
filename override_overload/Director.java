package override_overload;

public class Director extends TrabajadorFesac {
	
	
	
	
	@Override
	public double getSueldo() {
		
		return getSueldo();
	}
	
	public void getSueldo(double sueldo) {
		sueldo=(sueldo+(sueldo*0.40));
		System.out.println(sueldo);
	}

}
