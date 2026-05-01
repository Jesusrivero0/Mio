package LigaClase.Modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private Integer codigo;
	private String nombre;
	private List<Jugador> listaJugador;
	
	public Equipo() {
		this.listaJugador = new ArrayList<>();	
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Jugador> getListaJugador() {
		return listaJugador;
	}
	public void setListaJugador(List<Jugador> listaJugador) {
		this.listaJugador = listaJugador;
	}
	
	public BigDecimal getEdadMedia() {
		BigDecimal total = BigDecimal.ZERO;
		
		for (Jugador jugador : listaJugador) {
			Period periodo = jugador.getFecha_nacimiento().until(LocalDate.now());
			BigDecimal t = new BigDecimal(periodo.getYears());
			total = total.add(t);
		}
		BigDecimal totalFecha = new BigDecimal(listaJugador.size());
		return total.divide(totalFecha,2,RoundingMode.HALF_DOWN);
	}
	@Override
	public String toString() {
		return "Equipo  codigo = " + codigo + ", nombre = " + nombre + ", listaJugador = " + listaJugador ;
	}
	
	
}
