package Ejercicio17Repaso;

import java.util.Scanner;

public class Ejercicio17Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Integer numero = 0;
		Integer a = 0;
		Integer b = 1;
		Integer suma = 0;
		
		
		do {
			System.out.println("Indica un numero, que tiene que ser mayor a 2");
			numero = scanner.nextInt();
			System.out.print(a +","+b+",");
			
			for (int i = 2; i < numero; i++) {
				
				suma = a + b; 
				a = b;
				b = suma;
				
				
				if (i == numero -1) {
				System.out.print(suma);
				}else {
					System.out.print(suma + ",");
				}
			}
		} while (numero < 2);

		scanner.close();
	}

}
