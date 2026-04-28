package Ej01Repaso.Servicio;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Ej01Repaso.Modelo.ProductoGourmet;

public class ProductosGourmetServicio extends OpenConnection {

	public void insertarProducto(ProductoGourmet producto) throws ProductoInvalidoException, ProductoException {

		if (producto.getPrecio().compareTo(BigDecimal.ZERO) <= 0) {
			throw new ProductoInvalidoException("El precio debe ser mayor a 0");
		}

		try (Connection conn = getNewConection();) {
			insertarProductoR(producto, conn);
		} catch (SQLException e) {
			throw new ProductoException("Error al insertar el producto con id =  " + producto.getId(), e);
		}
	}

	public void insertarProductoR(ProductoGourmet producto, Connection conn)
			throws ProductoInvalidoException, ProductoException {

		String sql = "INSERT INTO PRODUCTOS_GOURMET (ID, NOMBRE, TIPO, PRECIO, DISPONIBLE) VALUES (?, ?, ?, ?,?)";
		if (producto.getPrecio().compareTo(BigDecimal.ZERO) <= 0) {
			throw new ProductoInvalidoException("El precio debe ser mayor a 0");
		}

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {

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
		try (Connection conn = getNewConection()) {
			conn.setAutoCommit(false);
			try {
				for (ProductoGourmet productoGourmet : listaProducto) {
					insertarProductoR(productoGourmet, conn);
				}
				conn.commit();
			} catch (SQLException e) {
				conn.rollback();
				System.out.println(e.getMessage());
				throw new ProductoException();
			}
		}

	}

	public void insertarProductosR(List<ProductoGourmet> listaProducto, Connection conn)
			throws ProductoInvalidoException, ProductoException, SQLException {
		String sql = "INSERT INTO PRODUCTOS_GOURMET (ID, NOMBRE, TIPO, PRECIO, DISPONIBLE) VALUES (?, ?, ?, ?,?)";

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
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

	public List<ProductoGourmet> consultaTipoProductos(String tipo) throws SQLException, ProductoNoEncontradoException {

		String sql = "SELECT * FROM PRODUCTOS_GOURMET WHERE TIPO = ?";
		List<ProductoGourmet> listaProducto = new ArrayList<>();
		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, tipo);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ProductoGourmet p = new ProductoGourmet();
				p.setId(rs.getInt("ID"));
				p.setNombre(rs.getString("NOMBRE"));
				p.setTipo(rs.getString("TIPO"));
				p.setPrecio(rs.getBigDecimal("PRECIO"));
				p.setDisponible(rs.getBoolean("DISPONIBLE"));

				listaProducto.add(p);
			}
		}
		if (listaProducto.isEmpty()) {
			throw new ProductoNoEncontradoException("El producto con ese tipo");
		}
		return listaProducto;
	}

	// eliminaProducto(): Eliminar un producto por su id.
	// Si el producto no está en BD, lanzar la excepción
	// ProductoNoEncontradoException.

	public void eliminarProducto(Integer id) throws SQLException, ProductoNoEncontradoException {

		String sql = "DELETE FROM PRODUCTOS_GOURMET WHERE ID = ?";
		ProductoGourmet p = new ProductoGourmet();

		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, p.getId());
			stmt.execute();
		} catch (SQLException e) {
			throw new ProductoNoEncontradoException("No se ha encontrado producto con este id" + p.getId());
		}
	}

	// consultarProductos(): Consultar todos los productos. Debe devolver un mapa
	// donde la clave es
	// el id del producto y el valor, el propio producto. Si no hay ninguno,
	// devolverá un mapa vacío.

	public Map<Integer, ProductoGourmet> consultarProductos() throws SQLException {

		String sql = "SELECT * FROM PRODUCTOS_GOURMET";
		Map<Integer, ProductoGourmet> mapaProducto = new HashMap<>();
		ProductoGourmet p = new ProductoGourmet();
		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				p.setId(rs.getInt("ID"));
				p.setNombre(rs.getString("NOMBRE"));
				p.setTipo(rs.getString("TIPO"));
				p.setPrecio(rs.getBigDecimal("PRECIO"));
				p.setDisponible(rs.getBoolean("DISPONIBLE"));
			}
			mapaProducto.put(p.getId(), p);
		}
		return mapaProducto;
	}

}
