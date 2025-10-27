package Ejercicio06Repaso;

public class Ejercicio06Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer total = 0;
		for (int i = 1; i <= 30; i++) {
			i += 2;
			if (i < 30) {
			System.out.print(i + " + ");
			total = total + i;
			} else {
				System.out.print(i + " = ");
			}
		}
		System.out.print(total);
	}

}
