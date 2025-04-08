package MisProgramas;

public class Coordenadas {
private int x;
private int y;
private int z;
/**
 * @param x
 * @param y
 * @param z
 */
public Coordenadas(int x, int y, int z) {
	this.x = x;
	this.y = y;
	this.z = z;
}
/**
 * @return the x
 */
public int getX() {
	return x;
}
/**
 * @param x the x to set
 */
public void setX(int x) {
	this.x = x;
}
/**
 * @return the y
 */
public int getY() {
	return y;
}
/**
 * @param y the y to set
 */
public void setY(int y) {
	this.y = y;
}
/**
 * @return the z
 */
public int getZ() {
	return z;
}
/**
 * @param z the z to set
 */
public void setZ(int z) {
	this.z = z;
}
public void suma2D(double x1,double y1,double x2,double y2) {
	double resultx=x2-x1;
	double resulty=y2-y1;
	System.out.printf("El vector suma es(%f,%f)", resultx,resulty);
}
public void resta2D(double x1,double y1,double x2,double y2) {
	double resultx=x2+x1;
	double resulty=y2+y1;
	System.out.printf("El vector resta es(%f,%f)", resultx,resulty);
}
}
