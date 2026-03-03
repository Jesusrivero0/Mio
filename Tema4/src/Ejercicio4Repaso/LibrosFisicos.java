package Ejercicio4Repaso;

import java.time.LocalDate;

public class LibrosFisicos extends Libro {

	private Integer ancho;
	private Integer alto;
	private Integer peso;

	public LibrosFisicos(String titulo, String autor, LocalDate fecha, Integer ancho, Integer alto, Integer peso) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.peso = peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Integer getAncho() {
		return ancho;
	}

	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}

	public Integer getAlto() {
		return alto;
	}

	public void setAlto(Integer alto) {
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "LibrosFisicos [ancho=" + ancho + ", alto=" + alto + ", peso=" + peso + "]";
	}

	@Override
	public Integer getPeso() {

		return this.peso;
	}

}
