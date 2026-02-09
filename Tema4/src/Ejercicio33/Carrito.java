package Ejercicio33;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

	private LocalDate fechaCreacion;
	private LocalDate fechaUltimaActualizacion;
	private List<Articulo> listaArticulo;
	private Cliente cliente;

	public Carrito(Cliente cliente) {
		listaArticulo = new ArrayList<>();
		this.fechaCreacion = LocalDate.now();
		this.fechaUltimaActualizacion = LocalDate.now();
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaUltimaActualizacion() {
		return fechaUltimaActualizacion;
	}

	public List<Articulo> getListaArticulo() {
		return listaArticulo;
	}

	public Integer getCantidad() {
		return this.listaArticulo.size();
	}

	public Integer getTotal() {
		Integer total = 0;
		for (Articulo articulo : listaArticulo) {
			total += articulo.getPrecio();
		}
		return total;
	}

	public Integer getPrecioMedia() {
		Integer total = 0;
		for (Articulo articulo : listaArticulo) {
			total += articulo.getPrecio();
		}
		total = total / listaArticulo.size();
		return total;
	}

	public void addArticulo(Articulo articulo) {
		listaArticulo.add(articulo);
	}

	public void borrarArticulo(int numero) {
		listaArticulo.remove(numero);
	}

	public void vaciarCesta() {
		listaArticulo.clear();
	}

	@Override
	public String toString() {

		LocalDate fecha = getFechaUltimaActualizacion();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "El dni " + cliente.getDni() + " nombre " + cliente.getNombre() + " total " + getTotal() + " fecha ultima actualizacion "
				+ fecha.format(formato);
	}

}
