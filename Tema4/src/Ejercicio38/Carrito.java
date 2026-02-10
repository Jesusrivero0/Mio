package Ejercicio38;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

	private LocalDate fechaCreacion;
	private LocalDate fechaUltimaActualizacion;
	private Cliente cliente;
	private List<Articulo> listaArticulo;

	public Carrito(Cliente cliente) {
		this.cliente = cliente;
		listaArticulo = new ArrayList<>();
		this.fechaCreacion = LocalDate.now();
		this.fechaUltimaActualizacion = LocalDate.now();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public void setFechaUltimaActualizacion(LocalDate fechaUltimaActualizacion) {
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
	}

	public void setListaArticulo(List<Articulo> listaArticulo) {
		this.listaArticulo = listaArticulo;
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

	public BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Articulo articulo : listaArticulo) {
			total.add(articulo.getPrecio());
		}
		return total;
	}

	public BigDecimal getPrecioMedia() {
		if (getCantidad() == 0) {
			return BigDecimal.ZERO;
		}
		BigDecimal i = new BigDecimal(getCantidad());
		return getTotal().divide(i);
	}

	public void addArticulo(Articulo articulo) {
		listaArticulo.add(articulo);
		fechaUltimaActualizacion = LocalDate.now();
	}

	public void borrarArticulo(int numero) {
		if (numero >= 0 && numero < this.listaArticulo.size()) {
			listaArticulo.remove(numero);
			fechaUltimaActualizacion = LocalDate.now();
		}
	}

	public void vaciarCesta() {
		listaArticulo.clear();
	}

	@Override
	public String toString() {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "El dni " + cliente.getDni() + " nombre " + cliente.getNombre() + " total " + getTotal()
				+ " fecha ultima actualizacion " + fechaUltimaActualizacion.format(formato);
	}

}
