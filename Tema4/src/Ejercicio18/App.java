package Ejercicio18;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Reloj reloj = new Reloj();

		Scanner scanner = new Scanner(System.in);

		reloj.setFormato24Horas(false);
		System.out.println(reloj);
		
		reloj.ponerEnHora(24, 17);
		System.out.println(reloj);
		
		reloj.ponerEnHora(21, 82);
		System.out.println(reloj);
		
		reloj.ponerEnHora(17, 16, 15);
		System.out.println(reloj);
		
		Reloj reloj1 = new Reloj();
		
		reloj1.ponerEnHora(17, 16, 15);
		
		System.out.println(reloj1.equals(reloj))
		;
		
		
		scanner.close();
	}

}
