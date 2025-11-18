package Ejercicio7Repaso;

import java.util.Scanner;

public class Ejercicio7Repaso {

	public static final Double PRECIO = 0.24;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribre tu telegrama");
		String respuesta = scanner.nextLine();

		Double hola = 0.0;

		String[] arrayTelegrama = respuesta.split("STOP");
		for (int i = 0; i < arrayTelegrama.length; i++) {

			String[] aux = arrayTelegrama[i].split(" ");
			hola = hola + (aux.length * PRECIO);
		}
		
		System.out.println("El precio total es de " + hola);
		scanner.close();

	}

}
