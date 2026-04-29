package ExamenPrueba.Modelo;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		BigDecimal total = BigDecimal.ZERO;
		Cliente c = new Cliente();
		List<Pedido> la = c.getListaProducto();

		for (Pedido pedido : la) {
			total = total.add(pedido.getImporte());
		}
		Integer total1 = total.intValue();
		return total1;
	}

	public void borrarClientesServidos() {

	}
}
