package Ejercicio5Repaso;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		
		Libro libro = new Libro("21", "Jesus", "Adan Y Eva", LocalDate.of(2020, 3, 12));
		Cd cd = new Cd("7", "Pepe", "Pinocho", LocalDate.of(2025, 9, 14));
		Revista revista = new Revista("2", "Rocio", "Eva", LocalDate.of(2022, 7, 2));
		
		libro.prestar();
		cd.prestar();
		libro.retirarParaConsultar();
		revista.retirarParaConsultar();
		
		System.out.println(libro);
		System.out.println(cd);
		System.out.println(revista);

		
		libro.devolver();
		libro.retirarParaConsultar();
		
		libro.getPrestado();
		
		System.out.println(libro);
		System.out.println(cd);
		System.out.println(revista);

		cd.devolver();
		libro.terminarConsulta();
		revista.terminarConsulta();
		
		System.out.println(libro.estaPrestado());
		System.out.println(cd.estaPrestado());
		
	}

}
