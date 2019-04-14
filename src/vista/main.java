package vista;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import modelo.Boxeador;
import modelo.Entrenador;

public class main {	
	
	public static void main(String[] args) {
		
		int recha = 0;
		int cantidadDeIngresos = 25;
		int cupoMaxEntrenador  = 5;
		String mensajeIngreso = "";
		Boxeador boxRechazados[] = new Boxeador[5];
		
		
		//cargo los nombre de los entrenadores
		Entrenador e1 = new Entrenador(); e1.setNombre("John Senna");
		Entrenador e2 = new Entrenador(); e2.setNombre("Javier");
		Entrenador e3 = new Entrenador(); e3.setNombre("Alexander");
		Entrenador e4 = new Entrenador(); e4.setNombre("Jonathan");
		
		e1.setCategoria("Mosca, Gallo");
		e2.setCategoria("Pluma, Ligero");
		e3.setCategoria("Welter, Mediano");
		e4.setCategoria("Mediopesado, Pesado");
		
		
		for (int i = 0; i < cantidadDeIngresos; i++) {
			
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese nombre boxeador:  \n");
		
		Boxeador b = new Boxeador();
		b.setNombre(s.nextLine());
		System.out.println("ingrese el peso:   \n");
		
		b.setPeso(s.nextDouble());
		b.calculoCategoria(b.getPeso()) ;
		
		   if (b.getCategoria() == "Mosca"||  b.getCategoria() == "Gallo")  {
				if(e1.getCupo() < cupoMaxEntrenador) {
					e1.aceptoBoxeador(b);
					
					mensajeIngreso = "El boxeador "+b.getNombre()+" ingresado en la categoria " + b.getCategoria() + " Cupo de "+ e1.getNombre()+" "+ e1.getCupo()+"/"+ cupoMaxEntrenador ;
						
				} else {
					boxRechazados[recha]= b;
					recha++;
					mensajeIngreso = "El boxeador "+b.getNombre()+" fue rechazado por cupo ";
					
				}
				
			}
		   if (b.getCategoria() == "Pluma"||  b.getCategoria() == "Ligero")  {
				if(e2.getCupo() < cupoMaxEntrenador) {
					//ingresoOK
					e2.aceptoBoxeador(b);
					mensajeIngreso = "El boxeador "+b.getNombre()+" ingresado en la categoria " + b.getCategoria() + " Cupo de "+ e2.getNombre()+" "+ e2.getCupo()+"/"+ cupoMaxEntrenador ;
				} else {
					boxRechazados[recha]= b;
					recha++;
					mensajeIngreso = "El boxeador "+b.getNombre()+" fue rechazado por cupo";
					
				}				
			}
		   if (b.getCategoria() == "Welter"||  b.getCategoria() == "Mediano")  {
				if(e3.getCupo() < cupoMaxEntrenador) {
					e3.aceptoBoxeador(b);
					
					mensajeIngreso = "El boxeador "+b.getNombre()+" ingresado en la categoria " + b.getCategoria() + " Cupo de "+ e3.getNombre()+" "+ e3.getCupo()+"/"+ cupoMaxEntrenador ;
				} else {
					boxRechazados[recha]= b;
					recha++;
					mensajeIngreso = "El boxeador "+b.getNombre()+" fue rechazado por cupo";
					
				}
				
			}
		   if (b.getCategoria() == "Mediopesado"||  b.getCategoria() == "pesado")  {
				if(e4.getCupo() < cupoMaxEntrenador) {
					e4.aceptoBoxeador(b);
					mensajeIngreso = "El boxeador "+b.getNombre()+" ingresado en la categoria " + b.getCategoria() + " Cupo de "+ e4.getNombre()+" "+ e4.getCupo()+"/"+ cupoMaxEntrenador ;
				} else {
					boxRechazados[recha]= b;
					recha++;
					mensajeIngreso = "El boxeador "+b.getNombre()+" fue rechazado por cupo";
					
				}				
			}
		   if(b.getCategoria() == "Ninguna") { 
			   mensajeIngreso = "Categoria no compatible";
			   boxRechazados[recha]= b;
			   recha++;
		   
		   }

		System.out.println(mensajeIngreso + "\n");
		
		}
		// Datos a Mostrar
		e1.imprimoEntrenador(e1);
		e2.imprimoEntrenador(e2);
		e3.imprimoEntrenador(e3);
		e4.imprimoEntrenador(e4);
		
		System.out.println("Boxeadores rechazos: "+"("+recha+")");
		for (int i = 0; i < recha; i++) {
			System.out.println("Nombre: "+ boxRechazados[i].getNombre() +" Categoria: "+boxRechazados[i].getCategoria());
		}


		
	}
	


}
