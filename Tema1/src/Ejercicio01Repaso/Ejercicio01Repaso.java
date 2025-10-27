package Ejercicio01Repaso;

import java.util.Scanner;

public class Ejercicio01Repaso {
public static final Double PI = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Indica el radio del circulo: ");
		Double radio = scanner.nextDouble();
		
		
		Double area = PI * (radio * radio); 
		Double circunferencia = (radio * 2) * PI;
		
		System.out.println("El area es " + area + " y la circunferencia es " + circunferencia);
		
		scanner.close();
	}

}
