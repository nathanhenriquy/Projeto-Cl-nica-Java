import java.io.*;
import java.util.*;

public class main {

    private static ArrayList<Medico> medicos = new ArrayList<>();
    private static ArrayList<Agendamento> agendamentos = new ArrayList<>();
    private static ArrayList<Exames> exames = new ArrayList<>();
    private static ArrayList<Paciente> pacientes = new ArrayList<>();
    private static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {

        medicos.add(new Medico("Dr. Gilmar", "11111111111", "24/04/1995", "CRM001", "Dentista"));
        medicos.add(new Medico("Dr. Juliana", "22222222222", "45/02/1995", "CRM002", "Dermatologia"));
        medicos.add(new Medico("Dr. Sla", "33333333333", "23/12/1995", "CRM003", "Neurologia"));
        medicos.add(new Medico("Dr. Sla", "44444444444", "31/09/1995", "CRM004", "Ortopedia"));
        medicos.add(new Medico("Dr. Sla", "55555555555", "05/01/1995", "CRM005", "Pediatria"));

        //Scanner leitor = new Scanner(System.in);
        int op;

        do {
            System.out.println("1. Cadastrar Paciente");
            System.out.println("2. Agendar Consulta");
            System.out.println("3. Verificar Disponibilidade");
            System.out.println("4. Realizar Consulta");
            System.out.println("5. Gerar Receita Médica");
            System.out.println("6. Agendar Exame");
            System.out.println("7. Emitir Resultado do Exame");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            op = Integer.parseInt(leitor.nextLine());

            switch (op) {
                case 1:
                    System.out.println("\n\n");
                    System.out.println("===== CADASTRO PACIENTE =====");
                    System.out.print("Nome do paciente: ");
                    String nome = leitor.nextLine();
                    System.out.print("CPF do paciente: ");
                    String cpf = leitor.nextLine();
                    System.out.print("Data de nascimento do paciente: ");
                    String dataNascimento = leitor.nextLine();
                    System.out.println("\n");
                    System.out.println("===== ENDEREÇO =====");
                    System.out.print("Rua: ");
                    String rua = leitor.nextLine();
                    System.out.print("Número: ");
                    String numero = leitor.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = leitor.nextLine();
                    System.out.print("Estado: ");
                    String estado = leitor.nextLine();
                    System.out.print("CEP: ");
                    String cep = leitor.nextLine();
                    System.out.println("\n");
                    System.out.println("===== PLANO DE SAÚDE =====");
                    System.out.print("Nome do plano: ");
                    String nomePlano = leitor.nextLine();
                    System.out.print("Número da carteirinha: ");
                    String numeroCarteira = leitor.nextLine();

                    Endereco endereco = new Endereco(rua, numero, cidade, estado, cep);
                    Paciente paciente = new Paciente(nome, cpf, dataNascimento, nomePlano, numeroCarteira, endereco);
                    pacientes.add(paciente);
                    System.out.println("---> Paciente cadastrado!");
                    System.out.println("\n");

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    // ATENÇÃO: o metodo realizarConsulta retorna true caso haja um interesse em
                    // marcar um exame
                    // e false caso nao queira marcar o exame
                    break;
                case 5:

                    break;
                case 6:
                    Exames.agendarExame(leitor);

                    break;
                case 7:
                    Exames.emitirResultadoExame(leitor);

                    break;
                case 8:
                    System.out.println("====> Saindo <====");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (op != 8);

        leitor.close();
    }

}
