package ExamenPasado;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public abstract class Animales {

	private Integer numeroRegistro;
	private LocalDate fechaNacimiento;
	private BigDecimal peso;

	public Animales(Integer numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
		this.fechaNacimiento = LocalDate.now();
		this.peso = BigDecimal.ZERO;
	}

	public Integer getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(Integer numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public abstract BigDecimal getPesoMinVenta();

	public abstract BigDecimal getPesoMinVentaKg();

	public Integer getEdad() {
		Period periodo = this.fechaNacimiento.until(LocalDate.now());
		Integer months = periodo.getMonths() + (periodo.getYears() * 12);

		return months;

	}

	public Boolean sePuedeVender() {
		if (this.peso.compareTo(getPesoMinVenta()) > 0)
			return true;
		else
			return false;

	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaNacimiento, numeroRegistro, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animales other = (Animales) obj;
		return Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(numeroRegistro, other.numeroRegistro) && Objects.equals(peso, other.peso);
	}

}
