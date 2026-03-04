package ExamenPasado;

import java.math.BigDecimal;

public class Cerdo extends Animales {
	public static final BigDecimal PESO = new BigDecimal(100);
	public static final BigDecimal PRECIO = new BigDecimal(4.5);

	private String raza;

	public Cerdo(Integer numeroRegistro) {
		super(numeroRegistro);
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
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
