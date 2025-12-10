package Ejercicio2;

import java.util.Scanner;

public class ConsoleInOut {

	private Scanner scanner;

	public ConsoleInOut() {
		this.scanner = new Scanner(System.in);
	}

	public void close() {
		scanner.close();
	}

	public void write(String palabra) {
		System.out.println(palabra);
	}

	public Integer readInteger(String palabra) {
		write(palabra);
		Integer num1 = this.scanner.nextInt();
		return num1;
	}

	public Integer readInteger(String palabra, Integer min, Integer max) {
		Boolean v;
		System.out.println(palabra);
		Integer num1;
		do {
			num1 = this.scanner.nextInt();
			if (num1 < max && num1 > min) {
				v = false;
			} else {
				System.out.println("Incorrecto");
				v = true;
			}
			return num1;
		} while (v);
	}

	public Double readDouble(String palabra) {
		write(palabra);
		Double num1 = this.scanner.nextDouble();
		return num1;
	}

	public Double readDouble(String palabra, Double min, Double max) {
		Boolean v;
		System.out.println(palabra);
		Double num1;
		do {
			num1 = scanner.nextDouble();
			if (num1 < max && num1 > min) {
				v = false;
			} else {
				System.out.println("Incorrecto");
				v = true;
			}
			return num1;
		} while (v);
	}

	public String readString(String palabra) {
		write(palabra);
		Boolean v = false;
		do {
			if (palabra.isEmpty()) {
				v = false;
			} else {
				System.out.println("Erorr");
			}
		} while (v);
		return this.scanner.nextLine();
	}

	public void waitEnter() {
		write("Pulse ENTER para continuar");
		scanner.next();
	}

	public Boolean isContinue() {
		write("Desea continuar (S/N)");
		String respuesta = scanner.nextLine();
		if (respuesta.equalsIgnoreCase("s")) {
			return true;
		} else {
			return false;
		}

	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	
}
