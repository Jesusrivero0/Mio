package Ejercicio33;

public class Libro extends Articulo {

	private String autor;

	public Libro(String descripcion, Integer precio, String autor) {
		super(descripcion, precio);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

}
