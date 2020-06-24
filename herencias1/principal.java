package herencias1;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comercial c1=new Comercial("fran",26,1200,5);
		Comercial c2=new Comercial("santi",18,1500,12);
		Comercial c3=new Comercial("nico",41,800,5);
		Comercial c4=new Comercial("marta",34,1350,0);
		
		Repartidor r1=new Repartidor("david",26,1200,10,4);
		Repartidor r2=new Repartidor("adrian",26,1200,12,3);
		Repartidor r3=new Repartidor("jesus",26,1200,3,2);
		Repartidor r4=new Repartidor("carlos",26,1200,15,1);
		
		System.out.println("Comerciales:");
		System.out.println(".....................");
		c1.salida();
		c2.salida();
		c3.salida();
		c4.salida();
		
		System.out.println("Repartidores:");
		System.out.println(".......................");
		
		r1.salida();
		r2.salida();
		r3.salida();
		r4.salida();

	}

}
