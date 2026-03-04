package Ejercicio5Repaso;

import java.time.LocalDate;
import java.util.Objects;

public class Publicacion {

	private String codigo;
	private String autor;
	private String titulo;
	private LocalDate añoPublicacion;

	public Publicacion(String codigo, String autor, String titulo, LocalDate añoPublicacion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(LocalDate añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", añoPublicacion="
				+ añoPublicacion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	

}
