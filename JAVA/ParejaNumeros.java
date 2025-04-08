package MisProgramas;

public class ParejaNumeros {
	//atributos
	double x;
	double y;
	//this.x es la de fuera
	//Constructor
	public ParejaNumeros(double nuevox, double nuevoy){
	this.x=nuevox;
	this.y=nuevoy;
	
	
}
	//Metodos getters &setters
	double devuelveX(){
		return(x);
	}
	double devuelveY(){
		return(y);
	}
	void setX(int x){
		this.x=x;
	}
	void setY(int y){
		this.y=y;
	}
	double devuelveModulo(){
		double modulo=Math.sqrt(x*x+y*y);
		return (modulo);
	}
	double devuelveAnguloRadianes(){
		double anguloRadianes=Math.atan(y/x);
		return (anguloRadianes);
	}
	double devuelveAnguloGrados() {
		double anguloRadianes=Math.atan(y/x);
		double anguloGrados=180* anguloRadianes/Math.PI;
		return (anguloGrados);
	}
}