package Ejercicio4Repaso;

import java.time.LocalDate;

public class LibroDigital extends Libro {

	public LibroDigital (String titulo, String autor, LocalDate fecha) {
		
	}
	
	public Integer getPeso() {
		return 0;
	}

	@Override
	public String toString() {
		return "LibroDigital []";
	}
}
