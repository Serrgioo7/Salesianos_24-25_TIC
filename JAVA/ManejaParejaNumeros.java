package MisProgramas;

public class ManejaParejaNumeros {

	public static void main(String[] args) {
		ParejaNumeros miPareja;//Instanciamos un objeto de la clase ParejaNumeros
		miPareja=new ParejaNumeros(3,2);
		System.out.println("Coordenada x: "+miPareja.x);
		System.out.println("Coordenada y: "+miPareja.y);
		System.out.println("Modulo: "+miPareja.devuelveModulo());
		System.out.println("Fase en radianes: "+miPareja.devuelveAnguloRadianes());
		System.out.println("Fase en grados: "+miPareja.devuelveAnguloGrados());
	}

}
