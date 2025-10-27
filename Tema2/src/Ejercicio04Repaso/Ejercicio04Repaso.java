package Ejercicio04Repaso;

import java.util.Scanner;

public class Ejercicio04Repaso {

	public static final Double DESCUENTO1 = 0.40;
	public static final Double DESCUENTO2 = 0.20;
	public static final Double DESCUENTO3 = 0.10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime el precio");
		Double precio = scanner.nextDouble();

		System.out.println("Cuantas unidades");
		Double unidades = scanner.nextDouble();

		Double total = precio * unidades;

		System.out.println("Subtotal = " + precio + " * " + unidades + " = " + total);

		if (unidades > 100.00) {
			Double uno = (total * DESCUENTO1);
			System.out.println("Descuento = " + uno);
			Double total1 = total - uno;
			System.out.println("Total = " + total1);
		} else if (unidades > 25.00 && unidades < 100.00) {
			Double dos = (total * DESCUENTO2);
			System.out.println("Descuento = " + dos);
			Double total1 = total - dos;
			System.out.println("Total = " + total1);
		} else if (unidades > 10.00 && unidades < 24.00) {
			Double tres = (total * DESCUENTO3);
			System.out.println("Descuento = " + tres);
			Double total1 = total - tres;
			System.out.println("Total = " + total1);
		}

		scanner.close();
	}

}
