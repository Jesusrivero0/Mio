package EjercicioPreExamen.Modelo;

import java.math.BigDecimal;

public class LibroSegundaMano extends Libro{
	
	
	private Integer antiguedad;
	
	public LibroSegundaMano(String titulo, String autor, String isbn, BigDecimal precio) {
		super(titulo, autor, isbn, precio);
		
	}


	public Integer getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public BigDecimal getPrecioLibro() {
			return getPrecio().divide(BigDecimal.TWO);
	
	}


	
	
	
	
}
