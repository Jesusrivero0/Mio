package Ejercicio7Repaso;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class Academia {

	private String cuidad;
	private Integer telefono;
	private List<Curso> listaCurso;

	public Academia() {

	}

	public String getCuidad() {
		return cuidad;
	}

	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public List<Curso> getListaCurso() {
		return listaCurso;
	}

	public void setListaCurso(List<Curso> listaCurso) {
		this.listaCurso = listaCurso;
	}

	public List<Curso> getCursoDisponibles() {
		LocalDate fecha = LocalDate.now();
		for (Curso curso : this.listaCurso) {
			if (curso.getNumeroPlazaOcupadas() < curso.getNumeroPlazaTotal() && curso.getFechaFin().isAfter(fecha)) {
				this.listaCurso.add(curso);
			}
		}
		return this.listaCurso;

	}

	public BigDecimal getPrecioMedio() {
		BigDecimal total = BigDecimal.ZERO;
		for (Curso curso : listaCurso) {
			total.add(curso.getPrecio());
		}
		return total;
	}

	public void borrarCurosPasados() {
		Iterator<Curso> iterador = listaCurso.iterator();
		while (iterador.hasNext()) {
			Curso curso = iterador.next();
			if (curso.getFechaFin().isAfter(LocalDate.now())) {
				iterador.remove();
			}
		}
	}

	// duda
	public Curso getCursoMasBarato() {
		Curso curso = new Curso();
		for (int i = 0; i < listaCurso.size(); i++) {
			if (listaCurso.get(i).getFechaInicio().isAfter(LocalDate.now())) {
				if (listaCurso.get(i).getPrecio().compareTo(listaCurso.get(0).getPrecio()) < 0) {

				}

			}

		}
		return curso;
	}

	public Integer getTotalPlazasLibres() {
		Integer plazaLibres = 0;
		for (Curso curso : listaCurso) {
			plazaLibres += curso.getNumeroPlazaTotal()-curso.getNumeroPlazaOcupadas();			
			
		}
		return plazaLibres;
	}
}
