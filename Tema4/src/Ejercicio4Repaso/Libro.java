package Ejercicio4Repaso;

import java.time.LocalDate;

public abstract class Libro {

	
	private String titulo;
	private String autor;
	private LocalDate fechaEdiccion;
	private Integer numeroPaginas;
	
	
	public abstract Integer getPeso(); 

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
	public LocalDate getFechaEdiccion() {
		return fechaEdiccion;
	}
	public void setFechaEdiccion(LocalDate fechaEdiccion) {
		this.fechaEdiccion = fechaEdiccion;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	
}
