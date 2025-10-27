package Ejericicio08;

import java.util.Scanner;

public class Ejericicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String n1;
		String n2;
		do {

			System.out.println("Indica una palabra");
			n1 = scanner.nextLine().trim();

			System.out.println("Indica otro numero");
			n2 = scanner.nextLine().trim();

		} while (!n1.equalsIgnoreCase(n2));

		System.out.println("Un saludo ya son iguales");

		scanner.close();
	}

}
