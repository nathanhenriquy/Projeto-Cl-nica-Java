import java.util.ArrayList;
import java.util.Scanner;

public class MedicoController {

    private static ArrayList<Medico> medicos = new ArrayList<>();

    public static void cadastrarMedico(Scanner leitor) {
        System.out.println("\n\n");
        System.out.println("===== CADASTRO Medico =====");
        System.out.print("Nome do medico: ");
        String nomeMedico = leitor.nextLine();
        System.out.print("CPF do Medico: ");
        String cpfMedico = leitor.nextLine();
        System.out.print("Data de nascimento do medico: ");
        String dataNascimentoMedico = leitor.nextLine();
        System.out.print("CRM do medico: ");
        String crm = leitor.nextLine();
        System.out.print("Especialidade do medico: ");
        String especialidade = leitor.nextLine();

        Medico medico = new Medico(nomeMedico, cpfMedico, dataNascimentoMedico, crm, especialidade);
        medicos.add(medico); // Adiciona o médico à lista de médicos
        System.out.println("---> Médico cadastrado!");
        System.out.println("\n");
    }


    public static void listarMedicos() {
        System.out.println("\n\n===== LISTA DE MÉDICOS =====");
        if (medicos.isEmpty()) {
            System.out.println("Não há médicos cadastrados.");
        } else {
            for (Medico medico : medicos) {
                System.out.println("Nome: " + medico.getNome());
                System.out.println("CPF: " + medico.getCpf());
                System.out.println("Data de Nascimento: " + medico.getDataNascimento());
                System.out.println("CRM: " + medico.getCrm());
                System.out.println("Especialidade: " + medico.getEspecialidade());
                System.out.println("=============================");
            }
        }
    }

    
}
