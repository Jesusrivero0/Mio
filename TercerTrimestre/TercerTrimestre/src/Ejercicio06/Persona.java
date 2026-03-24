package Ejercicio06;

import java.math.BigDecimal;

public class Persona {

	private String genero;
	private BigDecimal altura;
 	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [genero=" + genero + ", altura=" + altura + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
