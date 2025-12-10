package Ejercicio1;

public class Calculadora {

	private Double valor = 0.0;

	public Double sumar(Double p1) {
		valor = valor + p1;
		return valor;
	}

	public Double restar(Double p1) {
		valor = valor - p1;
		return valor;
	}

	public Double multiplicar(Double p1) {
		valor = valor * p1;
		return valor;
	}

	public Double dividir(Double p1) {
		valor = valor / p1;
		return valor;
	}

	public Double cero() {
		valor = 0.0;
		return valor;
	}

	public Double getValor() {
		return valor;
	}

}
