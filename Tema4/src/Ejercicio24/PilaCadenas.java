package Ejercicio24;

import java.util.ArrayList;
import java.util.List;

public class PilaCadenas {

	private List<String> listaCadena;
	
	public PilaCadenas() {
		listaCadena = new ArrayList<>();
	}
	
	public void añadirPila(String cadena) {
		listaCadena.add(cadena);
	}
	
	public String sacarCadena() {
		return listaCadena.remove(listaCadena.size()-1);		
	}
	
	public Integer getTamaño() {
		return listaCadena.size();
	}

	@Override
	public String toString() {
		return "PilaCadenas = " + listaCadena;
	}
	
	
}
