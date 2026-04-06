package Ejercicio09;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Persona p = new Persona();
		Sociedad s = new Sociedad();
		try {
			do{
			System.out.println("dime tu altura maquina");
			Integer altura = scanner.nextInt();
			BigDecimal altura1 = new BigDecimal(altura);
			p.setAltura(altura1);
			scanner.nextLine();
			System.out.println("dime tu genero");
			String genero = scanner.nextLine();
			p.setGenero(genero);
			s.addPersona(genero, altura1);
			s.borrarGenero(genero);
			System.out.println(s.getConjunto());
			} while (true);

		} catch (ParametroIncorrectoException e) {
			System.out.println(e.getMessage());
		}
		finally {
			scanner.close();
		}

	}

}
