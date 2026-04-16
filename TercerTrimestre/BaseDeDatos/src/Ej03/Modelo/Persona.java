package Ej03.Modelo;

import java.time.LocalDate;

import Ej03.Service.DatosIncompletosExceptionn;

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
	
	public Boolean validar(Persona persona) throws DatosIncompletosExceptionn {
		if (getDni().isBlank() || getNombre().isBlank() || getApellidos().isBlank() || getFecha_nacimiento() == null) {
			throw new DatosIncompletosExceptionn();
		}
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nacimiento="
				+ fecha_nacimiento + "]";
	}

}
