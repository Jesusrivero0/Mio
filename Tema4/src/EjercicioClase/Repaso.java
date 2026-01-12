package EjercicioClase;

public class Repaso {

	public static void main(String[] args) {

		String mensaje = "Hola como estas";
		Boolean haceSol = true;
		Integer dias = 7;
		Integer edad = 20;

		System.out.println(mensaje);

		Caballo caballo1 = new Caballo();
		// System.out.println(caballo1.color);

		// caballo1.color = "marron";
		caballo1.imprimeCarrerasGanadas();
		int año = caballo1.añoNacimiento();
		System.out.println(caballo1.añoNacimiento());

		caballo1.imprimeCarrerasGanadas();
		caballo1.incrementarCarrerasGanadas();
		caballo1.relincha();

		caballo1.setNombre("Bolita");
		caballo1.setColor("marron");
		caballo1.setEdad(2);
		caballo1.setCarrerasGanadas(10);
		System.out.println(caballo1.toString());

		Caballo caballo2 = new Caballo("fideo", "Blanco", 4, 20);
		
		System.out.println(caballo2.getCarrerasGanadas());
		
		Caballo caballo3 = new Caballo();
		caballo3.setNombre("Yuka");
		caballo3.setColor("castaño");
		caballo3.setEdad(8);
		caballo3.setCarrerasGanadas(100);
		System.out.println(caballo3.toString()
				);
	}
}
