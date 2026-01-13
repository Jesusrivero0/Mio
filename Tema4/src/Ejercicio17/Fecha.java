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
	
	public void validarFecha() {
		if (validarBisiesto()) {
			System.out.println("Es bisiesto");
		} 	
		if (this.dia <= 31 && this.mes <= 12 && this.años >= 0) {
			System.out.println("Esta fecha es correcta");
		}
	}

}
