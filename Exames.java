import java.util.ArrayList;
import java.util.Scanner;


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

    private static ArrayList<Exames> exames = new ArrayList<>();
    private static ArrayList<Medico> medicos = new ArrayList<>();
    private static ArrayList<Paciente> pacientes = new ArrayList<>();

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

    

    public static void agendarExame(Scanner leitor) {
        
        System.out.println("===== AGENDAMENTO DE EXAME =====");
        System.out.print("CPF do paciente: ");
        String CPFPaciente = leitor.nextLine();

        String pacienteString = ArquivoPaciente.buscarPacientePorCpf(CPFPaciente);
        Paciente paciente = Paciente.fromString(pacienteString);

        if (paciente == null) {
            System.out.println("Paciente não encontrado");
            return;
        }

        System.out.print("Tipo de exame: ");
        String tipoExame = leitor.nextLine();
        System.out.print("Data do exame: ");
        String dataExame = leitor.nextLine();
        System.out.println("Selecione o médico para o exame:");
        MedicoController.listarMedicos();
        System.out.print("Escolha o número do médico: ");
        int numMedico = Integer.parseInt(leitor.nextLine());
        Medico medicoSelecionado = MedicoController.medicos.get(numMedico - 1);
        
        
 

        if (medicoSelecionado == null) {
            System.out.println("Médico não encontrado");
            return;
        } 

        Exames exame = new Exames(tipoExame, dataExame, medicoSelecionado, paciente);
        exames.add(exame);
        //Exames.agendarExame(leitor);
        System.out.println("Exame agendado com sucesso");
    }

    public static void emitirResultadoExame(Scanner leitor) {
        System.out.println("===== EMISSÃO DE RESULTADO DE EXAME =====");
        System.out.print("\nCPF do paciente:" );
        String cpfPacString = leitor.nextLine();
        String pacienteString = ArquivoPaciente.buscarPacientePorCpf(cpfPacString);
        Paciente paciente = Paciente.fromString(pacienteString);


        if (paciente == null) {
            System.out.println("Paciente não encontrado");
            return;
        }

        System.out.println("Resultado do exame emitido com sucesso");
    }

    

    public static Exames buscarExamePorPacienteETipo(Paciente paciente, String tipoExame) {
        for (Exames exame : exames) {
            if (exame.getPaciente().equals(paciente) && exame.getTipoExame().equalsIgnoreCase(tipoExame)) {
                return exame;
            }
        }
        return null;
    }



}