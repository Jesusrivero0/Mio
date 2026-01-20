package Ejercicio27;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Cual es el nombre del equipo");
		String nombreE1 = scanner.nextLine();
		Equipo equipo1 = new Equipo(nombreE1);

		for (int i = 0; i < 3; i++) {

			System.out.println("Cual es el nombre del jugador");
			String nombre = scanner.nextLine();

			System.out.println("Cual es el dorsal del jugador" + (i + 1));
			Integer dorsal = scanner.nextInt();
			scanner.nextLine();

			Jugador j1 = new Jugador(nombre, dorsal);
			equipo1.setCapitan(j1);
		}

		System.out.println(equipo1.toString());

		System.out.println("Cual es el nombre del equipo");
		String nombreE2 = scanner.nextLine();
		Equipo equipo2 = new Equipo(nombreE2);

		for (int j = 0; j < 3; j++) {

			System.out.println("Cual es el nombre del jugador" + (j + 1));
			String nombre = scanner.nextLine();

			System.out.println("Cual es el dorsal del jugador" + (j + 1));
			Integer dorsal = scanner.nextInt();
			scanner.nextLine();

			Jugador j2 = new Jugador(nombre, dorsal);
			equipo2.setCapitan(j2);
		}

		System.out.println(equipo2.toString());

		Resultado r1 = new Resultado();
		r1.setGolesLocales(0);
		r1.setGolesVisitantes(0);

		Partido p1 = new Partido();
		p1.setResultado(r1);
		System.out.println(p1.toString());

		System.out.println("Cuantos goles metio el equipo local");
		Integer golesLocal = scanner.nextInt();

		System.out.println("Cuantos goles metio el equipo visitante");
		Integer golesVisitante = scanner.nextInt();

		r1.setGolesLocales(golesLocal);
		r1.setGolesVisitantes(golesVisitante);
		p1.setResultado(r1);
		System.out.println(p1.toString());

		System.out.println("El equipo ganador es " + p1.getEquipoGanador());
		
		Jugador j3 = new Jugador("Blas Infiltrado",9);

		
		scanner.close();
	}

}
