package Ejercicio43;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Map<String, List<String>> mapa = new HashMap<>();

		String cadena = "";
		String letra = "";
		do {
			System.out.println("Indica palabras cuando quieras finalizar pon fin como palabra");
			cadena = scanner.nextLine();
			String primeraLetra = cadena.substring(0, 1);
			
			if (!cadena.equals("fin")) {
				
				if (mapa.containsKey(primeraLetra)) {

					mapa.get(primeraLetra).add(cadena);
				} else {
					List<String> listaString = new ArrayList<>();

					listaString.add(cadena);

					mapa.put(primeraLetra, listaString);
				}
			}

		} while (!cadena.equalsIgnoreCase("fin"));

		System.out.println(mapa);

		do {
			System.out.println("dime una letra: ");
			letra = scanner.nextLine();
	
			if (letra.equalsIgnoreCase("fin")) {
				System.out.println("¡Gracias por jugar con nosotros! Bye");
				break;
			}
			
			if (mapa.containsKey(letra)) {
				List<String> lista = mapa.get(letra);
				System.out.println("Hay " + lista.size() + " palabras que empiezan por la letra " + letra);
				Set<Entry<String, List<String>>> pares = mapa.entrySet();
				for (Entry<String, List<String>> par : pares) {
					if (par.getKey().equals(letra)) {
						System.out.println("> " + par.getValue());
					}
				}

				System.out.println();

			}
		} while (true);
		scanner.close();
	}

}
