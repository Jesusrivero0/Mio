package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Indica el nombre de usuario: ");

		String nombre = scanner.nextLine();
		
		System.out.println("Bienvenido " + nombre);
		
		System.out.println("¿De donde eres?: ");
		
		String ubicacion = scanner.nextLine();
		
		System.out.println("¿Que tal se vive en " + ubicacion + "?");
		
//		String respuesta = scanner.nextLine();
		
		System.out.println("Gracias. Un saludo.");
		
		scanner.close();
	}

}
