package Ejercicio18;

import java.util.Objects;

public class Reloj {

	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	private Boolean formato24Horas;

	public Reloj() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
		this.formato24Horas = true;
	}

	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		this.formato24Horas = true;
	}

	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public Boolean getFormato24Horas() {
		return formato24Horas;
	}

	public void setFormato24Horas(Boolean formato24Horas) {
		this.formato24Horas = formato24Horas;
	}

	public void ponerEnHora(Integer horas, Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}

	public void ponerEnHora(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public Boolean check() {
		if (this.horas < 0 && this.horas > 23) {
			return false;
		}
		if (this.minutos < 0 && this.minutos > 59) {
			return false;
		}
		if (this.segundos < 0 && this.segundos > 59) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		if (check()) {
			if (formato24Horas) {
				return horas + ":" + minutos + ":" + segundos;
			} else {
				if (horas > 12) {
					horas -= 12;
				}
				return horas + ":" + minutos + ":" + segundos + "pm/am";

			}
		} else {
			return "hora incorrecta";
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}

}
