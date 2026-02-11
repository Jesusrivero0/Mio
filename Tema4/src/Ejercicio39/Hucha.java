package Ejercicio39;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Hucha {

	private BigDecimal importe;

	public Hucha() {
		this.importe = BigDecimal.ZERO.setScale(2);
	}

	public BigDecimal meterDinero(BigDecimal importe) {
		this.importe = this.importe.add(importe);
		return importe;
	}

	public BigDecimal sacarDinero(BigDecimal metido) {//200
		//150
		if (this.importe.compareTo(metido) > 0) {
			this.importe = this.importe.subtract(metido);

		} else if (this.importe.compareTo(metido) < 0) {
			this.importe = BigDecimal.ZERO;
			return this.importe;
		}
		return importe;

	}

	public BigDecimal contarDinero() {
		return importe;
	}

	public BigDecimal romperHucha() {
		BigDecimal total = importe;
		importe = BigDecimal.ZERO;
		return total;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,##0.00");
		return "Hucha importe = " + formato.format(importe);
	}

}
