package LigaClase.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import LigaClase.Modelo.Equipo;
import LigaClase.Modelo.Jugador;

public class EquiposService extends OpenConnection {

	public List<Equipo> consultarEquipos() throws SQLException {

		List<Equipo> listaEquipo = new ArrayList<>();
		String sql = "SELECT NOMBRE FROM EQUIPO";

		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Equipo e = new Equipo();
				e.setCodigo(rs.getInt("CODIGO"));
				e.setNombre(rs.getNString("NOMBRE"));

				listaEquipo.add(e);

			}
		}
		return listaEquipo;
	}

	public List<Jugador> consultarJugadoresEquipo(Integer codigo) throws SQLException {

		List<Jugador> listaJugador = new ArrayList<>();
		String sql = "SELECT * FROM JUGADOR WHERE CODIGO_EQUIPO = ?";

		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, codigo);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Jugador j = new Jugador();

				j.setNumero(rs.getInt("NUMERO"));
				j.setCodigo_equipo(rs.getInt("CODIGO_EMPLEADO"));
				j.setNombre(rs.getString("NOMBRE"));
				j.setFecha_nacimiento(rs.getDate("NACIMIENTO").toLocalDate());

				listaJugador.add(j);

			}
		}
		return listaJugador;
	}

	// consultarEquipoCompleto() que recibe un código. Tendrá que devolver los datos
	// completos del equipo con dicho código. Para ello:
	// o Consultará los datos de la tabla EQUIPO filtrando por código
	// o Consultará todos los jugadores del equipo usando el método
	// consultarJugadoresEquipo()
	// o Si no existe el equipo con ese código, lanzará una NotFoundException.
	// o Si hay cualquier otro error, lanzará una EquipoServiceException.

	public void consultarEquipoCompleto (Integer codigo) throws SQLException {
		
		String sql = "SELECT * FROM EQUIPO";
		
		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.executeQuery();
			
			
		}
	}
}
