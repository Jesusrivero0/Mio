package EjercicioPreExamen.Servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Ej04.Service.OpenConnection;
import EjercicioPreExamen.Modelo.Libro;

public class LibreriaService extends OpenConnection {

	public void insetarLibroNuevo(Libro libro) throws LibroException {
		String sql = "INSERT INTO LIBROS (ISBN, TITULO, AUTOR, PRECIO) VALUES (?, ?, ?, ?)";

		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, libro.getIsbn());
			stmt.setString(2, libro.getTitulo());
			stmt.setString(3, libro.getAutor());
			stmt.setBigDecimal(4, libro.getPrecio());

			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new LibroException("Ha habido un error en la base de datos.");
		}
	}

	public Boolean actualizarPrecioLibroNuevo(Libro libro) throws SQLException {
		String sql = "UPDATE LIBROS SET PRECIO = ? WHERE ISBN = ?";

		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setBigDecimal(1, libro.getPrecio());
			stmt.setString(2, libro.getIsbn());
			Integer cont = stmt.executeUpdate();
			if (cont == 0) {
				return false;
			}
			return true;

		}
	}

	public void eliminarLibro(String isbn) throws SQLException {
		String sql = "DELETE FROM LIBROS WHERE ISBN = ?";
		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, isbn);
			stmt.execute();

		}

	}
}
