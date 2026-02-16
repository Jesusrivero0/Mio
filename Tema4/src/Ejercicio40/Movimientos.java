package Ejercicio40;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Movimientos {

	private LocalDate fecha;
	public BigDecimal importe;

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

}
