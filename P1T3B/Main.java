package P1T3B;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//instancio mis objetos en forma de array
		
		
		Coche coches[]= new Coche[3];
		Barco barcos[]= new Barco[3];
		Avion aviones[]=new Avion[3];
		Bus autobuses[]= new Bus[3];
		Tren trenes[]= new Tren[3];
		
		//no les paso el atributo tiempo ni velocidad media
		
		coches[0]= new Coche(75,5,"seat","ibiza","negro");
		coches[1]= new Coche(75,5,"BMW","serie-1","Rojo");
		coches[2]= new Coche(75,5,"TESLA","34f","Blanco");
		
		barcos[0]= new Barco(0,1100,1);
		barcos[1]= new Barco(0,500,2);
		barcos[2]= new Barco(0,450,3);
		
		aviones[0]= new Avion(0,200,2);
		aviones[1]= new Avion(0,150,4);
		aviones[2]= new Avion(0,100,2);
		
		autobuses[0]= new Bus(60,50,2,true);
		autobuses[1]= new Bus(60,60,4,false);
		autobuses[2]= new Bus(60,70,2,true);
		
		trenes[0]= new Tren(0,350,"diesel");
		trenes[1]= new Tren(0,200,"diesel");
		trenes[2]= new Tren(0,300,"electrico");
		
		//llamo a los metodos de calculo de velocidad
		coches[0].velocidadmedia(coches);
		aviones[0].velocidadmedia(aviones);
		barcos[0].velocidadmedia(barcos);
		autobuses[0].velocidadmedia(autobuses);
		trenes[0].velocidadmedia(trenes);
		
		//muestro por pantalla los objetos
		System.out.println("BARCOS");
		System.out.println("----------------------------------------");
		barcos[0].Salida(barcos);
		System.out.println("COCHES");
		System.out.println("----------------------------------------");
		coches[0].Salida(coches);
		System.out.println("AVIONES");
		System.out.println("----------------------------------------");
		aviones[0].Salida(aviones);
		System.out.println("AUTOBUSES");
		System.out.println("----------------------------------------");
		autobuses[0].Salida(autobuses);
		System.out.println("TRENES");
		System.out.println("----------------------------------------");
		trenes[0].Salida(trenes);

	}

}
