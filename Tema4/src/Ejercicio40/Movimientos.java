package Ejercicio40;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Movimientos {
	public static final String CARGO = "C";
	public static final String RETIRADA = "R";
	public static final String INGRESO = "I";
	
	private LocalDate fecha;
	public BigDecimal importe;

	public BigDecimal getImporte() {
		return importe;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public abstract String getTipo();

	@Override
	public String toString() {
		DecimalFormat formatoImporte = new DecimalFormat("#,###.##");
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return getTipo() + "-" + formatoFecha.format(fecha) + " - " + formatoImporte.format(importe);
	}



}
