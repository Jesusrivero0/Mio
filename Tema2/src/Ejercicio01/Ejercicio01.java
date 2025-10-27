package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cual es su año de nacimiento: ");
		Integer ano = scanner.nextInt();
		
		if (ano >= 1883 && ano <= 1900) {
			System.out.println("Generacion Perdida");
		}
		else if (ano >= 1901 && ano <= 1927) {
			System.out.println("Generacion grandiosa");
		}
		else if (ano >= 1928 && ano <= 1945) {
			System.out.println("Generacion silenciosa");
		}
		else if (ano >= 1946 && ano <= 1964) {
			System.out.println("Baby Boomers");
		}
		else if (ano >= 1965 && ano <= 1980) {
			System.out.println("Generacion X");
		}
		else if (ano >= 1981 && ano <= 1996) {
			System.out.println("Generacion Y");
		}
		else if (ano >= 1997 && ano <= 2012) {
			System.out.println("Generacion Z");
		}
		else if (ano >= 2013 && ano <= 2020) {
			System.out.println("Generacion Alfa");
		}
		
		scanner.close();
	}

}
