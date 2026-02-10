package Ejercicio39;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Hucha {

	private BigDecimal importe;

	public Hucha() {
		this.importe = BigDecimal.ZERO.setScale(2);
	}

	BigDecimal total = BigDecimal.ZERO;

	public BigDecimal meterDinero(BigDecimal importe) {
		total = this.importe.add(importe);
		return total;
	}

	public BigDecimal sacarDinero(BigDecimal importe) {
		if (importe.compareTo(total) < 0) {
			total = this.importe.subtract(importe);
		}
		return total;
	}
	
	public BigDecimal contarDinero() {
		return total;
	}
	
	public BigDecimal romperHucha() {
		total = BigDecimal.ZERO;
		return total;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,###.00");
		return "Hucha importe=" + formato.format(importe);
	}
	
	
	
	
	
}
