package Ejercicio7Repaso;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
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
		List<Curso> disponibles = new ArrayList<>();
		LocalDate fecha = LocalDate.now();
		for (Curso curso : this.listaCurso) {
			if (curso.getNumeroPlazaOcupadas() < curso.getNumeroPlazaTotal() && curso.getFechaFin().isAfter(fecha)) {
				disponibles.add(curso);
			}
		}
		return disponibles;

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
		Curso curso = null;
		for (int i = 0; i < listaCurso.size(); i++) {
			if (listaCurso.get(i).getFechaInicio().isAfter(LocalDate.now())) {
				if (curso == null || listaCurso.get(i).getPrecio().compareTo(curso.getPrecio()) < 0) {
					curso = listaCurso.get(i);
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
