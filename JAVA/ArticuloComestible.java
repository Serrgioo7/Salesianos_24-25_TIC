package MisProgramas;

public class ArticuloComestible extends Articulo {
	private Fecha fechaCaducidad;
	private String Tipo;
	public ArticuloComestible(int i, String nombre,int dia,int mes,int anio, String formato, String vendedor, double precio) {
		super(i, nombre, formato, vendedor, precio);
		// TODO Auto-generated constructor stub
		this.Tipo=Tipo;
		fechaCaducidad=new Fecha(dia,mes,anio);
	}
	/**
	 * @return the fechaCaducidad
	 */
	public String getFechaCaducidad(int tipoFormato) {
		return fechaCaducidad.getFechaFormato( tipoFormato);
	}
	public void setFechaCaducidad(int dia,int mes,int anio) {
		fechaCaducidad.setDia(dia);
		fechaCaducidad.setMes(mes);
		fechaCaducidad.setAnio(anio);
	}
	/**
	 * @param fechaCaducidad the fechaCaducidad to set
	 */
	public void setFechaCaducidad(String fechaCaducidad) {
		fechaCaducidad = fechaCaducidad;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return Tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
}
