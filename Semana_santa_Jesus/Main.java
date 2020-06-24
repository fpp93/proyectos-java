package Semana_santa_Jesus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//variable condicional para el bucle do while
		int num=1;
		//formato para las fechas
		SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
		//creo un calendario para guardar el año actual
		Calendar fechaactual=new GregorianCalendar();
		int anioactual = fechaactual.get(Calendar.YEAR);
		//creo arrays de cada objeto variando la cantidad en cuantos puedo necesitar
		Heroe heroes[]=new Heroe[3];
		Carcelero carceleros[]=new Carcelero[3];
		Delincuente delincuentes[]=new Delincuente[6];
		Supervillano supervillanos[]=new Supervillano[3];
		
		//con esta funcion convierto un String en un date para luego colocarlo en las fechas de cada objeto
		String entrada= "07/10/1975";
		Date fecha = formato.parse(entrada);
		heroes[0]=new Heroe("Bruce","Wayne",fecha,"Batman","Es millonario");
		 entrada= "12/10/1990";
		 fecha = formato.parse(entrada);
		heroes[1]=new Heroe("Dick","Grayson",fecha,"Robin","Habilidades Atleticas sobrehumanas");
		entrada= "22/09/1973";
		 fecha = formato.parse(entrada);
		heroes[2]=new Heroe("Clark","Kent",fecha,"Superman","Vuelo,Superfuerza,Rayos laser..");
		
		
		entrada= "01/01/1970";
		 fecha = formato.parse(entrada);
		carceleros[0]=new Carcelero("Henry","liard",fecha,01,22,12,1200);
		entrada= "02/02/1972";
		 fecha = formato.parse(entrada);
		carceleros[1]=new Carcelero("Steve","Rogers",fecha,02,1,3,1200);
		entrada= "03/03/1973";
		 fecha = formato.parse(entrada);
		carceleros[2]=new Carcelero("Bruce","Campbell",fecha,03,20,15,1200);
		
		entrada= "04/04/1987";
		 fecha = formato.parse(entrada);
		delincuentes[0]=new Delincuente("Gustave","robinson",fecha,301,0001,3,"Batman","Atraco a mano armada","ninguno");
		entrada= "05/05/1944";
		 fecha = formato.parse(entrada);
		delincuentes[1]=new Delincuente("John","Collins",fecha,401,0002,2,"Robin","Asesinato","Joker");
		entrada= "06/06/1998";
		 fecha = formato.parse(entrada);
		delincuentes[2]=new Delincuente("August","Chepard",fecha,201,0003,5,"Superman","Robo","Dos caras");
		entrada= "07/07/1984";
		 fecha = formato.parse(entrada);
		delincuentes[3]=new Delincuente("Bob","cassie",fecha,302,0004,4,"Robin","Abusos","Catwoman");
		entrada= "08/08/1954";
		 fecha = formato.parse(entrada);
		delincuentes[4]=new Delincuente("Jane","Stetman",fecha,303,0005,4,"Batman","Atraco e intimidacion","Joker");
		entrada= "09/09/1945";
		 fecha = formato.parse(entrada);
		delincuentes[5]=new Delincuente("Helen","party",fecha,101,0006,3,"Superman","Atraco a mano armada","Joker");
		
		entrada= "10/10/1988";
		 fecha = formato.parse(entrada);
		supervillanos[0]=new Supervillano("Arthur","Fleck",fecha,501,0007,5,"Batman","Mente genuina y retorcida");
		entrada= "11/11/1978";
		 fecha = formato.parse(entrada);
		supervillanos[1]=new Supervillano("Harvey","Dent",fecha,502,0010,4,"Batman","Amplio conocimiento de la ley");
		entrada= "12/12/1957";
		 fecha = formato.parse(entrada);
		supervillanos[2]=new Supervillano("Selina","Kyle",fecha,503,0011,3,"Robin","Gran atleta");
		
		//menu do while con los metodos y salidas de cada objeto con ventanas emergentes
		do {
			int option=Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenido a ARKHAM inspector, para salir pulse 0, para repasar"
					+ " la informacion de los heroes pulse 1,para revisar el archivo de delincuentes pulse 2,Para ver el historial de los"
					+ " supervillanos aqui encerrados pulse 3,y si quiere dar un repaso al personal de la carcel pulse 4"));
			
			switch(option) {
			case 0:
				JOptionPane.showMessageDialog(null,"Hasta pronto inspector");
				System.exit(0);
				break;
			case 1:
				System.out.println("HEROES");
				System.out.println("..................................");
				System.out.println("\n");
				heroes[0].Calcular_edad(heroes, anioactual);
				heroes[0].calcular_atrapados(delincuentes, supervillanos, heroes);
				heroes[0].Salida(heroes);
				
				break;
			case 2:
				System.out.println("DELINCUENTES");
				System.out.println("..................................");
				System.out.println("\n");
				delincuentes[0].Calcular_edad(delincuentes, anioactual);
				delincuentes[0].Escape(delincuentes);
				delincuentes[0].Vuelta_carcel(delincuentes);
				delincuentes[0].Identificacion(delincuentes);
				break;
			case 3:
				System.out.println("SUPERVILLANOS");
				System.out.println("..................................");
				System.out.println("\n");
				supervillanos[0].Calcular_edad(supervillanos, anioactual);
				supervillanos[0].Contar_subordinados(delincuentes, supervillanos);
				supervillanos[0].Escape(supervillanos);
				supervillanos[0].Vuelta_carcel(supervillanos);
				supervillanos[0].Traslado(supervillanos, delincuentes);
				supervillanos[0].Salida(supervillanos);
				break;
			case 4:
				System.out.println("CARCELEROS");
				System.out.println("..................................");
				System.out.println("\n");
				carceleros[0].Calcular_edad(carceleros, anioactual);
				carceleros[0].Aplicar_sancion(carceleros, delincuentes);
				System.out.println("Identificaciones:");
				System.out.println("\n");
				carceleros[0].Identificacion(carceleros);
				System.out.println("\n");
				System.out.println("Informacion basica:");
				System.out.println("..................................");
				System.out.println("\n");
				carceleros[0].info_empleado(carceleros);
				break;
			default:
				JOptionPane.showMessageDialog(null,"Introduzca un numero valido");
			}
			
		}while(num==1);

	}

}
