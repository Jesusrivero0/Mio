package Ejercicio45;


import java.util.HashMap;
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
		
		
		if (mapaPaises.containsKey(pais)) {
			mapaPaises.put(pais.toUpperCase(), capital.substring(0, 1).toUpperCase() + capital.substring(1));
			return true;
		} else {
			mapaPaises.put(pais.toUpperCase(), capital.substring(0, 1).toUpperCase() + capital.substring(1));
			
			return false;
		}
	}

	public String obtenerCapital(String pais) {
		if (!mapaPaises.containsKey(pais)) {
			return "";
		}
		return mapaPaises.get(pais);
	}

	public String imprimirPaises() {
		Set<Entry<String, String>> pares = mapaPaises.entrySet();
		String key = "";
		String valor = "";
		for (Entry<String, String> par : pares) {
			System.out.println(par.getKey() + "--> " + par.getValue());
			//key += par.getKey();
			//valor += par.getValue();
		}
		return key  + valor;
	}

	public void eliminarPais(String pais) {
		if (mapaPaises.containsKey(pais.toUpperCase())) {
			mapaPaises.clear();
		}

	}

	public Integer calcularLongitudMediaPaises() {
		if(mapaPaises.isEmpty()) {
			return 0;
		}
		Integer total = 0;
		Set<Entry<String, String>> pares = mapaPaises.entrySet();
		for (Entry<String, String> par : pares) {
			total += par.getKey().length();
		}
		return total / mapaPaises.size();
	}

	public void eliminarPaisConCapitalLetra(String letra) {
		Set<Entry<String, String>> pares = mapaPaises.entrySet();
		for (Entry<String, String> par : pares) {
			if (par.getValue().substring(0, 1).equals(letra)) {
				mapaPaises.remove(par.getKey());
				break;
			}

		}
	}

	public Integer numeroPaisesConCapitalLetra(String letra) {
		Integer cont = 0;
		Set<Entry<String, String>> pares = mapaPaises.entrySet();
		for (Entry<String, String> par : pares) {
			if (par.getKey().equals(par.getValue())) {
				cont++;
			}
		}
		return cont;
	}

	public void imprimirNumeroPaisesLetra(String letra) {
		boolean b = false;
		Set<Entry<String, String>> pares = mapaPaises.entrySet();
		for (Entry<String, String> par : pares) {
			if (par.getValue().substring(0, 1).equalsIgnoreCase(letra)) {
				System.out.println(par.getValue());
				b= true;
			}
		}
		
		if(!b) { //b==false{
			System.out.println(" No hay ninguna capital que comience por: " + letra);
		}
	}

	public void mismaLetra() {
		Set<Entry<String, String>> pares = mapaPaises.entrySet();
		for (Entry<String, String> par : pares) {
			if (par.getKey().equals(par.getValue())) {
				System.out.println(par.getKey() + " " + par.getValue());
			} else {
				System.out.println("No hay ningun pais y capital que empiezen por la misma letra");
				break;
			}
		}
	}
}
