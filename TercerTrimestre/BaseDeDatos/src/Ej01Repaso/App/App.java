package Ej01Repaso.App;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ej01Repaso.Modelo.ProductoGourmet;
import Ej01Repaso.Servicio.ProductoException;
import Ej01Repaso.Servicio.ProductoInvalidoException;
import Ej01Repaso.Servicio.ProductoNoEncontradoException;
import Ej01Repaso.Servicio.ProductosGourmetServicio;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ProductosGourmetServicio ps = new ProductosGourmetServicio();
		ProductoGourmet p = new ProductoGourmet();

		List<ProductoGourmet> listaProductos = new ArrayList<>();

		for (int i = 0; i <= 3; i++) {
			System.out.println("Dime un id");
			Integer id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Dime un nombre");
			String nombre = scanner.nextLine();
			System.out.println("Dime un tipo");
			String tipo = scanner.nextLine();
			System.out.println("Dime un precio");
			BigDecimal precio = scanner.nextBigDecimal();
			System.out.println("Dime si esta disponible o no");
			Boolean disponible = scanner.nextBoolean();

			p.setId(id);
			p.setNombre(nombre);
			p.setTipo(tipo);
			p.setPrecio(precio);
			p.setDisponible(disponible);

			listaProductos.add(p);

			try {
				ps.insertarProductos(listaProductos);
				System.out.println("Insertado");
			} catch (ProductoInvalidoException e) {
				System.out.println(e.getMessage());
			} catch (ProductoException e) {
				System.out.println(e.getMessage());
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		}

		System.out.println("Indica un tipo de producto");
		String tipoP = scanner.nextLine();
		try {
			System.out.println(ps.consultaTipoProductos(tipoP));
			System.out.println("Total de productos de tipo " + tipoP + " " + p.suma());
		} catch (SQLException | ProductoNoEncontradoException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(ps.consultarProductos());
			System.out.println(ps.consultarProductos());
			System.out.println("Dime un id el cual eliminaremos");
			Integer id = scanner.nextInt();
			p.setId(id);
			try {
				ps.eliminarProducto(id);
			} catch (ProductoNoEncontradoException e) {
				System.out.println(e.getMessage());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}

}
