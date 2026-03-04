package Ejercicio5Repaso;

import java.time.LocalDate;

public class Revista extends Publicacion {

	private Boolean consultado;

	public Revista(String codigo, String autor, String titulo, LocalDate añoPublicacion) {
		super(codigo, autor, titulo, añoPublicacion);
		this.consultado = false;
	}

	public Boolean getConsultado() {
		return consultado;
	}

	public void setConsultado(Boolean consultado) {
		this.consultado = consultado;
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
		return "Revista [consultado=" + consultado + "]";
	}
	

}
