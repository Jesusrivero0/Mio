package Ejercicio01Repaso;

import java.util.Scanner;

public class Ejercicio01Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime tu nombre");
		String nombre = scanner.nextLine();

		System.out.println("En que año nacistes");
		Integer ano = scanner.nextInt();

		System.out.println("Hola " + nombre + " nacistes en el año " + ano);

		scanner.close();
	}

}
