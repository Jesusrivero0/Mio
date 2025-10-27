package Ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static final Double IVA = 0.21;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Cual es el precio sin IVA: ");

		Double precioSinIVA = scanner.nextDouble();
		
		Double precioConIVA = precioSinIVA * IVA;
		
		Double precioTotal = precioSinIVA + precioConIVA;
		
		System.out.println("El precio sin iva es de " + precioSinIVA + " y el precio total es de " + precioTotal);
		
		scanner.close();
	}
}
