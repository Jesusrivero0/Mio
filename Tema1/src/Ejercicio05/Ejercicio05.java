package Ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

public static final Integer MESES = 12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuanto te gustaria ganar al año: ");
		
		Integer sueldo = scanner.nextInt();
		
		Integer sueldoFinal = sueldo / MESES;
		
		System.out.println("Tu sueldo mensual seria de " + sueldoFinal + " euros");
		
		scanner.close();
		
	}

}
