package Semana_santa_Jesus;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Supervillano extends Prisionero {
	
	private String habilidad;
	private int num_subordinados=0;
	
	SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");

	public Supervillano(String nombre, String apellidos, Date fechanacimiento, int num_celda, int id_prisionero,
			int nivel_amenaza, String captor,String habilidad) {
		super(nombre, apellidos, fechanacimiento, num_celda, id_prisionero, nivel_amenaza, captor);
		this.habilidad=habilidad;
		
	}

	@Override
	public void Calcular_edad() {
		
		
	}
	@Override
	public void Escape() {
		
		
	}

	@Override
	public void Vuelta_carcel() {
		
		
	}
	//sobrecargo los metodos
	public void Calcular_edad(Supervillano[]supervillanos,int anioactual) {
		
		for(int i=0;i<supervillanos.length;i++) {
			
			int annio = supervillanos[i].getFechanacimiento().getYear()+1900;
			supervillanos[i].setEdad(anioactual-annio);
			
		}
		
	}
	public void Escape(Supervillano[]supervillanos) {
		
		for(int i=0;i<supervillanos.length;i++) {
			supervillanos[i].setDia_de_fuga((int)(Math.random()*30+1));
			supervillanos[i].setFugado(true);
		}
	}
	public void Vuelta_carcel(Supervillano[]supervillanos) {
		for(int i=0;i<supervillanos.length;i++) {
			supervillanos[i].setFugado(false);
		}
		
	}
	//comparo el array delincuentes con supervillanos, y si coincide el atributo nombre_jefe, suma el atributo num_subordinados de supervillanos
	public void Contar_subordinados(Delincuente[]delincuentes,Supervillano[]supervillanos) {
		for(int i=0;i<delincuentes.length;i++) {
			if(delincuentes[i].getNombre_jefe().equalsIgnoreCase("joker")) {
				supervillanos[0].num_subordinados++;
			}
			if(delincuentes[i].getNombre_jefe().equalsIgnoreCase("dos caras")) {
				supervillanos[1].num_subordinados++;
			}
			if(delincuentes[i].getNombre_jefe().equalsIgnoreCase("catwoman")) {
				supervillanos[2].num_subordinados++;
			}
		}
	}
	
	public  void Traslado(Supervillano[]supervillanos,Delincuente[]delincuentes) {
		
		//este cont es la condicion de salida del do while
		int cont;
		//aqui guardo la opcion del usuario
		int nueva_celda;
		//recorro el array supervillanos
		for(int i=0;i<supervillanos.length;i++) {
			//lo meto en un do while, para que si el numero introducido no es correcto, pueda volver a intentarlo
			do {
				cont=0;
			 nueva_celda=(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de la nueva celda del supervillano "+(i+1) )));
			for(int j=0;j<supervillanos.length;j++) {
				//si la opcion del usuario ya existe en el array supervillanos o delincuentes, me mostrara el error
				if(supervillanos[j].getNum_celda()==nueva_celda) {
					JOptionPane.showMessageDialog(null,"celda ya ocupada");
					cont++;
				}
			}
			for(int x=0;x<delincuentes.length;x++) {
				if(delincuentes[x].getNum_celda()==nueva_celda) {
					JOptionPane.showMessageDialog(null,"celda ya ocupada");
					cont++;
				}
			}
		}while(cont>0);
			//si sale del do while es que puedo cambiar el atributo por el nuevo
			supervillanos[i].setNum_celda(nueva_celda);
		}
		
	}

	
	public void Salida(Supervillano[]supervillanos) {
		for(int i=0;i<supervillanos.length;i++) {
		System.out.println( "habilidad:" + supervillanos[i].habilidad + ", numero de subordinados:" + supervillanos[i].num_subordinados + ", Numero de celda:"
				+ supervillanos[i].getNum_celda() + ", Id:" + supervillanos[i].getId_prisionero() + ", Nivel de amenaza:"
				+ supervillanos[i].getNivel_amenaza() + ", Captor:" + supervillanos[i].getCaptor() + ", Fugado:" + supervillanos[i].isFugado() + ", Nombre:"
				+ supervillanos[i].getNombre() + ", Apellidos:" + supervillanos[i].getApellidos() + ", Fecha de nacimiento:" + formato.format(supervillanos[i].getFechanacimiento())
				+ ", Edad:" + supervillanos[i].getEdad()+ ", dia de fuga:" + supervillanos[i].getDia_de_fuga());
		System.out.println("---------------------------------");
		}
	}

	
	
	

}
