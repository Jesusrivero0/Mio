package ExamenPrueba.Modelo;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;


public class Almacen {

	private String nombre;
	private Map<String, Cliente> mapaAlmacen;

	public Almacen(String nombre) {
		this.nombre = nombre;
		this.mapaAlmacen = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, Cliente> getMapaAlmacen() {
		return mapaAlmacen;
	}

	public void setMapaAlmacen(Map<String, Cliente> mapaAlmacen) {
		this.mapaAlmacen = mapaAlmacen;
	}

	public Integer getCantidadPedidos() {
		int total = 0;

		for (Cliente c : mapaAlmacen.values()) {
			total = total + c.getListaProducto().size();
		}

		return total;
	}

	public void borrarClientesServidos() {
		Iterator<Cliente> iterador = mapaAlmacen.values().iterator();

		while (iterador.hasNext()) {
			Cliente c = iterador.next();
			if (!c.tienePedidosPendiente()) {
				iterador.remove();
			}
		}
	}
}
