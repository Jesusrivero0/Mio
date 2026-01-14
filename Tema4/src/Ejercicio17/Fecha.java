package Ejercicio17;

public class Fecha {

	private Integer dia;
	private Integer mes;
	private Integer años;

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAños() {
		return años;
	}

	public void setAños(Integer años) {
		this.años = años;
	}

	public Boolean validarBisiesto() {
		return (años % 4 == 0 && años % 100 != 0) || (años % 400 == 0);
	}

	public Boolean validarFecha() {
		Integer[] arrayFecha = new Integer[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (this.mes < 1 || this.mes > 12) {
			return false;
		}
		if (dia < 1) {
			return false;
		}
		if (this.mes == 2 && validarBisiesto()) {
			return dia <= 29;
		}

		return dia <= arrayFecha[this.mes - 1];

	}

	public void diaSiguiente() {
		Integer[] arrayFecha = new Integer[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (this.mes == 2 && validarBisiesto()) {
			arrayFecha[1] = 29;
		}
		dia++;
		if (dia < 1) {
			mes++;
		}
		if (mes < 1) {
			mes = 12;
			this.años++;
		}
		dia = arrayFecha[mes - 1];

	}

	public void diaAnterior() {
		Integer[] arrayFecha = new Integer[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (this.mes == 2 && validarBisiesto()) {
			arrayFecha[1] = 29;
		}
		dia--;
		if (dia < 1) {
			mes--;
		}
		if (mes < 1) {
			mes = 12;
			this.años--;
		}
		dia = arrayFecha[mes - 1];

	}
}
