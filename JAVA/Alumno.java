package MisProgramas;

public class Alumno {
 private String nombre;
 private String apellido1;
 private String apellido2;
 private String fecha;
 double nota;
/**
 * @param nombre
 * @param apellido1
 * @param apellido2
 */
public Alumno(String nombre, String apellido1, String apellido2) {
	this.nombre = nombre;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
}
/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * @return the apellido1
 */
public String getApellido1() {
	return apellido1;
}
/**
 * @param apellido1 the apellido1 to set
 */
public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
}
/**
 * @return the apellido2
 */
public String getApellido2() {
	return apellido2;
}
/**
 * @param apellido2 the apellido2 to set
 */
public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
}
/**
 * @return the fecha
 */
public String getFecha() {
	return fecha;
}
/**
 * @param fecha the fecha to set
 */
public void setFecha(String fecha) {
	this.fecha = fecha;
}
/**
 * @return the nota
 */
public double getNota() {
	return nota;
}
/**
 * @param nota the nota to set
 */
public void setNota(double nota) {
	this.nota = nota;
}
//polimorfismo
public String getnombreApellidos() {
	String NombreApellidos=nombre+" "+apellido1+" "+apellido2;
	return(NombreApellidos);
}
public String getNombreApellidos(char modo) {
	String NombreApellidos=apellido1+" "+apellido2+","+nombre;
	return(NombreApellidos);
}
//metodo sobrecargado
}
