package EjercicioPreExamen.App;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import EjercicioPreExamen.Modelo.Libreria;
import EjercicioPreExamen.Modelo.Libro;
import EjercicioPreExamen.Modelo.LibroSegundaMano;
import EjercicioPreExamen.Servicio.LibreriaService;
import EjercicioPreExamen.Servicio.LibroException;

public class App {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1.Insertar Libro Nuevo");
		System.out.println("2. Eliminar Libro Existente");
		System.out.println("3. Salir");
		Integer respuesta = scanner.nextInt();
		if(respuesta == 1) {
			insertarLibro();
		}
		if (respuesta == 2) {
			eliminarLibro();
		}
		if (respuesta == 3) {
			System.out.println("Saliendo");
		}
		scanner.close();;
	}

	public static Libreria solicitarLibreria(Scanner scanner) {

		Map<String, Libro> mapaLibro = new HashMap<>();
		Libreria l = new Libreria();
		String fin = "";
		
		l.setNombre("Paginas Desiertas");
		do {
			System.out.println("Indica los datos del libro");
			String respuesta = scanner.nextLine();
			String[] cadena = respuesta.split(";");
			
			Libro libro = new Libro();
			
			libro.setIsbn(cadena[0]);
			
			libro.setTitulo(cadena[1]);
			
			libro.setAutor(cadena[2]);
			
			libro.setPrecio(new BigDecimal(cadena[3]));
			
			System.out.println("Quieres continuar: (indica fin si quieres finalizar)");
			fin = scanner.nextLine();
			
			mapaLibro.put(libro.getIsbn(), libro);

		} while (!fin.equalsIgnoreCase("fin"));
		l.setMapaLibro(mapaLibro);
		
		return l;
	}

	public static void insertarLibro() {

		Scanner scanner = new Scanner(System.in);
		LibreriaService ls = new LibreriaService();
		
		Libreria l = solicitarLibreria(scanner);
		
		Map<String, Libro> mapaLibro = l.getMapaLibro();
		Collection<Libro> valor = mapaLibro.values();
		for (Libro libro : valor) {
			try {
				ls.insetarLibroNuevo(libro);
				System.out.println("Insertado");
			} catch (LibroException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(l.getPrecioMedio());
		System.out.println(l.getTasacionCompleta());

		scanner.close();
	}

	public static void eliminarLibro() {
		Scanner scanner = new Scanner(System.in);
		LibreriaService ls = new LibreriaService();
		System.out.println("Dime el isbn del que quieres borrar");
		String isbn = scanner.nextLine();
		try {
			ls.eliminarLibro(isbn);
			System.out.println("Eliminado");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}


}
