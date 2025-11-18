package Ejercicio10Repaso;

import java.util.Scanner;

public class Ejercicio10Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Cuantos alumnos hay en clase");
		Integer numero = scanner.nextInt();

		Integer primero = 0;
		Integer total = 0;
		String[] arraynom = new String[numero];
		Integer nota1 = 0;
		Integer nota2 = 0;
		Integer nota3 = 0;

		for (int i = 0; i < numero; i++) {
			scanner.nextLine();
			System.out.println("Cual es el nombre del alumnos " + i);
			arraynom[i] = scanner.nextLine();

			System.out.println("Cual es la nota de " + arraynom[i] + " del examen 1");
			nota1 = scanner.nextInt();

			System.out.println("Cual es la nota de " + arraynom[i] + " del examen 2");
			nota2 = scanner.nextInt();

			System.out.println("Cual es la nota de " + arraynom[i] + " del examen 3");
			nota3 = scanner.nextInt();

			primero = nota1 + nota2 + nota3;
			total = total + primero;
		}

		System.out.println("Listado de notas: ");
		for (int i = 0; i < numero; i++) {
			System.out.println("   Alumno: " + arraynom[i] + (primero / 3));
		}
		System.out.println("Media de los alumnos: " + (total / (numero * 3)));

		scanner.close();

	}

}
