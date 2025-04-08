package MisProgramas;

public class ManejaAlarma {
public static void main(String[] args) {
	Alarma alarma1;
	AlarmaRecurrente alarma2;
	alarma1 = new Alarma(30,2,12,"Alerta por sigma");
	alarma2 = new AlarmaRecurrente(30,2,12,"Alerta por sigma","");
	alarma1.activar();
	alarma1.posponer(80);
	System.out.println(alarma1.getMinutos());
	System.out.println(alarma1.getHoras());
	alarma1.getAll();
	alarma1.desactivar();
}
}
