package Ejercicio30;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

	
	private String nombre;
	private List<Equipo> equipo;
	
	
	public Jugador() {
		equipo = new ArrayList<>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Equipo> getEquipo() {
		return equipo;
	}


	public void setEquipo(List<Equipo> equipo) {
		this.equipo = equipo;
	}


	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", equipo=" + equipo + "]";
	}
	
}
