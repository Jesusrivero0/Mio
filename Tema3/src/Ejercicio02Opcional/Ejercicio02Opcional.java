package Ejercicio02Opcional;

import java.util.Scanner;

public class Ejercicio02Opcional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arrayNum = new Integer[5];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un valor entre 0 y 4");
		Integer num = scanner.nextInt();
		
		for (int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = i + 1;
			
		}
		System.out.print(arrayNum[num]);
			
		
		
		
		scanner.close();
	}

}
