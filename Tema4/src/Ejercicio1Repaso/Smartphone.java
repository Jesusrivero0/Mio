package Ejercicio1Repaso;

import java.time.LocalDate;
import java.time.Period;

public class Smartphone {

	private String marca;
	private String modelo;
	private String imei;
	private Double precio;
	private LocalDate fechaFabricacion;
	private Boolean activo;

	public Smartphone() {
		this.activo = true;
		this.precio = 0.0;
	}

	public Smartphone(String imei) {
		this.imei = imei;
		this.activo = true;
		this.precio = 0.0;
	}

	public Smartphone(String imei, String marca, String modelo) {
		this.imei = imei;
		this.marca = marca;
		this.modelo = modelo;
		this.activo = true;
		this.precio = 0.0;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void activar() {
		this.activo = true;
	}

	public Integer getEdad() {
		LocalDate fecha = LocalDate.of(2000, 4, 1);
		Period periodo = fecha.until(this.fechaFabricacion);
		Integer años = periodo.getYears();
		return años;
	}

	public void cambiarMarcaModelo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public void establecerFabricacion(LocalDate fecha) {
		this.fechaFabricacion = fecha;
	}

	public Double getPrecioMasiva() {
		Double total = (this.precio * 1.21);
		return total;
	}

	public Boolean isAltaGama(Double precioBase) {
		if (this.precio > precioBase) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean isDatosCompletos() {
		if (this.imei == null || this.imei.isBlank() || this.precio == null) {
			return false;
		} else {
			return true;
		}
	}

	public Boolean isGratis() {
		if (this.precio == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void rebajar() {
		if (this.precio >= 10) {
			this.precio = this.precio - 10.00;
		}

	}

	@Override
	public String toString() {
		if (activo) {
			return " marca " + marca + " (" + modelo + ")" + activo;
		} else {
			return marca + " ( " + modelo + " ) " + " - " + !activo;
		}
	}

}
