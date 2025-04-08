package MisProgramas;

public class ManejaAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno1;
		AlumnoDeportista alumno2;
		alumno1 = new Alumno("Jorge","Alcaine","Perez");
		alumno2 = new AlumnoDeportista("Carlos","alcaraz","Benito","Tenis");
		System.out.println("Nombre del alumno: "+alumno1.getNombre());
		System.out.println("Primer apellido del alumno: "+alumno1.getApellido1());
		System.out.println("Segundo apellido del alumno: "+alumno1.getApellido2());
	}

}
