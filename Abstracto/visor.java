package Abstracto;

public class visor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deportivo d1=new Deportivo( "2345A", "Seat", "Ibiza",150,"rojo");
		Turismo t1=new Turismo("8902W", "fiat", "punto",5);
		Industrial i1=new Industrial("1245T", "peugeot", "307",150,7);
		
		System.out.println(d1.toString());
		System.out.println("..............................");
		System.out.println(t1.toString());
		System.out.println("..............................");
		System.out.println(i1.toString());
		System.out.println("..............................");

		
		d1.getvelocidadmax();
		t1.getvelocidadmax();
		i1.getvelocidadmax();
	}

}
