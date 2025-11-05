package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String num = "";

		do {
			System.out.println("Indica un numero mayor a 10000");
			num = scanner.nextLine();
		} while (num.compareTo("10000") < 0);

		String[] arrayNum = new String[num.length()];

		for (int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = num.substring(0, i + 1);
		}
		for (String string : arrayNum) {
			System.out.print(string + " / ");
		}

		scanner.close();
	}

}
