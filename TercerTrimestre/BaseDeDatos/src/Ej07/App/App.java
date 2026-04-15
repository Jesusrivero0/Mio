package Ej07.App;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ej07.Modelo.Persona;
import Ej07.Service.DatosIncompletosException;
import Ej07.Service.PersonaService;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Buscar persona");
		System.out.println("2. Insertar persona");
		System.out.println("3. Actualizar persona");
		System.out.println("4. Borrar persona");
		System.out.println("5. Insertar lista persona");
		System.out.println("6. Salir");
		Integer respuesta = scanner.nextInt();
		if (respuesta == 1) {
			consultarPersona();
		}
		if (respuesta == 2) {
			insertarPersona();
		}
		if (respuesta == 3) {
			actualizarPersona();
		}
		if (respuesta == 4) {
			borrarPersona();
		}
		if (respuesta == 5) {
			insertarPersonas();
		}
		if (respuesta == 6) {
			System.out.println("Saliendoo...");
		}
		scanner.close();
	}

	public static void consultarPersona() {
		Scanner sc = new Scanner(System.in);
		PersonaService ps = new PersonaService();
		List<Persona> lista = new ArrayList<>();
		try {

			System.out.println("Digame un nombre");
			String nombre = sc.nextLine();
			if (ps.buscarPersonas(nombre).isEmpty()) {
				System.out.println("No existen personas con ese filtro");
			} else {
				lista = ps.buscarPersonas(nombre);
				for (Persona persona : lista) {
					System.out.println(persona.getNombre());
					System.out.println(persona.getApellidos());
					System.out.println(persona.getDni());
					System.out.println(persona.getFecha_nacimiento());
					System.out.println("-----------------");
				}
			}
		} catch (Exception a) {
			System.out.println(a.getMessage());
		} finally {
			sc.close();
		}
	}

	public static void insertarPersona() {

		Scanner sc = new Scanner(System.in);
		Persona p = new Persona();
		PersonaService ps = new PersonaService();
		Boolean error = false;

		do {

			System.out.println("Digame un nombre");
			String nom = sc.nextLine();
			System.out.println("Digame un apellido");
			String ape = sc.nextLine();
			System.out.println("Digame un dni");
			String dni = sc.nextLine();
			System.out.println("Digame una fecha (dd/MM/yyyy)");
			String fecha = sc.nextLine();

			p.setNombre(nom);
			p.setApellidos(ape);
			p.setDni(dni);

			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			try {
				LocalDate fechaNacimiento = LocalDate.parse(fecha, format);
				p.setFecha_nacimiento(fechaNacimiento);

			} catch (DateTimeParseException a) {
				System.out.println("La fecha indicada no es correcta");
				error = true;
			}
			try {
				p.validar();

				ps.insertarPersona(p);
			} catch (DatosIncompletosException e) {
				System.out.println(e.getMessage());
			}

		} while (error);
		sc.close();
	}

	public static void actualizarPersona() {
		Scanner sc = new Scanner(System.in);
		Persona p = new Persona();
		PersonaService ps = new PersonaService();
		Boolean error = false;

		do {

			System.out.println("Digame un nombre");
			String nom = sc.nextLine();
			System.out.println("Digame un apellido");
			String ape = sc.nextLine();
			System.out.println("Digame un dni");
			String dni = sc.nextLine();
			System.out.println("Digame una fecha (dd/MM/yyyy)");
			String fecha = sc.nextLine();

			p.setNombre(nom);
			p.setApellidos(ape);
			p.setDni(dni);

			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			try {
				LocalDate fechaNacimiento = LocalDate.parse(fecha, format);
				p.setFecha_nacimiento(fechaNacimiento);

			} catch (DateTimeParseException a) {
				System.out.println("La fecha indicada no es correcta");
				error = true;
			}
			try {
				p.validar();
				try {
					ps.actualizarPersona(p);
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			} catch (DatosIncompletosException e) {
				System.out.println(e.getMessage());
			}

		} while (error);
		sc.close();

	}

	public static void borrarPersona() {
		Scanner sc = new Scanner(System.in);
		Persona p = new Persona();
		PersonaService ps = new PersonaService();
		Boolean error = false;

		do {
			System.out.println("Digame un dni");
			String dni = sc.nextLine();
			p.setDni(dni);

			try {
				ps.borrarPersona(p);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		} while (error);
		sc.close();

	}
	
	public static void insertarPersonas() {

		PersonaService ps = new PersonaService();
		List<Persona> listaPersona = new ArrayList<>();

		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();

		p1.setDni("12345678A");
		p1.setNombre("Manuel");
		p1.setApellidos("Lopez");
		
		p2.setDni("12345F");
		p2.setNombre("Paco");
		p2.setApellidos("Perez");
	
		p3.setDni("12321233A");
		p3.setNombre("Hugos");
		p3.setApellidos("Sanchez");
		

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			LocalDate fechap1 = LocalDate.parse("12/05/2000", format);
			p1.setFecha_nacimiento(fechap1);
			LocalDate fechap2 = LocalDate.parse("22/12/2023", format);
			p2.setFecha_nacimiento(fechap2);
			LocalDate fechap3 = LocalDate.parse("31/08/2012", format);
			p3.setFecha_nacimiento(fechap3);
		} catch (DateTimeParseException a) {
			System.out.println("La fecha indicada no es correcta");
		}

		listaPersona.add(p1);
		listaPersona.add(p2);
		listaPersona.add(p3);

		try {
			ps.insertarPersonas(listaPersona);
			System.out.println("Insertado");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
