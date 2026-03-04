package ExamenPasado;

import java.math.BigDecimal;

public class Pollo extends Animales {

	public static final BigDecimal PESO = new BigDecimal(5);
	public static final BigDecimal PRECIO = new BigDecimal(1.5);

	public Pollo(Integer numeroRegistro) {
		super(numeroRegistro);

	}

	@Override
	public BigDecimal getPesoMinVenta() {
		return PESO;
	}

	@Override
	public BigDecimal getPesoMinVentaKg() {
		return PRECIO;
	}
}
