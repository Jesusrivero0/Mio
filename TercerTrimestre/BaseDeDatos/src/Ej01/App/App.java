package Ej01.App;

import java.sql.SQLException;
import java.util.Scanner;

import Ej01.Modelo.Persona;
import Ej01.Service.PersonaService;

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
				
		scanner.close();

	}

}
