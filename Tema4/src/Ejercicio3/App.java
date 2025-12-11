package Ejercicio3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Cuales es el titulo del libro");
		String titulo = scanner.nextLine();

		System.out.println("Cual es el nombre del autor");
		String nombre = scanner.nextLine();

		System.out.println("Cuantas paginas llevas leidas");
		Integer paginasLeidas = scanner.nextInt();

		System.out.println("Cuantas paginas tiene el libro");
		Integer totalPaginas = scanner.nextInt();

		Libro libro = new Libro(titulo, nombre, totalPaginas);

		for (int i = 0; i < 3; i++) {
			scanner.nextLine();
			System.out.println("Como vas con el libro");
			String respuesta = scanner.nextLine();

			if (respuesta.equalsIgnoreCase("He avanzado")) {
				System.out.println("Cual es la cantidad de paginas que llevas leidas");
				paginasLeidas = scanner.nextInt();
				libro.leer(paginasLeidas);
				System.out.println(libro);
				/*scanner.nextLine();
				System.out.println("Quieres seguir (S/N)");
				String pal = scanner.nextLine();
				if (pal.equalsIgnoreCase("S")) {
					i = 0;
				} else {
					break;
				}*/
			} else if (respuesta.equalsIgnoreCase("He retrocedido")) {
				System.out.println("Cual es la cantidad de paginas que llevas leidas");
				paginasLeidas = scanner.nextInt();
				libro.retroceder(paginasLeidas);
				System.out.println(libro);
				/*scanner.nextLine();
				System.out.println("Quieres seguir (S/N)");
				String pal = scanner.nextLine();
				if (pal.equalsIgnoreCase("N")) {
					i = 0;
				} else {
					break;
				}*/
			} else if (respuesta.equalsIgnoreCase("He avandonado")) {
				System.out.println(libro);
				break;
			} else {
				break;
			}
		}

		scanner.close();

	}

}
