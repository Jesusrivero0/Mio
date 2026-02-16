package Ejercicio40;

import java.util.ArrayList;
import java.util.List;

public class Retiradas extends Movimientos{

	@Override
	public String toString() {
		return "R " + getFecha() + getImporte();
	}

	@Override
	public List<String> getRetiradas() {
		List<String> listaMov = new ArrayList<>();
						
		return listaMov;
		
	}
	
	

	
}
