package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static final Double NORMAL = 0.21;
	public static final Double REDUCIDO = 0.10;
	public static final Double SUPERREDUCIDO = 0.4;
	public static final Double EXCENTO = 0.0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime el precio sin iva");
		Integer precio = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Dime tipo de iva");
		String tipo = scanner.nextLine();
		
		if (tipo.equalsIgnoreCase("Normal")) {
			Double total = precio * NORMAL;
			System.out.println(total + " €");
		}
		else if (tipo.equalsIgnoreCase("Reducido")) {
			Double total = precio * REDUCIDO;
			System.out.println(total + " €");
		}
		else if (tipo.equalsIgnoreCase("Superreducido")) {
			Double total = precio * SUPERREDUCIDO;
			System.out.println(total + " €");
		}
		else if (tipo.equalsIgnoreCase("Excento")) {
			Double total = precio * EXCENTO;
			System.out.println(total + " €");
		}
		scanner.close();
		
	}

}
