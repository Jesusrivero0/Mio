package Ejercicio19;

public class Semaforo {

	public static final String ROJO = "rojo";
	public static final String AMARILLO = "amarillo";
	public static final String VERDE = "verde";

	private String color;
	private Boolean parpadeando;

	public Semaforo() {
		this.color = ROJO;
		this.parpadeando = false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equals(ROJO) || color.equals(AMARILLO) || color.equals(VERDE)) {
			this.color = color;
		}
	}

	public Boolean getParapadeando() {
		return parpadeando;
	}

	public void setParapadeando(Boolean parapadeando) {
		if (this.color.equals(AMARILLO)) {
			this.parpadeando = parapadeando;
		}
	}

	public void cambiarEstado() {
		if (this.color.equals(VERDE)) {
			this.color = AMARILLO;
			this.parpadeando = true;
		}
		if (this.color.equals(AMARILLO) && this.parpadeando == true) {
			this.parpadeando = false;
		}
		if (this.color.equals(AMARILLO)) {
			this.color = ROJO;
		}
	}

	@Override
	public String toString() {
		if (color.equals(AMARILLO)) {
			parpadeando = true;
			return "Semaforo en " + color + " parapadeo " + parpadeando;
		}
		return "Semaforo en " + color + " parapadeo " + parpadeando;
	}

}
