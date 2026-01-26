package Ejercicio24;

public class App {

	public static void main(String[] args) {
		
		PilaCadenas pila = new PilaCadenas();
		
		pila.añadirPila("primero");
		System.out.println(pila.toString());
		
		pila.añadirPila("segundo");
		System.out.println(pila.toString());
		
		pila.sacarCadena();
		System.out.println(pila.toString());
		
		pila.añadirPila("tercero");
		System.out.println(pila.toString());
		
		pila.sacarCadena();
		System.out.println(pila.toString());
		
		pila.sacarCadena();
		System.out.println(pila.toString());
		
		pila.añadirPila("cuarto");
		System.out.println(pila.toString());
		
		

	}

}
