package Ejercicio31;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Indica el dia que nacio");
		Integer dia = scanner.nextInt();

		System.out.println("Indica el mes en que nacio");
		Integer mes = scanner.nextInt();

		System.out.println("Indica el año que nacio");
		Integer año = scanner.nextInt();

		LocalDate fecha = LocalDate.of(año, mes, dia);

		if (dia < 31 && mes < 12 && año <= 2026) {
			System.out.println("Fecha correcta");

		} else {
			System.out.println("Fecha incorrecta");

		}

		// 2
		Boolean bisiesto = fecha.isLeapYear();
		if (bisiesto) {
			System.out.println("Nacio en año bisiesto");
		} else {
			System.out.println("No nacio en año bisiesto");
		}
		// 3
		System.out.println(fecha.getDayOfWeek());

		// 4
		LocalDate hoy = LocalDate.now();
		Period periodo = fecha.until(hoy);
		Integer añosDiferencia = periodo.getYears();
		System.out.println("Usted tiene " + añosDiferencia + " años");

		// 5
		Integer diferencia = 100 - añosDiferencia;
		System.out.println("Le queda " + diferencia + " años de vida");

		// 6
		LocalTime hora = LocalTime.now();
		System.out.println(hora);

		scanner.close();
	}

}
