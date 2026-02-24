package Ejercicio44;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Diccionario {

	private Map<String, List<String>> mapa;

	public Diccionario() {
		mapa = new HashMap<>();
	}

	public void cargarDiccionario(List<String> lista) {
		for (int i = 0; i < lista.size(); i++) {
			String primeraLetra = lista.get(i).substring(0, 1);
			String palabra = lista.get(i);

			if (!mapa.containsKey(primeraLetra)) {
				lista.add(palabra);
				mapa.put(primeraLetra, lista);
			}
			mapa.get(primeraLetra).add(palabra);

		}
	}

	public void borrarDiccionario() {
		mapa.clear();
	}

	public void imprimirPalabras(String palabra) {
		System.out.println(palabra);
	}
}
