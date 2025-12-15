package Ejercicio9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Cual es el dni del alumno");

		String dniAlumno = scanner.nextLine();
		Persona persona1 = new Persona(dniAlumno);
		Alumno alumno = new Alumno(dniAlumno);
		Curso curso = new Curso();

		alumno.setDni(dniAlumno);

		System.out.println("Cual es nombre del alumno");
		String nombreAlumno = scanner.nextLine();
		persona1.setNombre(nombreAlumno);

		System.out.println("Cual es la edad del alumno");
		Integer edadAlumno = scanner.nextInt();
		persona1.setEdad(edadAlumno);

		System.out.println("Cual es la nota del alumno");
		Integer notaAlumno = scanner.nextInt();
		alumno.setNota(notaAlumno);
		alumno.aprobar();

		System.out.println("Cual es el identificador del alumno");
		Integer identificadorAlumno = scanner.nextInt();
		curso.setIdentificador(identificadorAlumno);

		scanner.nextLine();

		System.out.println("Cual es la descripcion del alumno");
		String descripcionAlumno = scanner.nextLine();
		curso.setDescripcion(descripcionAlumno);

		alumno.setCurso(curso);

		System.out.println("Cual es el dni del profesor");
		String dniProfesor = scanner.nextLine();
		Profesor profesor = new Profesor(dniProfesor);

		System.out.println("Cual es nombre del profesor");
		String nombreProfesor = scanner.nextLine();
		profesor.setNombre(nombreProfesor);

		System.out.println("Cual es la edad del profesor");
		Integer edadProfesor = scanner.nextInt();
		profesor.setEdad(edadProfesor);

		System.out.println("Cual es el identificador del profesor");
		Integer identificadorProfesor = scanner.nextInt();
		curso.setIdentificador(identificadorProfesor);

		scanner.nextLine();

		System.out.println("Cual es la descripcion del profesor");
		String descripcionProfesor = scanner.nextLine();
		curso.setDescripcion(descripcionProfesor);

		profesor.setCurso(curso);

		System.out.println(profesor.toString());
		System.out.println(alumno.toString());

		scanner.close();
	}

}
