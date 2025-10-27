package Ejercicio17;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		Double[] arrayDecimal = new Double[] {5.4, 3.1, 9.0, 4.7};
		Double suma = 0.0;
		for (Double valor : arrayDecimal) {
			System.out.print(valor + ", ");
		}
		System.out.println();
		for (Double valor : arrayDecimal) {
			suma = suma + valor;
			
		}
		System.out.println("La suma de todos los decimales es de " + suma);
	}

}
