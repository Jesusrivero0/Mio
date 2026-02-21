package Ejercicio42;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numero;
		Integer cont = 0;
		Map<Integer, Integer> mapa = new HashMap<>();
		do {
			System.out.println("Indica numeros cuando quieras finalizar pon el 0");
			numero = scanner.nextInt();
			if (numero != 0) {
				if (mapa.containsKey(numero)) {
					int valorActual = mapa.get(numero);
					mapa.put(numero, valorActual + 1);
				} else {
					mapa.put(numero, 1);
				}
				cont++;
			}
		} while (numero != 0);
		System.out.println("Total de numeros indicados: " + cont);
		System.out.println("Distribucion: ");
		Set<Entry<Integer, Integer>> pares = mapa.entrySet();
		for (Entry<Integer, Integer> par : pares) {
			System.out.println("Numero " + par.getKey() + ": " + par.getValue() + " veces");

		}

		scanner.close();

	}

}
