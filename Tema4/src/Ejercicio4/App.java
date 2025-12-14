package Ejercicio4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Cual es el dni del alumno");
		String dni = scanner.nextLine();

		Alumno alumno = new Alumno(dni);
		alumno.setDni(dni);

		System.out.println("Cual es nombre del alumno");
		String nombre = scanner.nextLine();
		alumno.setNombre(nombre);

		System.out.println("Cual es la edad del alumno");
		Integer edad = scanner.nextInt();
		alumno.setEdad(edad);

		System.out.println("Cual es la nota del alumno");
		Integer nota = scanner.nextInt();
		alumno.setNota(nota);
		alumno.aprobar();

		System.out.println(alumno.toString());

		scanner.close();
	}

}
