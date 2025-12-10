package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero entre el 1 y el 9");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(". ");
			}
			for (int k = n; k >= n - i + 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}
}
