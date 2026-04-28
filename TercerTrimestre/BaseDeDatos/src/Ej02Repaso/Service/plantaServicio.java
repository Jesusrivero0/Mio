package Ej02Repaso.Service;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Ej02Repaso.Modelo.Planta;

public class plantaServicio extends OpenConnection {

	public void insertarPlanta(Planta planta) throws SQLException, PlantaAlturaException {

		if (planta.getAltura().compareTo(BigDecimal.TWO) > 0) {
			throw new PlantaAlturaException("La planta ha superado la altura permitida");
		}

		String sql = "INSERT INTO PLANTAS (ID, NOMBRE, TIPO, ALTURA, FECHA_PLANTACION) VALUES (?, ?, ?, ?,?)";

		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, planta.getId());
			stmt.setString(2, planta.getNombre());
			stmt.setString(3, planta.getTipo());
			stmt.setBigDecimal(4, planta.getAltura());
			stmt.setDate(5, Date.valueOf(LocalDate.now()));

			stmt.execute();

		}

	}

	public void actualizarPlantasMedias() throws SQLException, PlantaServiceException {

		String sql = "UPDATE PLANTAS SET TIPO = ? WHERE ALTURA BETWEEN 1 AND 1.5";

		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, "Media Altura");
			Integer rs = stmt.executeUpdate();

			System.out.println("Filas actualizadas " + rs);

			if (rs == 0) {
				throw new PlantaServiceException("No se encontró ninguna planta dentro del rango para acutalizar");
			}
		}
	}

	public LocalDate actualizarFechaPlanta(Integer id, LocalDate fecha) throws SQLException, PlantaServiceException {

		String sql = "SELECT FECHA_NACIMIENTO FROM PLANTAS WHERE ID = ?";
		String sql1 = "UPDATE PLANTAS SET FECHA_PLANTACION = ? WHERE ID = ?";

		try (Connection conn = getNewConection();) {
			conn.setAutoCommit(false);
			try (PreparedStatement stmt = conn.prepareStatement(sql);
					PreparedStatement stmt1 = conn.prepareStatement(sql1);) {
				Planta p = new Planta();
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery();
				if (!rs.next()) {
					throw new PlantaServiceException("No se encontró la planta con id: " + id);
				}
				LocalDate fechavieja = rs.getDate("FECHA_PLANTACION").toLocalDate();
				stmt1.setDate(1, rs.getDate("FECHA_PLANTACION"));
				stmt1.setInt(2, p.getId());
				stmt1.execute();

				conn.commit();
				return fechavieja;
			} catch (Exception e) {
				conn.rollback();
				throw e;
			}
		}

	}

	public Integer eliminarPlantas(LocalDate fecha) throws SQLException {

		String sql = "DELETE FROM TABLAS WHERE FECHA_PLANTACION < ?";

		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			Integer cont = stmt.executeUpdate();

			stmt.setDate(1, Date.valueOf(fecha));

			return cont;

		}
	}

	public List<Planta> consultarPlatas(Integer ano){
		
		List<Planta> listaPlanta = new ArrayList<>();
		
	}
}
