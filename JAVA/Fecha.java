package MisProgramas;

public class Fecha {
int dia;
int mes;
int anio;

/**
 * @param dia
 * @param mes
 * @param anio
 */
public Fecha(int dia, int mes, int anio) {
	this.dia = dia;
	this.mes = mes;
	this.anio = anio;
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
 * @return the mes
 */
public int getMes() {
	return mes;
}
/**
 * @param mes the mes to set
 */
public void setMes(int mes) {
	this.mes = mes;
}
/**
 * @return the anio
 */
public int getAnio() {
	return anio;
}
/**
 * @param anio the anio to set
 */
public void setAnio(int anio) {
	this.anio = anio;
}
String getFechaFormato(int tipo){
	String fechaFormateada="";
	String mesNombre="";
	switch(tipo) {
	case 1:
		String listaMeses[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Nobiembre","Diciembre"};
		mesNombre=listaMeses[mes-1];
		fechaFormateada=fechaFormateada+dia+"/"+mesNombre+"/"+anio;
		break;
	case 2:
		fechaFormateada=fechaFormateada+dia+"/"+mes+"/"+anio;
		break;
	case 3:
		fechaFormateada=fechaFormateada+dia+"/"+mes+"/"+(anio-2000);
		break;
	case 4:
		fechaFormateada=fechaFormateada+dia+"/"+mes;
		break;
	}
	return fechaFormateada;
}
}
