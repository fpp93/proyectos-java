package override_overload;

public class  Profesor extends TrabajadorFesac {
	
	
	
	
	@Override
	public double getSueldo() {
		
		return getSueldo();
	}
	
public void getSueldo(double sueldo) {
	sueldo=(sueldo+(sueldo*0.25));
		System.out.println(sueldo);
	}
	
	

}
