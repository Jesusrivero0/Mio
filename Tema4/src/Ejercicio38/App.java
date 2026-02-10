package Ejercicio38;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
				
		Cliente cliente = new Cliente("12345678D", "Blas De Los Montes");
		
		Carrito carrito = new Carrito(cliente);
		System.out.println(carrito);
		
		Ropa ropa = new Ropa();
		ropa.setColor("azul");
		ropa.setDescripcion("Poncho");
		ropa.setTalla("xl");
		ropa.setPrecio(new BigDecimal(20));
		
		carrito.addArticulo(ropa);
		carrito.addArticulo(ropa);

		System.out.println(carrito);
		
		Libro libro = new Libro();
		libro.setAutor("Nietzsche");
		libro.setDescripcion("Asi hablo Zaratustra");
		libro.setPrecio(new BigDecimal (15));
			
		carrito.addArticulo(libro);
		
		System.out.println(carrito);
		
		carrito.borrarArticulo(1);
		
		System.out.println(carrito);
		
		System.out.println(carrito.getPrecioMedia());
		
		carrito.vaciarCesta();
		
		System.out.println(carrito);
		
		System.out.println(carrito.getPrecioMedia());
		
		
	}

}
