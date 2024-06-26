import java.util.Scanner;

public class ReceitaMedica {

    private String medicamentos;
    private String dosagem;
    private String instrucoes;
    private String dataEmissao;
    private Medico medico;
    private Paciente paciente;

    
    public ReceitaMedica(String medicamentos, String dosagem, String instrucoes, String dataEmissao, Medico medico,
            Paciente paciente) {
        this.medicamentos = medicamentos;
        this.dosagem = dosagem;
        this.instrucoes = instrucoes;
        this.dataEmissao = dataEmissao;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
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

    public void imprimirReceita() {
        System.out.println("\n\n===== RECEITA MÉDICA =====");
        System.out.println("Data de Emissão: " + dataEmissao);
        System.out.println("Médico: " + medico.getNome());
        System.out.println("CPF Médico: " + medico.getCpf());
        System.out.println("Especialidade Médico: " + medico.getEspecialidade());
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("CPF Paciente: " + paciente.getCpf());
        System.out.println("Medicamentos: " + medicamentos);
        System.out.println("Dosagem: " + dosagem);
        System.out.println("Instruções: " + instrucoes);
        System.out.println("==========================");
    }

    
    public static ReceitaMedica criarReceita(Scanner leitor, Medico medico, Paciente paciente) {
        System.out.print("Medicamentos prescritos: ");
        String medicamentos = leitor.nextLine();
        System.out.print("Dosagem: ");
        String dosagem = leitor.nextLine();
        System.out.print("Instruções: ");
        String instrucoes = leitor.nextLine();
        System.out.print("Data de Emissão (DD/MM/AAAA): ");
        String dataEmissao = leitor.nextLine();

        ReceitaMedica receita = new ReceitaMedica(medicamentos, dosagem, instrucoes, dataEmissao, medico, paciente);
        return receita;
    }
}

