package Ejercicio19;

import java.util.Random;

public class Ejercicio19 {

	public static void main(String[] args) {
		String[] arrayPalabra = new String[] { "azulejo", "tenedor", "saltamontes", "carretilla", "molinero",
				"sofisticado", "terremoto", "culinario", "teclado", "primavera" };

		Random random = new Random();
		Integer aleatorio = random.nextInt(0,10);
		
		String[] arrayUsuario = new String[aleatorio];
	}

}
