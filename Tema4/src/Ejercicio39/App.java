package Ejercicio39;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
	
		Hucha hucha = new Hucha();
		hucha.meterDinero(new BigDecimal(100));
		System.out.println(hucha);
		
		hucha.meterDinero(new BigDecimal(50.501));
		System.out.println(hucha);
		
		hucha.sacarDinero(new BigDecimal(20.50));
		System.out.println(hucha);
		
		hucha.sacarDinero(new BigDecimal(200));
		System.out.println(hucha);
		
		hucha.meterDinero(new BigDecimal(130));
		System.out.println(hucha);
		
		BigDecimal contarDinero = hucha.contarDinero();
		hucha.meterDinero(contarDinero);
		System.out.println(hucha);
		
		BigDecimal romper = hucha.romperHucha();
		hucha.meterDinero(romper);
		System.out.println(hucha);
		

	}

}
