package Ejercicio29;

import java.util.List;

public class Pelicula {

	private Integer añoDeExtreno;
	private String titulo;
	private List<Actores> listaActores;
	private Gionista gionista;
	private Director director;
	
	public Director getDirector() {
		return director;
	}

	public Gionista getGionista() {
		return gionista;
	}

	public void setGionista(Gionista gionista) {
		this.gionista = gionista;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public Integer getAñoDeExtreno() {
		return añoDeExtreno;
	}

	public void setAñoDeExtreno(Integer añoDeExtreno) {
		this.añoDeExtreno = añoDeExtreno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Actores> getListaActores() {
		return listaActores;
	}

	public void setListaActores(List<Actores> listaActores) {
		this.listaActores = listaActores;
	}

	@Override
	public String toString() {
		return "Pelicula [añoDeExtreno = " + añoDeExtreno + ", titulo = " + titulo + ", listaActores = " + listaActores
				+ ", gionista=" + gionista + ", director=" + director + "]";
	}

}
