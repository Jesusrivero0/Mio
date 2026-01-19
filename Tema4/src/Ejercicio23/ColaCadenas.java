package Ejercicio23;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {

	private List<String> cadena;

	public ColaCadenas() {
		cadena = new ArrayList<>();
	}

	public void añadirCadena(String cadena) {
		this.cadena.add(cadena);
	}

	public String sacarCadena() {
		return this.cadena.remove(0);
	}
	
	public Integer getTamaño() {
		return this.cadena.size();
	}

	@Override
	public String toString() {
		return "ColaCadenas = " + cadena;
	}

	
}
