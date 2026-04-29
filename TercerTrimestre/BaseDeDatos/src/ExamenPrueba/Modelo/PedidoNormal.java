package ExamenPrueba.Modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import ExamenPrueba.Servicio.EstadoIncorrectoException;

public class PedidoNormal extends Pedido {

	public PedidoNormal(Integer numero) {
		super(numero);

	}

	@Override
	public LocalDate getFechaEntregaPrevista() {
		return getFecha_pedido().plusWeeks(1);

	}

	@Override
	public BigDecimal getImporteTotal() throws EstadoIncorrectoException {

		BigDecimal total = new BigDecimal(0);

		if (getEntregado()) {
			throw new EstadoIncorrectoException("El pedido esta entregado.");
		}
		if (getFecha_pedido().isBefore(getFechaEntregaPrevista())) {
			return this.getImporte();
		}
		if (getFecha_pedido().isAfter(getFechaEntregaPrevista())) {
			total = getImporte().multiply(new BigDecimal(1.10));
		}

		return total;
	}

}
