package modelo;

public class Entrenador {
	
	private String Nombre;
	private String Categoria;
	private int cupo = 0;
	public Boxeador boxAceptados[] = new Boxeador[5];
	

	
	
	public int getCupo() {
		return cupo;
	}
	public void setCupo(int cupo) {
		this.cupo = cupo;
	}
    
	public Boxeador[] getBoxAceptados() {
		return boxAceptados;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public void aceptoBoxeador(Boxeador b) {
		this.boxAceptados[this.getCupo()]= b;
		this.setCupo(this.getCupo()+1);	
		
	}
	public void imprimoEntrenador(Entrenador x) {
		System.out.println("Nombre Entrenador: "+ x.getNombre()+" ("+ x.getCupo()+") ");
		System.out.println("Categoria: "+ x.getCategoria());
		for (int i = 0; i < x.getCupo(); i++) {
			System.out.println("             "+ x.boxAceptados[i].getNombre());	
		}
		System.out.println("------------------------------------");
		
	}

	
}
