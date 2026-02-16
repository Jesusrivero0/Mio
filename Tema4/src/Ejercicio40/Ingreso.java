package Ejercicio40;

public class Ingreso extends Movimientos {

	public String descripcion;

	@Override
	public String toString() {
		return "I - " + getFecha() + getImporte() + " " + descripcion;
	}

}
