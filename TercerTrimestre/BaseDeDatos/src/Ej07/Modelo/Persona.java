package Ej07.Modelo;

import java.time.LocalDate;

import Ej07.Service.DatosIncompletosException;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fecha_nacimiento;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public Boolean validar() throws DatosIncompletosException {
		if (getDni().isEmpty() || getNombre().isEmpty() || getApellidos().isEmpty() || getFecha_nacimiento() == null) {
			throw new DatosIncompletosException("Error validar");
		}
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nacimiento="
				+ fecha_nacimiento + "]";
	}

}
