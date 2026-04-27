package Ej01Repaso.Servicio;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Ej01Repaso.Modelo.ProductoGourmet;

public class ProductosGourmetServicio extends OpenConnection {

	public void insertarProducto(ProductoGourmet producto) throws ProductoInvalidoException, ProductoException {

		String sql = "INSERT INTO PRODUCTOS_GOURMET (ID, NOMBRE, TIPO, PRECIO, DISPONIBLE) VALUES (?, ?, ?, ?,?)";
		if (producto.getPrecio().compareTo(BigDecimal.ZERO) <= 0) {
			throw new ProductoInvalidoException("El precio debe ser mayor a 0");
		}

		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setInt(1, producto.getId());
			stmt.setString(2, producto.getNombre());
			stmt.setString(3, producto.getTipo());
			stmt.setBigDecimal(4, producto.getPrecio());
			stmt.setBoolean(5, producto.getDisponible());

			stmt.execute();
		} catch (SQLException e) {
			throw new ProductoException("Error al insertar el producto con id =  " + producto.getId(), e);
		}
	}

	public void insertarProductos(List<ProductoGourmet> listaProducto)
			throws ProductoInvalidoException, ProductoException, SQLException {
		String sql = "INSERT INTO PRODUCTOS_GOURMET (ID, NOMBRE, TIPO, PRECIO, DISPONIBLE) VALUES (?, ?, ?, ?,?)";

		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			conn.setAutoCommit(false);
			try {
				for (ProductoGourmet productoGourmet : listaProducto) {
					insertarProducto(productoGourmet);

				}
				conn.commit();
			} catch (SQLException e) {
				conn.rollback();
				System.out.println(e.getMessage());
				throw new ProductoException();
			}
		}

	}

	public List<ProductoGourmet> consultaTipoProductos(String tipo) throws SQLException, ProductoNoEncontradoException {

		String sql = "SELECT * FROM PRODUCTOS_GOURMET WHERE TIPO = ?";
		List<ProductoGourmet> listaProducto = new ArrayList<>();
		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			for (ProductoGourmet p : listaProducto) {
				stmt.setString(1, p.getTipo());
				stmt.execute();
				listaProducto.add(p);
			}
			if (listaProducto.isEmpty()) {
				throw new ProductoNoEncontradoException("El producto con ese tipo");
			}
			return listaProducto;
		}
	}

}
