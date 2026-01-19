package Ejercicio20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<String> listaCadenas = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Dime la cadena " + (i + 1));
			String cad = scanner.nextLine();
			listaCadenas.add(cad);
		}
		System.out.println(listaCadenas.toString());

		for (int i = 0; i < 5; i++) {
			System.out.println(listaCadenas.get(i).toUpperCase());
		}

		if (listaCadenas.isEmpty()) {
			System.out.println("Esta vacia");
		}

		for (int i = 0; i < listaCadenas.size(); i++) {
			if (listaCadenas.get(i).length() < 6) {
				listaCadenas.remove(i);
			}

		}
		System.out.println(listaCadenas.toString());
		scanner.close();
	}

}
