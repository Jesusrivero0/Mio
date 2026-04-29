package ExamenPrueba.Servicio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Map;

import ExamenPrueba.Modelo.Pedido;

public class PedidosService extends OpenConnection{

	public Map<Integer, Pedido> buscarPedidos(LocalDate fechamin) throws SQLException{
		
		String sql = "SELECT * FROM PEDIDO WHERE FECHA = ?";
		
		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setDate(1, Date.valueOf(fechamin));
		}
	}
}
