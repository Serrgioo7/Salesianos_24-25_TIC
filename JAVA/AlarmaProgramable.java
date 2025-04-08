package AlarmaProgramable;  // Debe ser IDÉNTICO en los 3 archivos

public class AlarmaProgramable {
    // Campos
    private int hora;
    private int minutos;
    private String diaSemana;
    private String mensaje;
    private boolean activada;
    
    // Constructores sobrecargados
    public AlarmaProgramable(int hora, int minutos) {
        this(hora, minutos, null, "Alarma", true);
    }
    
    public AlarmaProgramable(int hora, int minutos, String diaSemana, String mensaje) {
        this(hora, minutos, diaSemana, mensaje, true);
    }
    
    public AlarmaProgramable(int hora, int minutos, String diaSemana, String mensaje, boolean activada) {
        this.hora = hora;
        this.minutos = minutos;
        this.diaSemana = diaSemana;
        this.mensaje = mensaje;
        this.activada = activada;
    }
    
    // Métodos
    public void activar() {
        this.activada = true;
    }
    
    public void desactivar() {
        this.activada = false;
    }
    
    // Métodos posponer sobrecargados
    public void posponer(int minutos) {
        this.minutos += minutos;
        ajustarTiempo();
    }
    
    public void posponer(int horas, int minutos) {
        this.hora += horas;
        this.minutos += minutos;
        ajustarTiempo();
    }
    
    private void ajustarTiempo() {
        // Ajustar horas si los minutos pasan de 60
        this.hora += this.minutos / 60;
        this.minutos = this.minutos % 60;
        
        // Ajustar días si las horas pasan de 24
        this.hora = this.hora % 24;
    }
    
    public String mostrarInformacion() {
        return String.format("Alarma: %02d:%02d - %s - Mensaje: '%s' - %s",
                hora, minutos,
                diaSemana != null ? diaSemana : "Cualquier día",
                mensaje,
                activada ? "ACTIVADA" : "DESACTIVADA");
    }
    
    // Getters y setters
    public int getHora() { return hora; }
    public int getMinutos() { return minutos; }
    public String getDiaSemana() { return diaSemana; }
    public String getMensaje() { return mensaje; }
    public boolean isActivada() { return activada; }
    
    public void setHora(int hora) { this.hora = hora; }
    public void setMinutos(int minutos) { this.minutos = minutos; }
    public void setDiaSemana(String diaSemana) { this.diaSemana = diaSemana; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
}