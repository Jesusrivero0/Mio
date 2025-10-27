package Ejercicio01;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] primero = new Integer[15];
		for (int i = 0; i < 15; i++) {
				Integer valor = i+1;
				valor = valor + valor;
				primero[i] = valor;
		}
		for (int j = 0; j < primero.length; j++) {
			if(j < 14) {
			System.out.print(primero[j] + ", ");
			}
			else {
				System.out.println(primero[j]);
			}
			
		}
			
		
	}

}
