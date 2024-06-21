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
        System.out.print("Nome do paciente: ");
        String nomePaciente = leitor.nextLine();
        Paciente paciente = buscarPacientePorNome(nomePaciente);

        if (paciente == null) {
            System.out.println("Paciente não encontrado");
            return;
        }

        System.out.print("Tipo de exame: ");
        String tipoExame = leitor.nextLine();
        System.out.print("Data do exame: ");
        String dataExame = leitor.nextLine();
        System.out.print("Nome do médico responsável: ");
        String nomeMedico = leitor.nextLine();
        Medico medico = buscarMedicoPorNome(nomeMedico);

        if (medico == null) {
            System.out.println("Médico não encontrado");
            return;
        }

        Exames exame = new Exames(tipoExame, dataExame, medico, paciente);
        exames.add(exame);
        exame.agendarExame();
        System.out.println("Exame agendado com sucesso");
    }

    public static void emitirResultadoExame(Scanner leitor) {
        System.out.println("===== EMISSÃO DE RESULTADO DE EXAME =====");
        System.out.print("Nome do paciente: ");
        String nomePaciente = leitor.nextLine();
        Paciente paciente = buscarPacientePorNome(nomePaciente);

        if (paciente == null) {
            System.out.println("Paciente não encontrado");
            return;
        }

        System.out.print("Tipo de exame: ");
        String tipoExame = leitor.nextLine();
        Exames exame = buscarExamePorPacienteETipo(paciente, tipoExame);

        if (exame == null) {
            System.out.println("Exame não encontrado");
            return;
        }

        System.out.print("Resultado do exame: ");
        String resultado = leitor.nextLine();
        exame.setResultado(resultado);
        exame.emitirResultado();
        System.out.println("Resultado do exame emitido com sucesso");
    }

    public void agendarExame() {
        System.out.println("Exame agendado para " + paciente.getNome() + " com o médico " + medicoResponsavel.getNome() + " na data " + dataExame + ".");
    }

    public void emitirResultado() {
        System.out.println("Resultado do exame de " + paciente.getNome() + ": " + resultado);
    }


    public static Paciente buscarPacientePorNome(String nome) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                return paciente;
            }
        }
        return null;
    }

    public static Medico buscarMedicoPorNome(String nome) {
        for (Medico medico : medicos) {
            if (medico.getNome().equalsIgnoreCase(nome)) {
                return medico;
            }
        }
        return null;
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