package Ej04.App;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ej04.Modelo.Persona;
import Ej04.Service.DatosIncompletosException;
import Ej04.Service.PersonaService;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Buscar persona");
		System.out.println("2. Insertar persona");
		System.out.println("3. Actualizar persona");
		System.out.println("4. Borrar persona");
		System.out.println("5. Salir");
		Integer respuesta = scanner.nextInt();
		if (respuesta == 1) {
			consultarPersona();
		}
		if (respuesta == 2) {
			insertarPersona();
		}
		if (respuesta == 3) {
			
		}
		if (respuesta == 4) {
			
		}
		if (respuesta == 5) {
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
	}

}
