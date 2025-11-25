package Ejericicio04;

import java.util.Scanner;

public class Ejericicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuantos ingredientes debe llevar la receta");
		Integer cad = scanner.nextInt();
		scanner.nextLine();
		
		Double precio = 0.0;
		Double kg = 0.0;
		Double total = 0.0;
		
		for (int i = 1; i <= cad; i++) {
			
			System.out.println("Cual es el ingrediente " + i);
			String  ing1 = scanner.nextLine();

			System.out.println("Cuanto cuesta el kilo de " + ing1);
			precio = scanner.nextDouble();
			
			System.out.println("Cuantos kilos necesitas de " + ing1);
			kg = scanner.nextDouble();
			
			
			total = total + (precio * kg); 
		}
		
		
		
		System.out.println("El precio total: " + total + "€");
		
		scanner.close();
	}

}
