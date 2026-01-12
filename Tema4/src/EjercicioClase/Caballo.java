package EjercicioClase;

public class Caballo {

	private String nombre;
	private String color;
	private Integer edad;
	private Integer carrerasGanadas;

	public Caballo() {
		this.nombre = "";
		this.color = "";
		this.edad = 0;
		this.carrerasGanadas = 0;
	}
	
	public Caballo(String nombre, String color, Integer edad, Integer carrerasGanadas) {
		this.nombre = nombre;
		this.color = color;
		this.edad = edad;
		this.carrerasGanadas = carrerasGanadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getCarrerasGanadas() {
		return carrerasGanadas;
	}

	public void setCarrerasGanadas(Integer carrerasGanadas) {
		this.carrerasGanadas = carrerasGanadas;
	}

	public void imprimeCarrerasGanadas() {
		System.out.println("El numero de carreras ganadas es " + this.carrerasGanadas);
	}

	public Integer añoNacimiento() {
		Integer total = 2026 - this.edad;
		return total;
	}

	public void incrementarCarrerasGanadas() {
		this.carrerasGanadas = +1;
	}

	public void relincha() {
		System.out.println("hiiiiieeeeee");
	}

	@Override
	public String toString() {
		return "Caballo " + nombre + ", color = " + color + " , edad = " + edad + ", carrerasGanadas = "
				+ carrerasGanadas;
	}

	
}
