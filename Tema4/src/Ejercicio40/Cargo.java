package Ejercicio40;

public class Cargo extends Movimientos {

	public String cif;

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getTipo() {
		return CARGO;
	}
	@Override
	public String toString() {
		return super.toString() + " - " + cif;
	}

}
