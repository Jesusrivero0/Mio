package Ejercicio21;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private Integer identificador;
	private String descripcion;
	private List<Alumno> alumnos;

	public Curso(Integer tamaño) {
		alumnos = new ArrayList<>();
	}

	public Curso() {
		alumnos = new ArrayList<>();
	}
	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void addAlumno(Alumno alumno) {
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i) == null) {
				alumnos.set(i,alumno);
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
