package Ejercicio30;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private Integer puntosVida;
	private List<Personaje> listaEquipos;

	public Equipo() {
		listaEquipos = new ArrayList<>();
	}

	public List<Personaje> getListaEquipos() {
		return listaEquipos;
	}

	public void setListaEquipos(List<Personaje> listaEquipos) {
		this.listaEquipos = listaEquipos;
	}

	public void setPuntosVida(Integer puntosVida) {
		this.puntosVida = puntosVida;
	}

	public Integer getPuntosVida() {
		return puntosVida;
	}

	public void agregarPesonaje(Personaje personaje) {
		if (listaEquipos.size() < 5 && !listaEquipos.contains(personaje)) {
			listaEquipos.add(personaje);
			puntosVida += personaje.getPuntosVidas();
		}
	}

	@Override
	public String toString() {
		return "Equipo [puntosVida=" + puntosVida + ", listaEquipos=" + listaEquipos + "]";
	}
	
	

}
