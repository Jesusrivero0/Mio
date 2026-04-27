package Ej01Repaso.Modelo;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ProductoGourmet {

	private Integer id;
	private String nombre;
	private String tipo;
	private BigDecimal precio;
	private Boolean disponible;

	public ProductoGourmet() {

	}

	public ProductoGourmet(Integer id, String nombre, String tipo, BigDecimal precio, Boolean disponible) {

		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.disponible = disponible;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal suma() {
		BigDecimal total = BigDecimal.ZERO;
		total = total.add(getPrecio());
		return total;
	}
	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,###.00 €");
		return nombre + " - " + tipo + " - " + formato.format(precio);
	}

}
