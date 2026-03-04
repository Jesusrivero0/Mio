package Ejercicio5Repaso;

import java.time.LocalDate;

public class Cd extends Publicacion {

	private Boolean prestado;

	public Cd(String codigo, String autor, String titulo, LocalDate añoPublicacion) {
		super(codigo, autor, titulo, añoPublicacion);
		this.prestado = false;
	}

	public Boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(Boolean prestado) {
		this.prestado = prestado;
	}

	public void prestar() {
		setPrestado(true);
	}

	public void devolver() {
		setPrestado(false);
	}

	public Boolean estaPrestado() {
		if (getPrestado()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Cd [prestado=" + prestado + "]";
	}

}
