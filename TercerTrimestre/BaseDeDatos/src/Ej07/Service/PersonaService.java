package Ej07.Service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Ej07.Modelo.Persona;

public class PersonaService extends OpenConnection {

	public Persona consultarPersona(String dni) {

		String sql = "SELECT * FROM PERSONAS WHERE DNI = '" + dni + "'";

		try (Connection conn = getNewConection(); Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(sql);
			Persona p = new Persona();
			if (rs.next()) {
				p.setNombre(rs.getString("NOMBRE"));
				p.setDni(rs.getString("DNI"));
				p.setApellidos(rs.getString("APELLIDOS"));
				p.setFecha_nacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
				return p;
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("ERROR" + e.getMessage());
		}
		return null;

	}

	public List<Persona> buscarPersonas(String nombre) {

		List<Persona> listaPersona = new ArrayList<>();
		String sql = "SELECT * FROM PERSONAS WHERE NOMBRE LIKE" + "'" + nombre + "'" + "OR APELLIDOS LIKE " + "'"
				+ nombre + "'";

		try (Connection conn = getNewConection(); Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Persona p = new Persona();
				p.setNombre(rs.getString("NOMBRE"));
				p.setDni(rs.getString("DNI"));
				p.setApellidos(rs.getString("APELLIDOS"));
				p.setFecha_nacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
				listaPersona.add(p);
			}
			return listaPersona;
		} catch (SQLException e) {
			System.out.println("ERROR" + e.getMessage());
		}
		return null;
	}

	public void insertarPersona(Persona p) {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fechaTexto = p.getFecha_nacimiento().format(formato);
		String sql = "INSERT INTO personas VALUES ('" + p.getDni() + "', '" + p.getNombre() + "', '" + p.getApellidos()
				+ "', TO_DATE('" + fechaTexto + "', 'DD/MM/YYYY'))";

		try (Connection conn = getNewConection(); Statement stmt = conn.createStatement()) {

			System.out.println(sql);
			stmt.execute(sql);

		} catch (SQLException e) {
			System.out.println("ERROR" + e.getMessage());
		}
	}

	public void actualizarPersona(Persona p) throws SQLException {

		String sql = "UPDATE PERSONAS SET NOMBRE = ?, APELLIDOS = ?, FECHA_NACIMIENTO = ? WHERE DNI = ?";
		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, p.getNombre());
			stmt.setString(2, p.getApellidos());
			stmt.setDate(3, Date.valueOf(p.getFecha_nacimiento()));
			stmt.setString(4, p.getDni());

			stmt.execute();
		}
	}

	public void borrarPersona(Persona p) throws SQLException {
		try (Connection conn = getNewConection()) {
			/*
			 * String sql = "DELETE FROM PERSONAS WHERE DNI = ?"; try (Connection conn =
			 * getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			 * 
			 * stmt.setString(1, p.getDni());
			 * 
			 * stmt.execute(); }
			 */
			try {
				insertarPersonaR(conn, p);
			} catch (SQLException e) {
				conn.rollback();
				throw e;
			}
		}

	}

	public void insertarPersonas(List<Persona> lista) throws SQLException {
		try (Connection conn = getNewConection()) {
			conn.setAutoCommit(false);
			try {
				for (Persona persona : lista) {
					insertarPersonaR(conn, persona);
				}
				conn.commit();
			} catch (SQLException e) {
				conn.rollback();
				throw e;
			}
		}
	}

	public void insertarPersonaR(Connection con, Persona p) throws SQLException {

		PreparedStatement stmt = con.prepareStatement(
				"INSERT INTO PERSONAS (DNI, NOMBRE, APELLIDOS, FECHA_NACIMIENTO) VALUES (?, ?, ?, ?)");

		stmt.setString(1, p.getDni());
		stmt.setString(2, p.getNombre());
		stmt.setString(3, p.getApellidos());
		stmt.setDate(4, Date.valueOf(p.getFecha_nacimiento()));

		stmt.execute();
	}
}
