package MisProgramas;

public class AlarmaRecurrente extends Alarma{
	private String recurrencia;
public AlarmaRecurrente(int minutos, int horas, int dia, String mensaje, String recurrencia) {
		super(minutos, horas, dia, mensaje);
		// TODO Auto-generated constructor stub
		
	}
/**
 * @return the recurrencia
 */
public String getRecurrencia() {
	return recurrencia;
}
/**
 * @param recurrencia the recurrencia to set
 */
public void setRecurrencia(String recurrencia) {
	this.recurrencia = recurrencia;
}
}
