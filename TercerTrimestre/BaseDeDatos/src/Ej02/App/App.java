package Ej02.App;

import java.sql.SQLException;
import java.util.Scanner;

import Ej02.Modelo.Persona;
import Ej02.Service.PersonaService;

public class App {

	public static void main(String[] args) throws SQLException {

		PersonaService p = new PersonaService();

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime tu dni");
		String dni = scanner.nextLine();
		
		Persona per = p.consultarPersona(dni);
		
		if(per == null) {
			System.out.println("Null la persona");
		}else {				
			System.out.println(per);
		}
		
		System.out.println("Dime un nombre o apellido");
		String nombre = scanner.nextLine();
		
		System.out.println(p.buscarPersonas(nombre))
		;
		
		
		
		
				
		scanner.close();

	}

}
