package ejercicio16;

public class ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer numero = 0;
		Integer total = 0;
			for (int i = 0; i < 10000; i++) {
			numero += 1;
			total = total + numero;
			}
		System.out.print("La suma de todos los numeros desde el 1 al 10000 es: " + total);
	}

}
