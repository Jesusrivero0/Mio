package Ejercicio10Repaso;

import java.util.Scanner;

public class Ejercicio10Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Cuantos alumnos hay en clase");
		Integer numero = scanner.nextInt();
		scanner.nextLine();

		Double total = 0.0;
		Double media = 0.0;
		Double[] array = new Double[3];
		do {
		for (int i = 1; i < numero; i++) {
			System.out.println("Cual es el nombre del alumnos " + i);
			String nombre = scanner.nextLine();
			
			scanner.nextLine();
			System.out.println("Cual es la nota de " + nombre + " del examen " + i);
			array[0] = scanner.nextDouble();
			
			System.out.println("Cual es la nota de " + nombre + " del examen " + i);
			array[1] = scanner.nextDouble();
			
			System.out.println("Cual es la nota de " + nombre + " del examen " + i);
			array[2] = scanner.nextDouble();
			total = array[0] + array[1] + array[2];
			
			media = total / 3;  
		}
		}while (numero>0);
		System.out.println("Listado de notas: ");
		System.out.println("    Alumno: " + media);
		
		System.out.println("Media de los alumnos: ");
		

		scanner.close();

	}

}
