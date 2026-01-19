package Ejercicio23;

public class App {

	public static void main(String[] args) {
		
		ColaCadenas cola = new ColaCadenas();
		
		cola.añadirCadena("primero");
		System.out.println(cola.toString());
		
		cola.añadirCadena("segundo");
		System.out.println(cola.toString());
		
		cola.sacarCadena();
		System.out.println(cola.toString());
		
		cola.añadirCadena("tercero");
		System.out.println(cola.toString());
		
		cola.sacarCadena();
		System.out.println(cola.toString());
		
		cola.sacarCadena();
		System.out.println(cola.toString());
		
		cola.añadirCadena("cuarto");
		System.out.println(cola.toString());
		
		
	}

}
