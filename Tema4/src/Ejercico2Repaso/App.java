package Ejercico2Repaso;

public class App {

	public static void main(String[] args) {
		
		Movil m = new Movil(654654654, 123);
		Fijo f = new Fijo (610610610, "calle 2");
		
		m.consultarNumero(654654654);
		f.consultarNumero(610610610);
		
		m.marcar(654654654);
		f.marcar(610610610);
		
		m.colgar();
		f.colgar();

	}

}
