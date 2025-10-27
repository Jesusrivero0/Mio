package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Integer numero = 0;
		Integer a = 0;
		Integer suma = 0;
		do {
			System.out.println("Indica un numero, que tiene que ser mayor a 2");
			numero = scanner.nextInt();
			Integer[] array = new Integer[numero];
			a = array[0] = 0;
			array[1] = 1;
			System.out.print(a + ",");
			for (int i = 2; i < numero; i++) {
				suma = array[1] + array[0];
				array[1] = array[0];
				array[0] = suma;
				if (i == numero - 1) {
					System.out.print(suma);
				} else {
					System.out.print(suma + ",");
				}
			}
		} while (numero < 2);
		scanner.close();
	}

}
