package Ejercicio05;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer numero = 0;
		Integer total = 0;
		do {

			numero += 1;
			total = total + numero;

		} while (numero < 10000);
		System.out.print("La suma de todos los numeros desde el 1 al 10000 es: " + total);
	}

}
