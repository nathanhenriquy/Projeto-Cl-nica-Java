public class Exames {

    private String tipoExame;
    private String dataExame;
    private Medico medicoResponsavel;
    private Paciente paciente;
    private String resultado;

    public Exames(String tipoExame, String dataExame, Medico medicoResponsavel, Paciente paciente) {
        this.tipoExame = tipoExame;
        this.dataExame = dataExame;
        this.medicoResponsavel = medicoResponsavel;
        this.paciente = paciente;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public String getDataExame() {
        return dataExame;
    }

    public void setDataExame(String dataExame) {
        this.dataExame = dataExame;
    }

    public Medico getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(Medico medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void agendarExame() {
        System.out.println("Exame de tipo " + tipoExame + " agendado para " + dataExame);
    }

    public void emitirResultado() {
        System.out.println("Resultado do exame: " + resultado);
    }
}