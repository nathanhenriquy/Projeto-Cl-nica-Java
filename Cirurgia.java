public class Cirurgia {
    
    private String tipoCirurgia;
    private double valor;
    private String dataCirurgia;
    private Medico medico;
    private Paciente paciente;
    
    public String getTipoCirurgia() {
        return tipoCirurgia;
    }
    public void setTipoCirurgia(String tipoCirurgia) {
        this.tipoCirurgia = tipoCirurgia;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getDataCirurgia() {
        return dataCirurgia;
    }
    public void setDataCirurgia(String dataCirurgia) {
        this.dataCirurgia = dataCirurgia;
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

    
}
