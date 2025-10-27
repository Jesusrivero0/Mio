package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Indica su nombre completo");
		String nombre = scanner.nextLine();
		String[] arraySplit = nombre.split(" ");

		for (int i = 0; i < arraySplit.length; i++) {
			System.out.println(arraySplit[i]);
			
		}		
		scanner.close();
	}

}
