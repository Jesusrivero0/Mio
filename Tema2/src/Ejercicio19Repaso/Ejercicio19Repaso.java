package Ejercicio19Repaso;

import java.util.Scanner;

public class Ejercicio19Repaso {
	public static final Double CAMBIO = 166.386;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Double euros = 0.0;
		Double pesetas = 0.0;
		String respuesta = "";
	do {
		System.out.println("\t 1 - Pasar de Pesetas a Euros");
		System.out.println("\t 2 - Pasar de Euros a Pesetas");
		System.out.println("\t 3 - Salir");
		respuesta = scanner.nextLine();
		if (respuesta.equals("1")) {
			System.out.println("Cual es la cantidad que deseas transformar");
			pesetas = scanner.nextDouble();
			euros = pesetas / CAMBIO;
			System.out.println(euros);
			scanner.nextLine();
		}
		if (respuesta.equals("2")) {
			System.out.println("Cual es la cantidad que deseas transformar");
			euros = scanner.nextDouble();
			pesetas = euros / CAMBIO;
			System.out.println(pesetas);
			scanner.nextLine();
		}
		if (respuesta.equals("3")) {
			System.out.println("bye");
		}
	}while (respuesta.equals("1") || respuesta.equals("2"));
		scanner.close();
	}

}
