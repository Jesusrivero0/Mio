package Ejercicio4Repaso;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

	private List<Libro> listaLibro;
	private String direccion;
	private Integer numeroTelefono;

	public Libreria() {
		listaLibro = new ArrayList<>();
	}

	public List<Libro> getListaLibro() {
		return listaLibro;
	}

	public void setListaLibro(List<Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(Integer numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Libro obtenerLibroMasAntiguo() {
		Libro l1 = listaLibro.get(0);
		if (!listaLibro.isEmpty()) {

			for (int i = 0; i < listaLibro.size(); i++) {
				for (Libro libro : listaLibro) {
					if (libro.getFechaEdiccion().isBefore(l1.getFechaEdiccion())) {
						l1 = libro;
					}
				}
			}
		}
		return l1;

	}

	public Integer sumaPesoTotalDeLibros() {
		Integer total = 0;
		for (int i = 0; i < listaLibro.size(); i++) {
			total += listaLibro.get(i).getPeso();
		}
		return total;
	}

	public Integer obtenerNumPaginasMedio() {
		Integer total = 0;
		if (this.listaLibro.isEmpty())
			return 0;
		for (int i = 0; i < listaLibro.size(); i++) {
			total += listaLibro.get(i).getNumeroPaginas();
		}
		return total / listaLibro.size();
	}

	public void añadirLibro(Libro l) {
		listaLibro.add(l);
	}

	@Override
	public String toString() {
		return "Libreria [listaLibro=" + listaLibro + ", direccion=" + direccion + ", numeroTelefono=" + numeroTelefono
				+ "]";
	}

}
