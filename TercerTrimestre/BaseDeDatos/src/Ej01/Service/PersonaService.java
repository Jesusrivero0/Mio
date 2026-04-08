package Ej01.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Ej01.Modelo.Persona;

public class PersonaService extends OpenConnection {

	public Persona consultarPersona(String dni) {

		String sql = "SELECT * FROM PERSONAS WHERE DNI = '" + dni + "'";
		Persona p = new Persona();

		try (Connection conn = getNewConection(); Statement stmt = conn.createStatement()) {			
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				p.setNombre(rs.getString("NOMBRE"));
				p.setDni(rs.getString("DNI"));
				p.setApellidos(rs.getString("APELLIDOS"));
				p.setFecha_nacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
				return p;
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("ERROR");
		}
		return null;

	}
	
	
}
