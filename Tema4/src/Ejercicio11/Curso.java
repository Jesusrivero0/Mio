package Ejercicio11;

public class Curso {

	private Integer identificador;
	private String descripcion;
	private Alumno[] alumnos;

	public Curso(Integer tamaño) {
		alumnos = new Alumno[tamaño];
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void addAlumno(Alumno alumno) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alumno;
				return;
			}
		}
		System.out.println("No ai sitio para este alumno");
	}

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
