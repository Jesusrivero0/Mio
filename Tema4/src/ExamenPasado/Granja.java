package ExamenPasado;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Granja {

	private String localidad;
	private List<Animales> listaAnimales;

	public Granja(String localidad) {
		this.localidad = localidad;
		this.listaAnimales = new ArrayList<>();
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public List<Animales> getListaAnimales() {
		return listaAnimales;
	}

	public void setListaAnimales(List<Animales> listaAnimales) {
		this.listaAnimales = listaAnimales;
	}

	public void addAnimal(Animales animal) {
		this.listaAnimales.add(animal);
	}

	public List<Animales> getAnimalesNacimiento(Integer ano) {
		List<Animales> listaAnimal = new ArrayList<>();
		for (Animales animales : listaAnimal) {
			if (animales.getFechaNacimiento().getYear() == ano) {
				listaAnimal.add(animales);
			}

		}
		return listaAnimal;
	}

	public BigDecimal getPesoTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Animales animales : listaAnimales) {
			total = total.add(animales.getPeso());

		}
		return total.setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal calcularPrecioVenta() {
		BigDecimal total = BigDecimal.ZERO;
		for (Animales animales : listaAnimales) {
			if (animales.sePuedeVender()) {
				total = total.add(animales.getPesoMinVenta().multiply(animales.getPesoMinVentaKg()));
			}
		}
		return total.setScale(2, RoundingMode.HALF_UP);
	}

	public void venderAnimales() {
		Iterator<Animales> iterador = listaAnimales.iterator();
		while (iterador.hasNext()) {
			Animales animal = iterador.next();
			if (animal.sePuedeVender()) {
				iterador.remove();
			}
		}
	}

	@Override
	public String toString() {
		return "Granja de " + localidad + " // " + listaAnimales.size() + " animales con " + getPesoTotal() + " kilos";
	}

}
