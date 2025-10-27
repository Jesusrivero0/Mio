package Ejercicio02Repaso;

import java.util.Scanner;

public class Ejercicio02Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime un nombre de ciudad");
		String nombre1 = scanner.nextLine();
		
		System.out.println("Dime otro nombre de ciudad");
		String nombre2 = scanner.nextLine();
		
		System.out.println("Dime otro nombre de ciudad");
		String nombre3 = scanner.nextLine();
		
		if (nombre1.length() <= nombre2.length() && nombre2.length() <= nombre3.length()) {
			System.out.println(nombre1);
			System.out.println(nombre2);
			System.out.println(nombre3);
		}
		else if(nombre3.length() <= nombre2.length() && nombre2.length() <= nombre1.length()) {
			System.out.println(nombre3);
			System.out.println(nombre2);
			System.out.println(nombre1);			
		}
		else if(nombre2.length() <= nombre1.length() && nombre1.length() <= nombre3.length()) {
			System.out.println(nombre2);
			System.out.println(nombre1);
			System.out.println(nombre3);			
		}
		else if(nombre3.length() <= nombre1.length() && nombre1.length() <= nombre2.length()) {
			System.out.println(nombre3);
			System.out.println(nombre1);
			System.out.println(nombre2);			
		}
		else if(nombre1.length() <= nombre3.length() && nombre3.length() <= nombre2.length()) {
			System.out.println(nombre1);
			System.out.println(nombre3);
			System.out.println(nombre2);			
		}
		else if(nombre2.length() <= nombre3.length() && nombre3.length() <= nombre1.length()) {
			System.out.println(nombre2);
			System.out.println(nombre3);
			System.out.println(nombre1);			
		}
		
		
		scanner.close();
	}

}
