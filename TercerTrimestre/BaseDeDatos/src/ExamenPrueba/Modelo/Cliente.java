package ExamenPrueba.Modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ExamenPrueba.Servicio.NoExisteException;

public class Cliente {

	private String dni;
	private List<Pedido> listaProducto;

	public Cliente() {
		this.listaProducto = new ArrayList<>();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public List<Pedido> getListaProducto() {
		return listaProducto;
	}

	public void setListaProducto(List<Pedido> listaProducto) {
		this.listaProducto = listaProducto;
	}

	public Boolean tienePedidosPendiente() {
		List<Pedido> listaPedido = this.listaProducto;

		for (Pedido pedido : listaPedido) {
			if (pedido.getEntregado()) {
				return true;
			}

		}
		return false;

	}

	public BigDecimal getImportePendiente() {
		BigDecimal total = BigDecimal.ZERO;

		for (Pedido pedido : listaProducto) {
			if (!pedido.getEntregado()) {
				total = total.add(pedido.getImporte());
			}
		}
		return total;
	}

	public Map<Integer, Integer> getArticuloPedidos() {
		Map<Integer, Integer> mapa = new HashMap<>();
		for (Pedido pedido : listaProducto) {
			mapa.put(pedido.getNumero(), pedido.getCant_articulo());
		}
		return mapa;
	}

	public Pedido getPedidoCritico() throws NoExisteException {
		for (Pedido pedido : listaProducto) {
			if (!pedido.getEntregado() && pedido.getFechaEntregaPrevista().isAfter(pedido.getFecha_pedido())) {
				return pedido;
			} else {
				throw new NoExisteException("Ese pedido no existe");
			}
		}
		return null;
	}
}
