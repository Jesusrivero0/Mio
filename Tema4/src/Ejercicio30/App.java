package Ejercicio30;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		
		

		Asesinio a1 = new Asesinio();
		a1.setCodigo(1);
		a1.setNombre("Blau");
		Asesinio a2 = new Asesinio();
		a2.setCodigo(2);
		a2.setNombre("Situletiens");
		Asesinio a3 = new Asesinio();
		a3.setCodigo(3);
		a3.setNombre("ConstructorAsesino");
		
		Jugador j1 = new Jugador();
		j1.setNombre("TeamBlas");
		
		Equipo e1 = new Equipo();
		
		j1.setEquipo(e1);
		/*
		e1.agregarPersonaje(a1);
		j1.getEquipo().
		*/
		e1.agregarPesonaje(a1);
		e1.agregarPesonaje(a2);
		e1.agregarPesonaje(a3);

		// 2

		Parasitos p1 = new Parasitos();
		p1.setNombre("Blas");
		p1.setCodigo(69);
		System.out.println();

		// 3

		e1.agregarPesonaje(p1);;

		// 4

		System.out.println(e1);

		// 5

		e1.agregarPesonaje(p1);;

		// 6

		// 7
		Parasitos p2 = new Parasitos();
		Parasitos p3 = new Parasitos();

		e1.agregarPesonaje(p2);
		e1.agregarPesonaje(p3);

		// 8
		System.out.println(e1);

		// 9

	}

}