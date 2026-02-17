package Ejercicio41;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {

		Evaluacion eva = new Evaluacion();
		// 1
		eva.addNota("12345678G", new BigDecimal(3.2));
		eva.addNota("56236123F", new BigDecimal(2.4));
		eva.addNota("75463452J", new BigDecimal(9.8));
		eva.addNota("12342323U", new BigDecimal(7.5));
		eva.addNota("23456342K", new BigDecimal(5.7));

		System.out.println(eva);

		// 2
		eva.addNota("12342323U", new BigDecimal(7));
		System.out.println(eva);

		// 3
		eva.addNota("12342323U", new BigDecimal(7));
		eva.addNota("46452341Ñ", new BigDecimal(9));
		System.out.println(eva);

		// 4
		System.out.println(eva.obternerNotaAlumno("12345678G"));
		// System.out.println(eva.obtenerNotaMedia());
/*
		// 5
		System.out.println(eva.obtenerCantidadaAprobados());

		// 7
		System.out.println(eva.obtenerCantidadSuspenso());

		// 8
		//eva.borrarAprobados();
		//System.out.println(eva);
		 */
	}

}
