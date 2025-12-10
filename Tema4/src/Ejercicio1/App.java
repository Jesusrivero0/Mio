package Ejercicio1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calc1 = new Calculadora();
		Double total = 0.0;
		Integer num;
		do {
			System.out.println("Que quieres hacer??");
			System.out.println("1.restar");
			System.out.println("2.sumar");
			System.out.println("3.multiplicar");
			System.out.println("4.multiplicar");
			System.out.println("5.poner a 0");
			System.out.println("0.terminar");
			num = sc.nextInt();
			if (num == 1) {
				System.out.println("Cuanto quieres restar?");
				Double dou1 = sc.nextDouble();
				System.out.println(calc1.restar(dou1));
			} else if (num == 2) {
				System.out.println("Cuanto quieres sumar?");
				Double dou1 = sc.nextDouble();
				System.out.println(calc1.sumar(dou1));
			} else if (num == 3) {
				System.out.println("Cuanto quieres multiplicar?");
				Double dou1 = sc.nextDouble();
				System.out.println(calc1.multiplicar(dou1));
			} else if (num == 4) {
				System.out.println("Cuanto quieres dividir?");
				Double dou1 = sc.nextDouble();
				System.out.println(calc1.dividir(dou1));
			} else if (num == 5) {
				System.out.println("Poniendo valor a 0");
				System.out.println(calc1.cero());
			} else if (num == 0) {
				System.out.println(calc1.getValor());
			}
		} while (num != 0);
	}
}
