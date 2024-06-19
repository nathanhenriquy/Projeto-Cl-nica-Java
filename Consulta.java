public class Consulta {
    
    private double valor;
    private String dataConsulta;
    private Medico medico;
    private Paciente paciente;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void realizarConsulta() {
        System.out.println("Paciente em consulta, aguarde o resultado...");

        int tempoConsulta = 5000;

        try {
            Thread.sleep(tempoConsulta);
        } catch (InterruptedException e) {
            System.err.println("Consulta foi interrompida: " + e.getMessage());
        }

        
    }
}