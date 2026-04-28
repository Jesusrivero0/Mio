package EjercicioPreExamen.App;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import EjercicioPreExamen.Modelo.Libreria;
import EjercicioPreExamen.Modelo.Libro;
import EjercicioPreExamen.Modelo.LibroSegundaMano;
import EjercicioPreExamen.Servicio.LibreriaService;
import EjercicioPreExamen.Servicio.LibroException;


public class App {

	public static Libreria solicitarLibreria(Scanner scanner) {

		
		Map<String, Libro> mapaLibro = new HashMap<>();
		Libreria l = new Libreria();
		String fin = "";

		l.setNombre("Paginas Desiertas");

		do {
			System.out.println("Dime el isbn");
			String isbn = scanner.nextLine();
			System.out.println("Dime autor");
			String autor = scanner.nextLine();
			System.out.println("Dime el titulo");
			String titulo = scanner.nextLine();
			System.out.println("Dime el precio");
			BigDecimal precio = scanner.nextBigDecimal();
			scanner.nextLine();
			System.out.println("Quieres continuar: (indica fin si quieres finalizar)");
			fin = scanner.nextLine();
			Libro l1 = new LibroSegundaMano(titulo, autor, isbn, precio);
			mapaLibro.put(isbn, l1);

		} while (!fin.equalsIgnoreCase("fin"));
		l.setMapaLibro(mapaLibro);
		
		return l;
	}
	

	public static void main(String[] args) {
		
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
		
		
		System.out.println("si quieres elimiar alguno di si");
		String respuesta = scanner.nextLine();

		
		if (respuesta.equalsIgnoreCase("si")) {
			for (Libro libro : valor) {	
				try {
					ls.eliminarLibro(libro.getIsbn());
				} catch (SQLException e) {
					e.getStackTrace();
					System.out.println(e.getMessage());
				}
			}
			
		}
		
		scanner.close();
	}

}
