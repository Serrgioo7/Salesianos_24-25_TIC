package MisProgramas;

public class ManejaCilindro {
public static void main(String[] args) {
	Cilindro miCilindro;
	miCilindro=new Cilindro(5,3);
	System.out.println("Area total ="+miCilindro.devuelveSuperficie());
	System.out.println("Area base ="+miCilindro.devuelveSuperficie(true));
}
}
