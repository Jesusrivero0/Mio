package Ejercicio37;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<BigDecimal> numero = new ArrayList<>();

		BigDecimal aux = null;

		for (int i = 0; i < 5; i++) {
			System.out.println("Dime un numero");
			BigDecimal num = scanner.nextBigDecimal();
			if (aux == null || num.compareTo(aux) > 0) {
				numero.add(num);
			}
			aux = num;
		}

		BigDecimal suma = BigDecimal.ZERO;
		for (BigDecimal bigDecimal : numero) {
			suma = bigDecimal.add(bigDecimal);
		}
		System.out.println(suma.setScale(1, RoundingMode.HALF_DOWN));

		System.out.println(numero.get(2).divide(numero.get(1).setScale(3, RoundingMode.HALF_UP)));
		scanner.close();

	}

}
