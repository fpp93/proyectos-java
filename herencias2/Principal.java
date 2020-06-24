package herencias2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avion aviones[]=new Avion[5];
		Tren trenes[]=new Tren[5];
		Deportivo deportivos[]=new Deportivo[5];
		Familiar familiares[]=new Familiar[5];
		
		aviones[0]=new Avion("comercial",200,300,"737");
		aviones[1]=new Avion("militar",60,400,"737");
		aviones[2]=new Avion("avioneta",3,20,"A300");
		aviones[3]=new Avion("caza",2,550,"A300");
		aviones[4]=new Avion("hidroavion",3,150,"general");
		
		trenes[0]=new Tren("vapor",150,150,"oeste");
		trenes[1]=new Tren("comercial",200,180,"renfe");
		trenes[2]=new Tren("transporte",100,300,"surtrenes");
		trenes[3]=new Tren("carga",130,200,"vaporing");
		trenes[4]=new Tren("comercial",200,180,"renfe");
		
		deportivos[0]=new Deportivo("Deportivo",2,150,3,"rojo","BMW","300",300);
		deportivos[1]=new Deportivo("Deportivo",2,300,3,"negro","BMW","500",190);
		deportivos[2]=new Deportivo("Deportivo",2,190,3,"azul","TESLA","centinel",200);
		deportivos[3]=new Deportivo("Deportivo",2,120,3,"blanco","AUDI","A3",130);
		deportivos[4]=new Deportivo("Deportivo",2,150,3,"rojo","MERCEDES","Compressor",170);
		
		familiares[0]=new Familiar("Familiar",5,120,5,"blanco","seat","altea",true);
		familiares[1]=new Familiar("Familiar",7,120,5,"negro","fiat","punto",false);
		familiares[2]=new Familiar("Familiar",9,120,5,"blanco","peugeot","307",true);
		familiares[3]=new Familiar("Familiar",5,120,5,"azul","nissan","qasquai",false);
		familiares[4]=new Familiar("Familiar",7,120,5,"amarillo","opel","corsa",true);
		
		aviones[0].precios(aviones);
		
		System.out.println("Aviones:");
		System.out.println("............................");
		aviones[0].salida(aviones);
		System.out.println("Trenes:");
		System.out.println("............................");
		trenes[0].salida(trenes);
		System.out.println("Deportivos:");
		System.out.println("............................");
		deportivos[0].salida(deportivos);
		System.out.println("Familiares:");
		System.out.println("............................");
		familiares[0].salida(familiares);

	}

}
