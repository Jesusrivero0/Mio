package Ejercicio40;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public  class CuentaAhorros {

	private String numero;
	private List<Movimientos> listaMovimientos;

	public CuentaAhorros(String numero) {
		this.numero = numero;
		listaMovimientos = new ArrayList<>();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public abstract void añadirMovimiento() {
		
	}
	
	public List<Movimientos> getListaMovimientos() {
		return listaMovimientos;
	}

	public void setListaMovimientos(List<Movimientos> listaMovimientos) {
		this.listaMovimientos = listaMovimientos;
	}


	public BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Movimientos movimientos : listaMovimientos) {
			total = movimientos.getImporte().add(total);
		}
		return total;
	}

	public List<String> allMovimientos() {
		List<String> listaMov = new ArrayList<>();
		for (String string : listaMov) {
			if (listaMov.isEmpty()) {
				System.out.println("La lista esta vacia");
			} else {
				listaMov.add(string);
			}
		}
		return listaMov;
	}
	
	
	
}
