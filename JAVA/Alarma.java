package MisProgramas;

public class Alarma {
private int minutos;
private int horas;
private int dia;
private String mensaje;
/**
 * @param minutos
 * @param horas
 * @param dia
 * @param mensaje
 */
public Alarma(int minutos, int horas, int dia, String mensaje) {
	this.minutos = minutos;
	this.horas = horas;
	this.dia = dia;
	this.mensaje = mensaje;
}
public Alarma(int minutos, int horas, int dia) {
	this.minutos = minutos;
	this.horas = horas;
	this.dia = dia;
}
/**
 * @return the minutos
 */
public int getMinutos() {
	return minutos;
}
/**
 * @param minutos the minutos to set
 */
public void setMinutos(int minutos) {
	this.minutos = minutos;
}
/**
 * @return the horas
 */
public int getHoras() {
	return horas;
}
/**
 * @param horas the horas to set
 */
public void setHoras(int horas) {
	this.horas = horas;
}
/**
 * @return the dia
 */
public int getDia() {
	return dia;
}
/**
 * @param dia the dia to set
 */
public void setDia(int dia) {
	this.dia = dia;
}
/**
 * @return the mensaje
 */
public String getMensaje() {
	return mensaje;
}
/**
 * @param mensaje the mensaje to set
 */
public void setMensaje(String mensaje) {
	this.mensaje = mensaje;
}
public void activar() {
	System.out.println("La alarma ahora esta activada: ");

}
public void desactivar() {
	System.out.println("La alarma ahora esta desactivada: ");

}

public void posponer(int extra) {
	minutos += extra;
	while (minutos >= 60) {
		minutos -= 60;
		horas +=1;}
	}
	public void posponer2(int extra,int hor) {
		minutos += extra;
		horas += hor;
		while (minutos >= 60) {
			minutos -= 60;
			horas +=1;
		}
		if (horas >= 24) {
			horas -= 24;
		}
	}
public void getAll() {
	System.out.printf("minutos: %d,horas: %d,dia: %d,mensaje: %s ",minutos,horas,dia,mensaje);
}
}

