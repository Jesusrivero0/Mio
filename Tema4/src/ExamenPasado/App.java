package ExamenPasado;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) {

		Granja granja = new Granja("Sevilla");

		System.out.println(granja);

		Cerdo c1 = new Cerdo(1);
		c1.setRaza("Iberico Bellota");

		Cerdo c2 = new Cerdo(2);
		c2.setRaza("iberico cebo");

		Pollo p1 = new Pollo(3);
		Pollo p2 = new Pollo(4);
		Pollo p3 = new Pollo(5);

		granja.addAnimal(c1);
		granja.addAnimal(c2);
		granja.addAnimal(p1);
		granja.addAnimal(p2);
		granja.addAnimal(p3);

		System.out.println(granja);

		c1.setPeso(new BigDecimal(120.4));
		c1.setFechaNacimiento(LocalDate.of(2024, 01, 15));
		c2.setPeso(new BigDecimal(84));

		System.out.println(granja);

		p1.setFechaNacimiento(c1.getFechaNacimiento().plusMonths(3));
		p2.setFechaNacimiento(c1.getFechaNacimiento().plusMonths(3));
		p3.setFechaNacimiento(c1.getFechaNacimiento().plusMonths(3));

		p1.setPeso(new BigDecimal(3));
		p2.setPeso(new BigDecimal(3));
		p3.setPeso(new BigDecimal(13));

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = p3.getFechaNacimiento().format(formato);
		System.out.println(fecha);

		// System.out.println(LocalDate.now().daysUntil(p3.getFechaNacimiento().getMonthValue()));

		DecimalFormat formato2 = new DecimalFormat("#,###.00 €");
		System.out.println(formato2.format(granja.calcularPrecioVenta()));
		
		
		granja.venderAnimales();
		granja.venderAnimales();
		System.out.println(granja);

	}

}
