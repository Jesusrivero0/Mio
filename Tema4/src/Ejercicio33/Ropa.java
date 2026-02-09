package Ejercicio33;

public class Ropa extends Articulo {

	private String talla;
	private String color;

	public Ropa(String descripcion, Integer precio, String talla, String color) {
		super(descripcion, precio);
		this.talla = talla;
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public String getColor() {
		return color;
	}

}
