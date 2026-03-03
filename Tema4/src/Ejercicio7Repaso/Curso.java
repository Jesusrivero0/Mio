package Ejercicio7Repaso;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

public class Curso {

	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private BigDecimal precio;
	private Integer numeroPlazaTotal;
	private Integer numeroPlazaOcupadas;

	public Curso(String nombre, BigDecimal precio, Integer plazasTotales) {
		this.nombre = nombre;
		this.precio = precio;
		this.numeroPlazaTotal = plazasTotales;
		this.numeroPlazaOcupadas = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getNumeroPlazaTotal() {
		return numeroPlazaTotal;
	}

	public void setNumeroPlazaTotal(Integer numeroPlazaTotal) {
		this.numeroPlazaTotal = numeroPlazaTotal;
	}

	public Integer getNumeroPlazaOcupadas() {
		return numeroPlazaOcupadas;
	}

	public void setNumeroPlazaOcupadas(Integer numeroPlazaOcupadas) {
		this.numeroPlazaOcupadas = numeroPlazaOcupadas;
	}

	public Integer getDuracionCurso() {
		Period periodo = this.fechaFin.until(LocalDate.now());
		Integer month = periodo.getMonths() + periodo.getYears()*12;
		return month;
	}
	
	public Boolean isPlazasLibre() {
		return this.numeroPlazaOcupadas < this.numeroPlazaTotal;
	}
	
	public BigDecimal getPrecioMes() {
		Period periodo = this.fechaFin.until(LocalDate.now());
		Integer month = periodo.getMonths() + periodo.getYears()*12;
		BigDecimal b = new BigDecimal(month);
		return this.precio.divide(b).setScale(2, RoundingMode.HALF_DOWN);
	}
}
