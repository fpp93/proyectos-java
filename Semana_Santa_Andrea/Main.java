package Semana_Santa_Andrea;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//formato para las fechas
		SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
		// condicion de salida del do while
		int num=1;
		
		
		Estudiante estudiantes[]= new Estudiante[10];
		Profesor profesores[]=new Profesor[5];
		Trabajador trabajadores[]=new Trabajador[5];
		//con esta funcion convierto un string en date y asi puedo introducirlo en mis objetos
		String entrada= "07/10/1993";
		Date fecha = formato.parse(entrada);
		estudiantes[0]=new Estudiante("null","parra","paez","12345678A",fecha,662619801,"franparra@gmail.com",001,"DAM",1,0);
		 entrada= "01/05/1994";
		 fecha = formato.parse(entrada);
		estudiantes[1]=new Estudiante("null","perez","luna","12345678B",fecha,662619801,"PEREZLUNA@gmail.com",002,"DAM",1,0);
		entrada= "05/08/1995";
		 fecha = formato.parse(entrada);
		estudiantes[2]=new Estudiante("null","hidalgo","jimenez","12345678C",fecha,662619801,"HIDALGOJIMENEZ@gmail.com",003,"Comercio",2,0);
		entrada= "08/10/1993";
		 fecha = formato.parse(entrada);
		estudiantes[3]=new Estudiante("null","gallardo","mejias","12345678D",fecha,662619801,"GALLARDOMEJIAS@gmail.com",004,"TAFAR",2,0);
		entrada= "11/11/1985";
		 fecha = formato.parse(entrada);
		estudiantes[4]=new Estudiante("null","rodriguez","santos","12345678E",fecha,662619801,"RODDRIGUEZSANTOS@gmail.com",005,"TAFAR",1,0);
		entrada= "11/11/1993";
		 fecha = formato.parse(entrada);
		estudiantes[5]=new Estudiante("null","machado","paez","12345678F",fecha,662619801,"MACHADOPAEZ@gmail.com",006,"DAM",2,0);
		entrada= "02/02/1996";
		 fecha = formato.parse(entrada);
		estudiantes[6]=new Estudiante("null","valeron","quevedo","12345678G",fecha,662619801,"VALERONQUEVEDO@gmail.com",007,"SALUD",1,0);
		entrada= "07/07/1998";
		 fecha = formato.parse(entrada);
		estudiantes[7]=new Estudiante("null","delgado","dominguez","12345678H",fecha,662619801,"DELAGADODOMINGUEZ@gmail.com",010,"3D",2,0);
		entrada= "07/10/1992";
		 fecha = formato.parse(entrada);
		estudiantes[8]=new Estudiante("null","luque","barrera","12345678I",fecha,662619801,"LUGUEBARRERA@gmail.com",011,"3D",2,0);
		entrada= "04/10/1991";
		 fecha = formato.parse(entrada);
		estudiantes[9]=new Estudiante("null","salazar","lopez","12345678J",fecha,662619801,"SALAZARLOPEZ@gmail.com",001,"medicina",1,0);
		
		entrada= "01/02/1980";
		 fecha = formato.parse(entrada);
		profesores[0]=new Profesor("Ramon","Salado","Lucena","9876543Y",fecha,670528759,"Ramonsalado@gmail.com",01,4,0,"Programacion","null");
		entrada= "12/06/1985";
		 fecha = formato.parse(entrada);
		profesores[1]=new Profesor("Luis","Algeciras","giraldo","9876543A",fecha,670528759,"Luisalgeciras@gmail.com",02,2,0,"Base de Datos","null");
		entrada= "01/08/1970";
		 fecha = formato.parse(entrada);
		profesores[2]=new Profesor("Jose Maria","benitez","hidalgo","9876543E",fecha,670528759,"josemaria@gmail.com",03,10,0,"Sistemas","null");
		entrada= "03/09/1975";
		 fecha = formato.parse(entrada);
		profesores[3]=new Profesor("Mari luz","ramirez","delgado","9876543R",fecha,670528759,"Mariluz@gmail.com",04,3,0,"FOL","null");
		entrada= "05/11/19873";
		 fecha = formato.parse(entrada);
		profesores[4]=new Profesor("Chema","calvo","perez","9876543O",fecha,670528759,"Chemacalvo@gmail.com",01,1,0,"Entornos","null");
		
		entrada= "03/01/1980";
		 fecha = formato.parse(entrada);
		trabajadores[0]=new Trabajador("Luisa","ramirez","Lucena","9876543Z",fecha,670528759,"luisaramirez@gmail.com",1,"Limpieza",22,0,0);
		entrada= "04/02/1985";
		 fecha = formato.parse(entrada);
		trabajadores[1]=new Trabajador("Teresa","fernandez","giraldo","9876543X",fecha,670528759,"tersa@gmail.com",2,"administracion",16,0,0);
		entrada= "05/4/1970";
		 fecha = formato.parse(entrada);
		trabajadores[2]=new Trabajador("Jose Carlos","aceituno","hidalgo","9876543V",fecha,670528759,"aceituno@gmail.com",1,"limpieza",30,0,0);
		entrada= "20/11/1975";
		 fecha = formato.parse(entrada);
		trabajadores[3]=new Trabajador("Mari tere","ramirez","perez","9876543B",fecha,670528759,"maritere@gmail.com",3,"enfermeria",22,0,0);
		entrada= "24/06/19873";
		 fecha = formato.parse(entrada);
		trabajadores[4]=new Trabajador("Antonio","calvo","jimenez","9876543K",fecha,670528759,"antonio@gmail.com",1,"limpieza",35,0,0);
		
		//menu do while con mis metodos y salidas
		do {
			int option=Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenido, para consultar los estudiantes pulse 1,profesores pulse 2, trabajadors pulse 3"
					+" para salir pulse 0"));
			
			switch(option) {
			case 0:
				JOptionPane.showMessageDialog(null,"Hasta pronto");
				System.exit(0);
				break;
			case 1:
				System.out.println("ESTUDIANTES");
				System.out.println("\n");
				estudiantes[0].Datos(estudiantes);
				estudiantes[0].Salida(estudiantes);
				
				break;
			case 2:
				System.out.println("PROFESORES");
				System.out.println("\n");
				profesores[0].tutor(profesores);
				profesores[0].Salida(profesores);
				
				break;
			case 3:
				System.out.println("Trabajadores");
				System.out.println("\n");
				trabajadores[0].Salida(trabajadores);
				
				break;
			}
			
		}while(num==1);


	}

}
