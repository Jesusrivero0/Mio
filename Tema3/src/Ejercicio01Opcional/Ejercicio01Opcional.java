package Ejercicio01Opcional;


public class Ejercicio01Opcional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arrayNum = new Integer[4];
		Integer sum = 0;
		for (int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = i+1;
			
		}
		for (Integer integer : arrayNum) {
			System.out.print(integer);
		}
		for (int i = 0; i < arrayNum.length; i++) {
			sum = sum + arrayNum[i];
		}
		System.out.println();
		System.out.println("La suma es de " + sum);
	}

}
