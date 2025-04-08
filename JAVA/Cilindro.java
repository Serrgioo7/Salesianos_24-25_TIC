package MisProgramas;

public class Cilindro{
private double radio;
private double altura;
private Coordenadas coordenadasBase;
/**
 * @param radio
 * @param altura
 */
public Cilindro(double radio, double altura,Coordenadas coordenadasBase) {
	this.radio = radio;
	this.altura = altura;
	this.coordenadasBase=coordenadasBase;}
public Cilindro(double radio,double altura) {
		this.radio = radio;
		this.altura = altura;
}
/**
 * @return the radio
 */
public double getRadio() {
	return radio;
}
/**
 * @param radio the radio to set
 */
public void setRadio(double radio) {
	this.radio = radio;
}
/**
 * @return the altura
 */
public double getAltura() {
	return altura;
}
/**
 * @param altura the altura to set
 */
public void setAltura(double altura) {
	this.altura = altura;
}

public double devuelveVolumen(){
	double area=Math.PI*radio*radio;
	double volumen=area*altura;
	return(volumen);
}
public double devuelveSuperficie() {
	double areaLateral=2*Math.PI*radio*altura;
	double areaBase=Math.PI*radio*radio;
	double superficie=areaLateral+areaBase*2;
	return(superficie);
}
public double devuelveSuperficie(boolean tipo) {
	double areaLateral=2*Math.PI*radio*altura;
	return areaLateral;
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
