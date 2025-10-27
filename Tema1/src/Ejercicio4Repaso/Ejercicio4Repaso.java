package Ejercicio4Repaso;

import java.util.Scanner;

public class Ejercicio4Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Indica su numero favorito");
		Integer numeroFavorito = scanner.nextInt();
		
		scanner.nextLine(); 
		
		System.out.println("Cual es su ciudad favorita");
		String cuidadFavorita = scanner.nextLine();
		
		
		System.out.println(numeroFavorito + cuidadFavorita);
		scanner.close();
	}

}
