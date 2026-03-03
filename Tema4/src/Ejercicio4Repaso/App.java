package Ejercicio4Repaso;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		
		LocalDate fechaD1 = LocalDate.of(2000, 4, 12);
		LocalDate fechaD2 = LocalDate.of(2004, 2, 23);
		
		Libreria libreria = new Libreria();
		libreria.setDireccion("Avenida de los sueños perdidos");
		libreria.setNumeroTelefono(954696954);

		LibrosFisicos libroF1 = new LibrosFisicos("dragon " , "jesus", fechaD1, 11,22, 12);
		LibrosFisicos libroF2 = new LibrosFisicos("SDF", "Manu", fechaD1,10, 3, 14);

		LibroDigital libroD1 = new LibroDigital("masdf", "nono", fechaD2);
		LibroDigital libroD2 = new LibroDigital("sdgfasd", "ale", fechaD2);

		libreria.getListaLibro().add(libroF1);
		libreria.getListaLibro().add(libroF2);
		libreria.getListaLibro().add(libroD1);
		libreria.getListaLibro().add(libroD2);
	

		System.out.println(libreria);
		
	//	System.out.println(libreria.obtenerLibroMasAntiguo());
	//	System.out.println(libreria.obtenerNumPaginasMedio());
		System.out.println(libreria.sumaPesoTotalDeLibros());

	}

}
