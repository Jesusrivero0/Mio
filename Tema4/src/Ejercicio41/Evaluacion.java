package Ejercicio41;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
		Collection<BigDecimal> valor = mapa.values();
		if (!mapa.containsKey(dni)) {
			return mapa.getOrDefault(dni, BigDecimal.ZERO);
		}
		return mapa.get(valor);
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
		Integer cont = 0;
		for (BigDecimal nota : valor) {
			if (nota.compareTo(new BigDecimal(5)) <= 0) {
				cont++;
			}
		}
		return cont;
	}

	public List<String> obtenerCantidadSuspenso() {
		Set<Entry<String, BigDecimal>> pares = mapa.entrySet();
		List<String> listaDni = new ArrayList<>();
		for (Entry<String, BigDecimal> par : pares) {
			if (par.getValue().compareTo(new BigDecimal(5)) > 0) {
				listaDni.add(par.getKey());
			}
		}
		return listaDni;
	}

	public void borrarAprobados() {
		Set<Entry<String, BigDecimal>> pares = mapa.entrySet();
		Iterator<Entry<String, BigDecimal>> iterador = pares.iterator();
		while(iterador.hasNext()) {
			mapa.remove(iterador);
		}
	}

	@Override
	public String toString() {
		Set<Entry<String, BigDecimal>> pares = mapa.entrySet();
		String aprobado = "";
		String suspenso = "";
		for (Entry<String, BigDecimal> par : pares) {
			if (par.getValue().compareTo(new BigDecimal(5)) >= 0) {
				DecimalFormat formato = new DecimalFormat("#.#");
				aprobado += "\t" + par.getKey() + " " + "(" + formato.format(par.getValue()) + ") \n";
			} else {
				DecimalFormat formato = new DecimalFormat("#.#");
				suspenso += "\t" + par.getKey() + " " + "(" + formato.format(par.getValue()) + ") \n";
			}
		}

		return "aprobados: \n" + aprobado + "suspensos: \n" + suspenso;
	}

}
