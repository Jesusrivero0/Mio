package Ejercicio11;

public class Curso {

	private Integer identificador;
	private String descripcion;
	
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "identificador=" + identificador + ", descripcion=" + descripcion;
	}
	
	
}
