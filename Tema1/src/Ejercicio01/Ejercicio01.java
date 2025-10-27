package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Indica el nombre de usuario: ");
		
		String nombre = scanner.nextLine();
		
		System.out.print("Indica el nombre de su apellido: ");
		
		String apellido = scanner.nextLine();
		
		System.out.println("Su nombre completo es " + nombre + " " + apellido + ".");
		
		scanner.close();
	}

}
