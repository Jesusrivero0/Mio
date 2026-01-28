package Ejercicio29;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Actores> listaActores1 = new ArrayList<>();
		List<Actores> listaActores2 = new ArrayList<>();

		Actores actor1 = new Actores();
		actor1.setNombre("Blas Blau");
		actor1.setNacionalidad("España");
		actor1.setAñoNacimiento(1983);

		Actores actor2 = new Actores();
		actor2.setNombre("Laura Pozo");
		actor2.setNacionalidad("Italia");
		actor2.setAñoNacimiento(1981);

		Actores actor3 = new Actores();
		actor3.setNombre("Marcel");
		actor3.setNacionalidad("Suiza");
		actor3.setAñoNacimiento(2001);

		Actores actor4 = new Actores();
		actor4.setNombre("Violeta Volo");
		actor4.setNacionalidad("Rusia");
		actor4.setAñoNacimiento(1999);

		Director director1 = new Director();
		director1.setNombre("Sara Marea");
		director1.setNacionalidad("Portugal");
		director1.setAñoNacimiento(1994);

		Gionista gionista1 = new Gionista();
		gionista1.setNombre("Marcos Smith");
		gionista1.setNacionalidad("Reino Unido");
		gionista1.setAñoNacimiento(1988);

		Gionista gionista2 = new Gionista();
		gionista2.setNombre("Cheng Shu");
		gionista2.setNacionalidad("China");
		gionista2.setAñoNacimiento(1977);

		Pelicula peli1 = new Pelicula();
		peli1.setAñoDeExtreno(2027);
		peli1.setDirector(director1);
		peli1.setGionista(gionista1);
		listaActores1.add(actor1);
		listaActores1.add(actor2);
		peli1.setTitulo("Do you know Joe Blas");
		peli1.setListaActores(listaActores1);

		Pelicula peli2 = new Pelicula();
		peli2.setAñoDeExtreno(2027);
		peli2.setDirector(director1);
		peli2.setGionista(gionista2);
		listaActores2.add(actor1);
		listaActores2.add(actor2);
		listaActores2.add(actor3);
		listaActores2.add(actor4);
		peli2.setTitulo("Muerte en la sombra");
		peli1.setListaActores(listaActores2);

		System.out.println(listaActores1);
		

		System.out.println();

		System.out.println(gionista1.getSueldo());
		System.out.println(gionista1.getNacionalidad());

		listaActores2.remove(3);
		listaActores1.add(actor3);
		System.out.println();
		System.out.println(listaActores2);
		
	}

}
