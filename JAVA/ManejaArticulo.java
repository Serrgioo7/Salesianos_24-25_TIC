package MisProgramas;

public class ManejaArticulo {
	public static void main(String[] args) {
		ArticuloComestible articulo1;
		articulo1=new ArticuloComestible(1,"Leche",1,12,2025,"lacteos","Pablo",20.25);
	System.out.println(articulo1.getID_articulo()+" "+articulo1.getNombre()+" "+articulo1.getFechaCaducidad(1));
	}
}
