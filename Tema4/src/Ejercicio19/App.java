package Ejercicio19;

public class App {
	public static void main(String[] args) {

		Semaforo s1 = new Semaforo();

		s1.setColor("Azul");
		System.out.println(s1);

		s1.setColor("verde");
		System.out.println(s1);

		s1.setParapadeando(true);
		System.out.println(s1);

		s1.setColor("amarillo");
		System.out.println(s1);

		s1.setParapadeando(true);
		System.out.println(s1);

		for (int i = 0; i < 5; i++) {
			s1.cambiarEstado();
		}

		Semaforo s2 = new Semaforo();
		s2.setColor("Azul");
		System.out.println(s2);

		s2.setColor("verde");
		System.out.println(s2);

		s2.setParapadeando(true);
		System.out.println(s2);

		s2.setColor("Amarillo");
		System.out.println(s2);

		s2.setParapadeando(true);
		System.out.println(s2);

		for (int i = 0; i < 5; i++) {
			s2.cambiarEstado();
		}

	}
}
