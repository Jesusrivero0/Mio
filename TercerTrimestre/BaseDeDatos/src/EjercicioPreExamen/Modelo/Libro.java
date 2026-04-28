package EjercicioPreExamen.Modelo;

import java.math.BigDecimal;

public abstract class Libro {

	private String titulo;
	private String autor;
	private String isbn;
	private BigDecimal precio;
	
	

	public Libro(String titulo, String autor, String isbn, BigDecimal precio) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public BigDecimal getPrecio() {
		return precio;
	}
	
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	public abstract BigDecimal getPrecioLibro(); 

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", precio=" + precio + "]";
	}
	
	
	
}
