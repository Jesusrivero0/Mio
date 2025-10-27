package Ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Indica su nombre completo");
		String nombre = scanner.nextLine();
		
		Integer primero1 = nombre.indexOf(" ");
		String primero = nombre.substring(0,primero1);
		
		Integer medio1 = nombre.lastIndexOf(" ");
		String medio = nombre.substring(primero1 +1,medio1);
		
		String ultimo = nombre.substring(medio1);

		
		System.out.println("Su nombre es " + primero);
		System.out.println("Su apellido 1 es " + medio);
		System.out.println("Su apellido 2 es" + ultimo);
	}

}
