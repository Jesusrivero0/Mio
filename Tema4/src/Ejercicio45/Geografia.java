package Ejercicio45;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Geografia {

	private Map<String, String> mapaPaises;
	
	public Geografia() {
		mapaPaises = new HashMap<>();
	}

	public Map<String, String> getMapaPaises() {
		return mapaPaises;
	}

	public void setMapaPaises(Map<String, String> mapaPaises) {
		this.mapaPaises = mapaPaises;
	}
	
	public Boolean agregarPais(String pais, String capital) {
		if(mapaPaises.containsKey(pais)) {
			mapaPaises.put(pais.toUpperCase(), capital.substring(0,1).toUpperCase()+ capital.substring(1));
			return true;
		}else {
			return false;
		}
	}
	
	public String obtenerCapital(String pais) {
		if(!mapaPaises.containsKey(pais)) {
			return "";
		}
		return mapaPaises.get(pais);
	}
	
	public String imprimirPaises() {
		Set<Entry<String, String>> pares = mapaPaises.entrySet();
		String key = "";
		String valor = "";
		for (Entry<String, String> par : pares) {
			key += par.getKey();
			valor += par.getValue();
		}
		return "Paises: " + key + " capital: " + valor;
	}
	
	
	
}
