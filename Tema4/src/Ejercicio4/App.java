package Ejercicio4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Cual es el dni del alumno");
		String dni = scanner.nextLine();
		Persona persona1 = new Persona(dni);
		Alumno alumno = new Alumno(dni);
		Curso curso = new Curso();
		alumno.setDni(dni);

		System.out.println("Cual es nombre del alumno");
		String nombre = scanner.nextLine();
		persona1.setNombre(nombre);

		System.out.println("Cual es la edad del alumno");
		Integer edad = scanner.nextInt();
		persona1.setEdad(edad);

		System.out.println("Cual es la nota del alumno");
		Integer nota = scanner.nextInt();
		alumno.setNota(nota);
		alumno.aprobar();

		System.out.println("Cual es el identificador del alumno");
		Integer identificador = scanner.nextInt();
		curso.setIdentificador(identificador);

		System.out.println("Cual es la descripcion del alumno");
		String descripcion = scanner.nextLine();
		curso.setDescripcion(descripcion);
		
		alumno.setCurso(curso);

		System.out.println(alumno.toString());

		scanner.close();
	}

}
