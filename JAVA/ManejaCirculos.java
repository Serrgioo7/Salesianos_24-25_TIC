/**
 * 
 */
package MisProgramas;

/**
 * 
 */
public class ManejaCirculos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circulo miCirculito;
		Circulo miCirculito2;
		miCirculito=new Circulo(3, 2, 5);
		miCirculito2=new Circulo(0,0,2);
		System.out.println("Area= "+ miCirculito.getSurface());
		System.out.println("Longitud= "+miCirculito.getCircleLenght());
		System.out.println("Area= "+ miCirculito2.getSurface());
		System.out.println("Longitud= "+miCirculito2.getCircleLenght());
	}

}
