package Ejercicio2;

import Ejercicio1.Calculadora;

public class App {

	public static void main(String[] args) {

		ConsoleInOut console = new ConsoleInOut();
		Calculadora calc1 = new Calculadora();

		Integer num;

		do {
			console.write("Que quieres hacer");
			console.write("1.restar");
			console.write("2.sumar");
			console.write("3.multiplicar");
			console.write("4.multiplicar");
			console.write("5.poner a 0");
			console.write("0.terminar");

			num = console.readInteger("opcion", 1, 6);

			if (num == 1) {
				console.write("Cuanto quieres restar?");
				Double dou1 = console.readDouble("");
				System.out.println(calc1.restar(dou1));
			} else if (num == 2) {
				console.write("Cuanto quieres sumar?");
				Double dou1 = console.readDouble("");
				System.out.println(calc1.sumar(dou1));
			} else if (num == 3) {
				console.write("Cuanto quieres multiplicar?");
				Double dou1 = console.readDouble("");
				System.out.println(calc1.multiplicar(dou1));
			} else if (num == 4) {
				console.write("Cuanto quieres dividir?");
				Double dou1 = console.readDouble("");
				System.out.println(calc1.dividir(dou1));
			} else if (num == 5) {
				console.write("Poniendo valor a 0");
				System.out.println(calc1.cero());
			} else if (num == 0) {
				System.out.println(calc1.getValor());
			}

			console.isContinue();
		} while (num != 0);
		
		console.write("valor de la calculadora" + calc1.getValor());
		
		console.close();
	}

}
