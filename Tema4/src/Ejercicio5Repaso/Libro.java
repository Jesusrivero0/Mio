package Ejercicio5Repaso;

import java.time.LocalDate;

public class Libro extends Publicacion {

	private Boolean prestado;
	private Boolean consultado;

	public Libro(String codigo, String autor, String titulo, LocalDate añoPublicacion) {
		super(codigo, autor, titulo, añoPublicacion);
		this.prestado = false;
		this.consultado = false;
	}

	public Boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(Boolean prestado) {
		this.prestado = prestado;
	}

	public Boolean getConsultado() {
		return consultado;
	}

	public void setConsultado(Boolean consultado) {
		this.consultado = consultado;
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
	
	public void retirarParaConsultar() {
		this.consultado = true;
	}
	
	public void terminarConsulta() {
		this.consultado = true;
	}
	
	public Boolean estaConsultando() {
		if (consultado) {
		return true;
		}
		else {
			return false;
		}
	}
	
	

	@Override
	public String toString() {
		return "Libro [prestado=" + prestado + ", consultado=" + consultado + "]";
	}

}
