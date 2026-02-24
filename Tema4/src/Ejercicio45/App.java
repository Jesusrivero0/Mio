package Ejercicio45;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Geografia g = new Geografia();
		for (int i = 0; i < 2; i++) {
			System.out.println("dime un pais");
			String pais = scanner.nextLine();
			System.out.println("dime su capital");
			String capital = scanner.nextLine();

			g.agregarPais(pais, capital);
			
		}
		
		//scanner.nextLine();
		
		//System.out.println(mapaPaises);
		System.out.println(g.imprimirPaises());
		System.out.println(g.calcularLongitudMediaPaises());
		System.out.println("dime una letra");
		String letra = scanner.nextLine();
		g.imprimirNumeroPaisesLetra(letra);
		System.out.println(g.numeroPaisesConCapitalLetra(letra));
		g.eliminarPaisConCapitalLetra(letra);
		g.imprimirNumeroPaisesLetra(letra);
		
		
		
		scanner.close();

	}

}
