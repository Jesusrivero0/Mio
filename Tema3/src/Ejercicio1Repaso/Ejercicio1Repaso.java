package Ejercicio1Repaso;

public class Ejercicio1Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };

		Integer cont = 0;

		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] < 5) {
				cont++;
			}
		}

		System.out.println("Total suspensos " + cont);
	}

}
