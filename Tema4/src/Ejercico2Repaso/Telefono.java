package Ejercico2Repaso;

public class Telefono {

	private Integer numero;
	private Boolean enLlamada;

	public Telefono(Integer numeroTelefono) {
		this.enLlamada = false;
	}

	public Integer consultarNumero(Integer numero) {
		this.numero = numero;
		return numero;
	}

	public void marcar(Integer numeroTelefono) {
		System.out.println("Llamando a " + numeroTelefono);
		if (numeroTelefono == this.numero) {
			System.out.println("Comunicando");
		} else {
			System.out.println("En comunicacion");
			enLlamada = true;
		}
	}

	public void colgar() {
		if (enLlamada) {
			System.out.println("comunicacion terminada");
			enLlamada = false;
		}
	}
}
