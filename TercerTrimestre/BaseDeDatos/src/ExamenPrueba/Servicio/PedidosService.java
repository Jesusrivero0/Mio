package ExamenPrueba.Servicio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


import ExamenPrueba.Modelo.Pedido;
import ExamenPrueba.Modelo.PedidoNormal;

public class PedidosService extends OpenConnection {

	public Map<Integer, Pedido> buscarPedidos(LocalDate fechamin, String dni) throws SQLException, NoExisteException {

		Map<Integer, Pedido> mapa = new HashMap<>();

		String sql = "SELECT * FROM PEDIDO WHERE FECHA >= ? AND DNI_CLIENTE = ?";

		try (Connection conn = getNewConection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setDate(1, Date.valueOf(fechamin));
			stmt.setString(2, dni);
			ResultSet rs = stmt.executeQuery();
			if (!rs.next()) {
				throw new NoExisteException("No hay pedidos para los filtros indicados");
			} else {
				while (rs.next()) {
					Pedido p = new PedidoNormal(rs.getInt("NUM_PEDIDO"));
					p.setNumero(rs.getInt("NUM_PEDIDO"));
					p.setFecha_pedido(rs.getDate("FECHA").toLocalDate());
					p.setCant_articulo(rs.getInt("NUM_ARTICULOS"));
					p.setImporte(rs.getBigDecimal("IMPORTE"));
					p.setEntregado(rs.getBoolean("ENTREGADO"));
					mapa.put(p.getNumero(), p);
				}
			}
			return mapa;
		}
		
	}
}
