package Ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		ArrayList<Integer> miLista = new ArrayList<>();

		do {
			
			System.out.println("Indica numeros");
			num = scanner.nextInt();
			if(num != -1) {
			miLista.add(num);
			}

		} while (num != -1);
		
		System.out.println(miLista);

		scanner.close();
		
	}

}
