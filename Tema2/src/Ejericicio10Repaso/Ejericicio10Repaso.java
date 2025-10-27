package Ejericicio10Repaso;

import java.util.Scanner;

public class Ejericicio10Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Indica una URL");
		String url = scanner.nextLine();
		
		Integer p2 = url.lastIndexOf("//");
		String primera = url.substring(0, p2 +2);
		Integer pPunto = url.indexOf(".");
		String segunda = url.substring(p2 + 2,pPunto  );
		Integer ultpunto = url.lastIndexOf(".");
		String tercera = url.substring(pPunto + 1, ultpunto);
		String cuarta = url.substring(ultpunto + 1);
		
		System.out.println(primera);
		System.out.println(segunda);
		System.out.println(tercera);
		System.out.println(cuarta);
		

		scanner.close();

	}

}
