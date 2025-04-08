package MisProgramas;

public class AlumnoDeportista extends Alumno {
	private String deporte;
	public AlumnoDeportista(String nombre, String apellido1, String apellido2,String deporte) {
		super(nombre, apellido1, apellido2);
		this.deporte=deporte;
	}

}
