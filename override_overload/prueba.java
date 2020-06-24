package override_overload;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Administrativo a1= new Administrativo();
		Profesor p1= new Profesor();
		Director d1= new Director();
		
		a1.getSueldo(1000);
		p1.getSueldo(1000);
		d1.getSueldo(1000);

	}

}
