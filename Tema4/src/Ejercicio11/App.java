package Ejercicio11;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Alumno[] arrayAlumnos = new Alumno[3];
		Alumno alumno;

		for (int i = 0; i < arrayAlumnos.length; i++) {
			System.out.println("Cual es el dni del alumno");
			String dniAlumno = scanner.nextLine();
			alumno = new Alumno(dniAlumno);
			

			if (alumno.validarDni()) {
				System.out.println("Cual es nombre del alumno");
				String nombreAlumno = scanner.nextLine();
				alumno.setNombre(nombreAlumno);

				System.out.println("Cual es la edad del alumno");
				Integer edadAlumno = scanner.nextInt();
				alumno.setEdad(edadAlumno);

				System.out.println("Cual es la nota del alumno");
				Integer notaAlumno = scanner.nextInt();
				alumno.setNota(notaAlumno);
				alumno.aprobar();
				scanner.nextLine();

				Curso curso = new Curso();
				curso.setIdentificador(1);
				curso.setDescripcion("DAM-DAW");
				alumno.setCurso(curso);

				arrayAlumnos[i] = alumno;
			} else {
				System.out.println("Error el dni no es valido");
				i = 0;

			}
		}
		if (arrayAlumnos[0].equals(arrayAlumnos[1])) {
			System.out.println("Error");
		} else if (arrayAlumnos[1].equals(arrayAlumnos[2])) {
			System.out.println("Error");
		} else {
			for (Alumno alumno1 : arrayAlumnos) {
				System.out.println(alumno1);
			}
		}
		// System.out.println(alumno.toString());

		scanner.close();
	}

}
