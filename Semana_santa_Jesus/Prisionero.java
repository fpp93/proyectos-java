package Semana_santa_Jesus;

import java.util.Date;

public  abstract class Prisionero extends Persona {
	
	private int num_celda;
	private int id_prisionero;
	private int nivel_amenaza;
	private String captor;
	private boolean fugado=false;
	private int dia_de_fuga=0;

	public Prisionero(String nombre, String apellidos, Date fechanacimiento,int num_celda,int id_prisionero,int nivel_amenaza,String captor) {
		super(nombre, apellidos, fechanacimiento);
		this.num_celda=num_celda;
		this.id_prisionero=id_prisionero;
		this.nivel_amenaza=nivel_amenaza;
		this.captor=captor;
		
	}
	//esta parte era muy confusa y lo he resuelto de otro modo, haciendo estos dos metodos abstractos para poder heredarlos y llamarlos en el main
	public abstract void Escape();
	
	public abstract void Vuelta_carcel();
		
	

	
	public void Salida() {
		System.out.println( "numero de celda:" + num_celda + ", id:" + id_prisionero + ", nivel de amenaza:"
				+ nivel_amenaza + ", captor:" + captor + ", fugado:" + fugado + ",Nombre:" + getNombre()
				+ ", Apellidos:" + getApellidos() + ", Fechanacimiento:" + getFechanacimiento()
				+ ", Edad:" + getEdad());
	}
	public int getNum_celda() {
		return num_celda;
	}
	public void setNum_celda(int num_celda) {
		this.num_celda = num_celda;
	}
	public int getId_prisionero() {
		return id_prisionero;
	}
	public void setId_prisionero(int id_prisionero) {
		this.id_prisionero = id_prisionero;
	}
	public int getNivel_amenaza() {
		return nivel_amenaza;
	}
	public void setNivel_amenaza(int nivel_amenaza) {
		this.nivel_amenaza = nivel_amenaza;
	}
	public String getCaptor() {
		return captor;
	}
	public void setCaptor(String captor) {
		this.captor = captor;
	}
	public boolean isFugado() {
		return fugado;
	}
	public void setFugado(boolean fugado) {
		this.fugado = fugado;
	}
	public int getDia_de_fuga() {
		return dia_de_fuga;
	}
	public void setDia_de_fuga(int dia_de_fuga) {
		this.dia_de_fuga = dia_de_fuga;
	}
	
	
	
	
	

}
