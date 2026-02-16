package Ejercicio41;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Evaluacion {

	Map<String, BigDecimal> mapa = new HashMap<>();

	public Boolean addNota(String dni, BigDecimal nota) {
		if (mapa.containsKey(dni)) {
			System.out.println("Esta ya en el mapa");
			return false;
		} else {
			mapa.put(dni, nota);
			System.out.println("Se añadió");
			return true;
		}
	}

	public Boolean corregirNota(String dni, BigDecimal nota) {
		if (mapa.containsKey(dni)) {
			mapa.put(dni, nota);
			System.out.println("Se corregio");
			return true;
		} else {
			System.out.println("No hicimos nada");
			return false;
		}
	}

	public BigDecimal obternerNotaAlumno(String dni) {
		if (!mapa.containsKey(dni)) {
			return mapa.getOrDefault(dni, BigDecimal.ZERO);
		}
		return mapa.get(dni);
	}

	public BigDecimal obtenerNotaMedia() {
		Collection<BigDecimal> valor = mapa.values();
		BigDecimal total = BigDecimal.ZERO;
		for (BigDecimal nota : valor) {
			total = total.add(nota);
		}
		BigDecimal aux = new BigDecimal(mapa.size());
		total = total.divide(aux).setScale(2, RoundingMode.HALF_DOWN);
		return total;
	}
	
	public Integer obtenerCantidadaAprobados() {
		Collection<BigDecimal> valor = mapa.values();
		
	}
}
