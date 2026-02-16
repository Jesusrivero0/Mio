package Ejercicio40;

public class Ingreso extends Movimientos {

	public String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return  INGRESO;
	}
	@Override
	public String toString() {
		return super.toString() +  " - " + descripcion;
	}

}
