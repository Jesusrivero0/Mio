package EjercicioPreExamen.Modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Libreria {

	private String nombre;
	private Map<String, Libro> mapaLibro;

	public Libreria(String nombre) {
		this.nombre = nombre;
		this.mapaLibro = new HashMap<>();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, Libro> getMapaLibro() {
		return mapaLibro;
	}

	public void setMapaLibro(Map<String, Libro> mapaLibro) {
		this.mapaLibro = mapaLibro;
	}

	public BigDecimal getTasacionCompleta() {
		BigDecimal total = BigDecimal.ZERO;
		Collection<Libro> valor = mapaLibro.values();
		for (Libro libro : valor) {
			total = total.add(libro.getPrecio());
		}
		return total;
	}

	public BigDecimal getPrecioMedio() {
		BigDecimal total = BigDecimal.ZERO;
		Collection<Libro> valor = mapaLibro.values();
		for (Libro libro : valor) {
			total = total.add(libro.getPrecio());
		}

		return total.divide(new BigDecimal(mapaLibro.size()), 2, RoundingMode.HALF_DOWN);
	}

	public List<Libro> getLibroBaratos() {

	}

	@Override
	public String toString() {
		return "Libreria [nombre=" + nombre + ", mapaLibro=" + mapaLibro + "]";
	}

}
