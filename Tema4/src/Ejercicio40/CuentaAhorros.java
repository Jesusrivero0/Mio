package Ejercicio40;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public abstract  class CuentaAhorros {

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
	
	public List<Movimientos> getListaMovimientos() {
		return listaMovimientos;
	}

	public void setListaMovimientos(List<Movimientos> listaMovimientos) {
		this.listaMovimientos = listaMovimientos;
	}


	public BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Movimientos movimientos : listaMovimientos) {
			if(movimientos.getTipo().equals("I")) {
			total = movimientos.getImporte().add(total);
			}
			else {
				total = total.subtract(movimientos.getImporte());
			}
		}
		return total.setScale(2, RoundingMode.HALF_DOWN);
	}

	public List<String> allMovimientos() {
		List<String> listaMov = new ArrayList<>();
		for (String string : listaMov) {
				listaMov.add(string);
			
		}
		return listaMov;
	}
	
	public void añadirUnMovimiento(Movimientos mov) {
		listaMovimientos.add(mov);
	}
	
	
	public List<String> getCargo(){
		List<String> resultado = new ArrayList<>();
		for (Movimientos string : listaMovimientos) {
			if(string.getTipo().equals(Movimientos.CARGO)) {
				resultado.add(string.toString());
			}
		}
		return resultado;
	}

	public List<String> getIngreso(){
		List<String> resultado = new ArrayList<>();
		for (Movimientos string : listaMovimientos) {
			if(string.getTipo().equals(Movimientos.INGRESO)) {
				resultado.add(string.toString());
			}
		}
		return resultado;
	}
	public List<String> getRetirada(){
		List<String> resultado = new ArrayList<>();
		for (Movimientos string : listaMovimientos) {
			if(string.getTipo().equals(Movimientos.RETIRADA)) {
				resultado.add(string.toString());
			}
		}
		return resultado;
	}
}
