package Abstracto;

public  abstract class Vehiculo {

		private String matricula;
		private String marca;
		private String modelo;
		
		public Vehiculo(String matricula,String marca,String modelo) {
			this.matricula=matricula;
			this.marca=marca;
			this.modelo=modelo;
			
		}
		
		public abstract void getvelocidadmax() ;
			
		

		@Override
		public String toString() {
			return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
		}

		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		
		
		

}
