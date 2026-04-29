package ExamenPrueba.Modelo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import ExamenPrueba.Servicio.EstadoIncorrectoException;

public abstract class Pedido {

	private Integer numero;
	private LocalDate fecha_pedido;
	private Integer cant_articulo;
	private BigDecimal importe;
	private Boolean entregado;
	private LocalDate FechaEntrega;
	
	

	public Pedido(Integer numero) {
		this.numero = numero;
		this.entregado = false;
		this.fecha_pedido = LocalDate.now();
		this.importe = BigDecimal.ZERO;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getFecha_pedido() {
		return fecha_pedido;
	}

	public void setFecha_pedido(LocalDate fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}

	public Integer getCant_articulo() {
		return cant_articulo;
	}

	public void setCant_articulo(Integer cant_articulo) {
		this.cant_articulo = cant_articulo;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public Boolean getEntregado() {
		return entregado;
	}

	public void setEntregado(Boolean entregado) {
		this.entregado = entregado;
	}
		
	public LocalDate getFechaEntrega() {
		return FechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		FechaEntrega = fechaEntrega;
	}

	public abstract LocalDate getFechaEntregaPrevista();
	
	public abstract BigDecimal getImporteTotal() throws EstadoIncorrectoException;

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(numero, other.numero);
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,###.00 €");
		DateTimeFormatter formatofecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Numero >" + numero + " fecha > " + formatofecha.format(fecha_pedido) + " > " + formato.format(importe)
				+ " > (" + cant_articulo + " articulos)";
	}

}
