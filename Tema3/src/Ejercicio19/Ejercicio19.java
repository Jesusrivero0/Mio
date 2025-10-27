package Ejercicio19;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer vidas = 10;
		do {
			String[] arrayPalabra = new String[] { "azulejo", "tenedor", "saltamontes", "carretilla", "molinero",
					"sofisticado", "terremoto", "culinario", "teclado", "primavera" };

			Random random = new Random();
			Integer aleatorio = random.nextInt(arrayPalabra.length);

			String palabraElegida = arrayPalabra[aleatorio];

			String[] arrayUsuario = new String[palabraElegida.length()];
			String ale = palabraElegida.substring(0, 1);
			System.out.print(ale );
			for (int i = 0; i < arrayPalabra.length; i++) {

				System.out.print(" _ ");

			}
			System.out.println();
			for (int i = 0; i < arrayPalabra.length; i++) {
				System.out.println("Dime una letra");
				String letra = scanner.nextLine().trim();
				if (palabraElegida.contains(letra)) {
					arrayUsuario[i] = letra;
					System.out.println("correcto");
					// if (arrayUsuario.equals(arrayPalabra)) {
					// System.out.println("Correcto la palabra correcta era " +
					// arrayPalabra[aleatorio]);
					// }

				}

				else {
					vidas = vidas - 1;
					System.out.println("Vaya sigue intentalo de nuevo!! te quedan " + vidas + " vidas");
				}

				if (vidas <= 0) {
					System.out.println("Vata te quedastes sin vidas");
					break;
				}
			}

		} while (vidas > 0);
		scanner.close();

	}

}
