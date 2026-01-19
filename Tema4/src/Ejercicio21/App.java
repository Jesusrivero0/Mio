package Ejercicio21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List <Alumno> arrayAlumnos = new ArrayList<>();
		Alumno alumno;
		System.out.println("Cuantos alumnos tenemos");
		Integer cantAlumnos = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < arrayAlumnos.size(); i++) {

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

				Curso curso = new Curso(cantAlumnos);
				curso.setIdentificador(1);
				curso.setDescripcion("DAM-DAW");
				alumno.setCurso(curso);

				arrayAlumnos.add(alumno);
			} else {
				System.out.println("Error el dni no es valido");
				i = 0;

			}
		}

		for (Alumno alumno1 : arrayAlumnos) {
			if (alumno1.validar()) {
				System.out.println("Algun alumno falló");
			} else {
				System.out.println("Esta todo bien");
			}
		}

		if (arrayAlumnos.get(0).equals(arrayAlumnos.get(1))) {
			System.out.println("Error");
		} else if (arrayAlumnos.get(1).equals(arrayAlumnos.get(2))) {
			System.out.println("Error");
		} else {
			for (Alumno alumno1 : arrayAlumnos) {
				System.out.println(alumno1);
			}
		}
		scanner.close();
	}

}
