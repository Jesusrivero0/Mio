package Ejercicio40;



public class Cargo extends Movimientos{

	public String cif;
	@Override
	public String toString() {
		return "C " + getFecha() + getImporte() + " - " + cif;
	}
	@Override
	public void añadirMovimiento() {
		
		
	}
	
	
	
	
	
}
