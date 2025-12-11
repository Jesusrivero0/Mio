package Ejercicio3;

public class Libro {

	private String titulo;
	private String autor;
	private Integer paginasLeidas;
	private Integer totalPaginas;

	public Libro(String titulo, String autor, Integer totalPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.paginasLeidas = 0;
	}

	public Integer leer(Integer paginasLeidas) {
		this.paginasLeidas = this.paginasLeidas + paginasLeidas;
		if (this.paginasLeidas > this.totalPaginas) {
			return this.paginasLeidas = this.totalPaginas;
		} else {
			return this.paginasLeidas;
		}
	}

	public Integer retroceder(Integer paginas) {
		if (paginas >= 0) {
			return this.paginasLeidas;
		} else {
			return 0;
		}
	}

	public void reiniciar() {
		this.paginasLeidas = 0;
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

	@Override
	public String toString() {
		return "Libro titulo = " + titulo + ", autor = " + autor + ", paginasLeidas = " + paginasLeidas
				+ ", totalPaginas = " + totalPaginas;
	}

}
