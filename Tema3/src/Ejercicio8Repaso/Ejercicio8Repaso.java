package Ejercicio8Repaso;

import java.util.Scanner;

public class Ejercicio8Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe tu HTML");
		String respuesta = scanner.nextLine();

		String[] array = respuesta.split("</>");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			
		}
		scanner.close();
	}

}
