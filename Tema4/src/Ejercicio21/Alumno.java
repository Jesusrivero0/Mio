package Ejercicio21;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona {

	private String dni;
	private Integer nota;
	private Curso curso;

	public Alumno(String dni) {
		this.dni = dni.toUpperCase();
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni.toUpperCase();
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public void aprobar() {
		this.nota = 5;
	}

	public Boolean validarDni() {
		String ejemploDni = this.dni;
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		Matcher match = patron.matcher(ejemploDni);
		if (match.matches()) {
			System.out.println("El dni es correcto");
			return true;
		} else {
			System.out.println("El dni es incorrecto");
			return false;
		}
	}

	public Boolean validar() {
		if (!validarDni()) {
			return false;
		}
		if (this.curso == null) {
			return false;
		}
		if (this.getNombre() == null || this.getNombre().length() < 10) {
			return false;
		}
		if (this.getEdad() == null || this.getEdad() <= 12 || this.getEdad() >= 65) {
			return true;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Alumno dni = " + dni + ", nombre = " + getNombre() + ", edad = " + getEdad() + ", nota = " + nota
				+ ", curso" + curso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

}
