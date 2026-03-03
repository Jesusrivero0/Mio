package Ejercico2Repaso;

public class LocalizacionGPS extends Movil {

	private String x;
	private String y;


	public LocalizacionGPS(Integer numeroTelefono, String gps) {
		super(numeroTelefono, gps);
	}


	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

}
