/**
 * 
 */
package MisProgramas;

/**
 * 
 */
public class Triangulo {
	double v1x;
	double v1y;
	double v2x;
	double v2y;
	double v3x;
	double v3y;
	/**
	 * @return the v1x
	 */
	public double getV1x() {
		return v1x;
	}
	/**
	 * @param v1x the v1x to set
	 */
	public void setV1x(double v1x) {
		this.v1x = v1x;
	}
	/**
	 * @return the v1y
	 */
	public double getV1y() {
		return v1y;
	}
	/**
	 * @param v1y the v1y to set
	 */
	public void setV1y(double v1y) {
		this.v1y = v1y;
	}
	/**
	 * @return the v2x
	 */
	public double getV2x() {
		return v2x;
	}
	/**
	 * @param v2x the v2x to set
	 */
	public void setV2x(double v2x) {
		this.v2x = v2x;
	}
	/**
	 * @return the v2y
	 */
	public double getV2y() {
		return v2y;
	}
	/**
	 * @param v2y the v2y to set
	 */
	public void setV2y(double v2y) {
		this.v2y = v2y;
	}
	/**
	 * @return the v3x
	 */
	public double getV3x() {
		return v3x;
	}
	/**
	 * @param v3x the v3x to set
	 */
	public void setV3x(double v3x) {
		this.v3x = v3x;
	}
	/**
	 * @return the v3y
	 */
	public double getV3y() {
		return v3y;
	}
	/**
	 * @param v3y the v3y to set
	 */
	public void setV3y(double v3y) {
		this.v3y = v3y;
	}
	/**
	 * @param v1x
	 * @param v1y
	 * @param v2x
	 * @param v2y
	 * @param v3x
	 * @param v3y
	 */
	public Triangulo(double v1x, double v1y, double v2x, double v2y, double v3x, double v3y) {
		this.v1x = v1x;
		this.v1y = v1y;
		this.v2x = v2x;
		this.v2y = v2y;
		this.v3x = v3x;
		this.v3y = v3y;
	}
	public double Perimetro(double v1x, double v1y, double v2x, double v2y, double v3x, double v3y) {
		double lado1 = 0, lado2=0,lado3=0;
			lado1=Math.sqrt((v1x*v1x+v2x*v2x)+(v1y*v1y+v2y*v2y));
			lado2=Math.sqrt((v3x*v3x+v2x*v2x)+(v3y*v3y+v2y*v2y));
			lado3=Math.sqrt((v3x*v3x+v1x*v1x)+(v3y*v3y+v1y*v1y));
		return(lado1+lado2+lado3);
	}
}
