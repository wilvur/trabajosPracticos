package modelo;

public class Boxeador {
	private String nombre;
	private double peso;
	private String categoria;
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public  void calculoCategoria(double peso) {
		
			 if 	(peso >=  48.988 && peso < 52.163) {this.setCategoria("Mosca"); }
		else if 	(peso >=  52.163 && peso < 55.338) {this.setCategoria( "Gallo"); }
		else if 	(peso >=  55.338 && peso < 58.967) {this.setCategoria( "Pluma"); }
		else if 	(peso >=  58.967 && peso < 63.503) {this.setCategoria( "Ligero"); }
		else if 	(peso >=  63.503 && peso < 69.853) {this.setCategoria( "Welter"); }
		else if 	(peso >=  69.853 && peso < 76.205) {this.setCategoria( "Mediano"); }
		else if 	(peso >=  76.205 && peso < 91.000) {this.setCategoria( "Mediopesado"); }
		else if 	(peso >=  91.000) {this.setCategoria("pesado"); } 
		else {this.setCategoria( "Ninguna"); }
		
	}


	

}

