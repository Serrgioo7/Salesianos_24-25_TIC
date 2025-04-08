package MisProgramas;

public class CilindroConColor extends Cilindro{
	public CilindroConColor(double radio, double altura, Coordenadas coordenadasBase) {
		super(radio, altura, coordenadasBase);
		// TODO Auto-generated constructor stub
	}
	private String Color;

	/**
	 * @return the color
	 */
	public String getColor() {
		return Color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		Color = color;
	}

}
