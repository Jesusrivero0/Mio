package Ejercicio07repaso;

import java.util.Scanner;

public class Ejercicio07repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Indica un numero que sera el multiplo por el que se multiplicara: ");
		Integer numero = scanner.nextInt();
		int num=0;
		int total =0;
		do {
			for (int i = 0; i < 10; i++) {
			    num = numero + num;
				if (i < 9) {
					System.out.print(num + " + ");
					total = total + num;
				} else {
					System.out.print(num + " = ");
					total = total + num;
					break;
				}
				
			}
			
			if (numero == 0) {
				System.out.println("Adios, termino el programa");
			}
			
		} while (numero < 1 ||numero > 10);

		System.out.print(total);

		scanner.close();
	}

}
