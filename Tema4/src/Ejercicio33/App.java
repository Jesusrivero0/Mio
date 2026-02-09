package Ejercicio33;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		
		List<Articulo> listaArticulo = new ArrayList<>();
		
		Cliente cliente = new Cliente("12345678D", "Blas De Los Montes");
		
		Carrito carrito = new Carrito(cliente);
		
		Ropa ropa = new Ropa("Poncho", 20, "XL", "azul");
		
		carrito.addArticulo(ropa);
		carrito.addArticulo(ropa);

		System.out.println(listaArticulo.toString());
		
		Libro libro = new Libro("Así habló Zaratustra", 15, "Nietzsche");
		
		carrito.addArticulo(libro);
		
		System.out.println(listaArticulo.toString());
		
		carrito.borrarArticulo(1);
		
		System.out.println(listaArticulo.toString());
		
		System.out.println(carrito.getPrecioMedia());
		
		carrito.vaciarCesta();
		
		System.out.println(listaArticulo.toString());
		
		System.out.println(carrito.getPrecioMedia());
		
		
	}

}
