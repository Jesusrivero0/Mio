package Ejercicio30;

public abstract class Personaje {

	private String nombre;
	private Integer codigo;

	public abstract Integer getDaño();
	public abstract Integer getPuntosVidas();
	public abstract Integer getSegundos();
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", codigo=" + codigo + "]";
	}

}
