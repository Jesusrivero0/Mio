package Ejercicio11Repaso;

import java.util.Scanner;

public class Ejercicio11Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Integer respuesta = 0;
		Integer resultado = 0;
		do {
		System.out.println("Indica un numero");
		Integer n1 = scanner.nextInt();
		
		System.out.println("Indica un numero");
		Integer n2 = scanner.nextInt();
		
		System.out.println("*** MENU ***");
		System.out.println("/t 1. Sumar");
		System.out.println("/t 2. Restar");
		System.out.println("/t 3. Multiplicar");
		System.out.println("/t 4. Dividir");
		System.out.println("/t 0. Salir");
		respuesta = scanner.nextInt();
		
		
		
		
		if(respuesta == 1) {
			resultado = n1 + n2;
			System.out.println(resultado);
		}
		else if (respuesta == 2){
			resultado = n1 - n2;
			System.out.println(resultado);
		}
		else if (respuesta == 3) {
			resultado = n1 * n2;
			System.out.println(resultado);
		}
		else if (respuesta == 4) {
			if (n2 == 0) {
				System.out.println("No se puede dividir entre 0.");
			}
			else {
				resultado = n1 / n2;
				System.out.println(resultado);
			}
		}
		else if (respuesta == 0) {
			break;
		}
		}while (respuesta < 4);
		
		System.out.println("El programa ha terminado");
		
		scanner.close(); 
	}


}
