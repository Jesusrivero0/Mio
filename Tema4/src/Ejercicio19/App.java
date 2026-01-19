package Ejercicio19;

public class App {
	public static void main(String[] args) {

		Semaforo s1 = new Semaforo();
		//1
		s1.setColor("Azul");
		System.out.println(s1);
//2
		s1.setColor(Semaforo.VERDE);
		System.out.println(s1);
		//3
		s1.setParapadeando(true);
		System.out.println(s1);
		//4
		s1.setColor(Semaforo.AMARILLO);
		System.out.println(s1);
		//5
		s1.setParapadeando(true);
		System.out.println(s1);
		//6
		for (int i = 0; i < 5; i++) {
			s1.cambiarEstado();
		}

		Semaforo s2 = new Semaforo();
		s2.setColor(s1.getColor());
		s2.setParapadeando(s1.getParapadeando());
		System.out.println(s2);


	}
}
