package Ej02Repaso.App;

import java.math.BigDecimal;


import Ej02Repaso.Modelo.Planta;
import Ej02Repaso.Service.PlantaAlturaException;
import Ej02Repaso.Service.plantaServicio;

public class App {

	public static void main(String[] args) {

		plantaServicio ps = new plantaServicio();
		Planta p1 = new Planta();
		Planta p2 = new Planta();
		Planta p3 = new Planta();
		p1.setId(1);
		p1.setNombre("Aloe Vera");
		p1.setTipo("Medicinal");
		p1.setAltura(new BigDecimal(0.75));
		p2.setId(2);
		p2.setNombre("Lavanda");
		p2.setTipo("Aromatica");
		p2.setAltura(new BigDecimal(1.20));
		p3.setId(3);
		p3.setNombre("Bambu");
		p3.setTipo("Exterior");
		p3.setAltura(new BigDecimal(2.10));
		try {
			ps.insertarPlanta(p1);
			ps.insertarPlanta(p2);
			ps.insertarPlanta(p3);
		} catch (PlantaAlturaException e) {
			System.out.println(e.getMessage());

		}
	}

}
