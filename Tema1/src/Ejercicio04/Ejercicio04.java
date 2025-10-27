package Ejercicio04;

import java.util.Scanner;


public class Ejercicio04 {

	public static final Integer AÑO_ACTUAL = 2025;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Indica su año de nacimiento: ");
		
		Integer añoNacimiento = scanner.nextInt();
		
		Integer añoFinal = añoNacimiento - AÑO_ACTUAL;
		
		System.out.println("Usted tiene " + añoFinal );
		
		scanner.close();
		
	}

}
