package MisProgramas;

public class Articulo {
private int ID_articulo;
private String Nombre;
private String Formato;
private String Vendedor;
private double Precio;
/**
 * @return the iD_articulo
 */
public int getID_articulo() {
	return ID_articulo;
}
/**
 * @param iD_articulo the iD_articulo to set
 */
public void setID_articulo(int iD_articulo) {
	ID_articulo = iD_articulo;
}
/**
 * @return the nombre
 */
public String getNombre() {
	return Nombre;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	Nombre = nombre;
}
/**
 * @return the formato
 */
public String getFormato() {
	return Formato;
}
/**
 * @param formato the formato to set
 */
public void setFormato(String formato) {
	Formato = formato;
}
/**
 * @return the vendedor
 */
public String getVendedor() {
	return Vendedor;
}
/**
 * @param vendedor the vendedor to set
 */
public void setVendedor(String vendedor) {
	Vendedor = vendedor;
}
/**
 * @return the precio
 */
public double getPrecio() {
	return Precio;
}
/**
 * @param precio the precio to set
 */
public void setPrecio(double precio) {
	Precio = precio;
}
public double getPrecioIva(){
	 double precioIva = Precio+0.21*Precio;
	 return(precioIva);
	
}
/**
 * @param i
 * @param nombre
 * @param formato
 * @param vendedor
 * @param precio
 */
public Articulo(int i, String nombre, String formato, String vendedor, double precio) {
	ID_articulo = i;
	Nombre = nombre;
	Formato = formato;
	Vendedor = vendedor;
	Precio = precio;
}


}
