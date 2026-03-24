package Ejercicio04;

import java.util.ArrayList;
import java.util.List;

public class SacoNumero {

	private List<Integer> listaNumeros;

	public SacoNumero() {
		listaNumeros = new ArrayList<>();
	}

	public List<Integer> getListaNumeros() {
		return listaNumeros;
	}

	public void setListaNumeros(List<Integer> listaNumeros) {
		this.listaNumeros = listaNumeros;
	}

	public void addNumero(Integer numero) {
		listaNumeros.add(numero);
	}

	public Integer getNumero(Integer numero) {
		return numero;
	}

	@Override
	public String toString() {
		return "SacoNumero listaNumeros=" + listaNumeros;
	}

}
