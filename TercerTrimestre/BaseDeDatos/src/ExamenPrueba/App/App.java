package ExamenPrueba.App;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import ExamenPrueba.Modelo.Cliente;
import ExamenPrueba.Modelo.Pedido;
import ExamenPrueba.Servicio.NoExisteException;
import ExamenPrueba.Servicio.PedidosService;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		PedidosService p = new PedidosService();
		Cliente c = new Cliente();
		System.out.println("Dime el dni");
		String dni = scanner.nextLine();
		System.out.println("Dime el dia de nacimiento");
		Integer dia = scanner.nextInt();
		System.out.println("Dime el mes de nacimiento");
		Integer mes = scanner.nextInt();
		System.out.println("Dime el año de nacimiento");
		Integer anyo = scanner.nextInt();
		LocalDate fecha2 = LocalDate.of(anyo, mes, dia);

		try {
			System.out.println(p.buscarPedidos(fecha2, dni));
			System.out.println(c.getPedidoCritico());

		} catch (SQLException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		} catch (NoExisteException e) {
			System.out.println(e.getMessage());
		}

		scanner.close();
	}

}
