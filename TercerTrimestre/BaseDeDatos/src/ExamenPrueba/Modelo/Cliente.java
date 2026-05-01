package ExamenPrueba.Modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
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

		Pedido pedidoCritico = null;
		int mayorRetraso = 0;
		LocalDate hoy = LocalDate.now();

		for (Pedido p : listaProducto) {
			if (!p.getEntregado() && p.getFechaEntregaPrevista().isBefore(hoy)) {
				Period periodo = p.getFechaEntregaPrevista().until(hoy);
				int retraso = periodo.getDays();
				if (retraso > mayorRetraso) {
					mayorRetraso = retraso;
					pedidoCritico = p;
				}
			}
		}

		if (pedidoCritico == null) {
			throw new NoExisteException("No hay pedidos con retraso");
		}
		return pedidoCritico;
	}
}
