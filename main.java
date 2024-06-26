import java.io.*;
import java.util.*;

public class Main {

    private static ArrayList<Agendamento> agendamentos = new ArrayList<>();
    private static ArrayList<Exames> exames = new ArrayList<>();
    private static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        MedicoController.pre_colocados();
        int op;

        do {
            System.out.println("\n\n\n==== CLINICA =====");
            System.out.println("1. Cadastrar Paciente");
            System.out.println("2. Agendar Consulta");
            System.out.println("3. Verificar Disponibilidade");
            System.out.println("4. Realizar Consulta");
            System.out.println("5. Gerar Receita Médica");
            System.out.println("6. Agendar Exame");
            System.out.println("7. Emitir Resultado do Exame");
            System.out.println("8. Listar Pacientes");
            System.out.println("9. Buscar Paciente por CPF");
            System.out.println("10. Listar Médicos");
            System.out.println("11. Sair");
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

                    // Paciente paciente = new Paciente(nome, cpf, dataNascimento, new Endereco(rua,
                    // numero, cidade, estado, cep));
                    // ArquivoPaciente.salvarPaciente(paciente);

                    System.out.println("\n");
                    System.out.println("===== PLANO DE SAÚDE =====");
                    System.out.print("Nome do plano: ");
                    String nomePlano = leitor.nextLine();
                    System.out.print("Número da carteirinha: ");
                    String numeroCarteira = leitor.nextLine();

                    Endereco endereco = new Endereco(rua, numero, cidade, estado, cep);
                    Paciente paciente = new Paciente(nome, cpf, dataNascimento, nomePlano, numeroCarteira, endereco);
                    ArquivoPaciente.salvarPaciente(paciente);
                    System.out.println("---> Paciente cadastrado!");
                    System.out.println("\n\n");

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("\n\n==== GERAR RECEITA MÉDICA ==== ");
                    System.out.println("Digite o CPF do paciente para gerar a receita:");
                    String cpfbusca0 = leitor.nextLine();                    
                    String pacienteEncontrado = ArquivoPaciente.buscarPacientePorCpf(cpfbusca0);

                    if (pacienteEncontrado != null) {
                        
                        System.out.println("Selecione o médico para a receita:");
                        MedicoController.listarMedicos();
                        System.out.print("Escolha o número do médico: ");
                        int numMedico = Integer.parseInt(leitor.nextLine());
                        Medico medicoSelecionado = MedicoController.medicos.get(numMedico - 1);

                        
                        ReceitaMedica receita = ReceitaMedica.criarReceita(leitor, medicoSelecionado,
                                pacienteEncontrado);
                        receita.imprimirReceita();
                    } else {
                        System.out.println("Paciente não encontrado.");
                    }

                    break;
                case 6:

                    Exames.agendarExame(leitor);
                    break;
                case 7:

                    Exames.emitirResultadoExame(leitor);
                    break;
                case 8:

                    System.out.println("\n\n==== LISTA DE PACIENTES ==== ");
                    ArquivoPaciente.listarPacientes();

                    List<String> pacientes = ArquivoPaciente.listarPacientes();
                    for (String pacienteTemp : pacientes) {
                        System.out.println(pacienteTemp);
                    }
                
                    break;
                case 9:

                    System.out.println("\n\n==== BUSCA POR CPF ==== ");
                    System.out.println("Digite o CPF do paciente:");
                    String cpfbusca = leitor.nextLine();


                    String pacienteTemp = ArquivoPaciente.buscarPacientePorCpf(cpfbusca);
                    if (pacienteTemp != null) {
                        System.out.println("Paciente encontrado: " + pacienteTemp);
                    } else {
                        System.out.println("Paciente com CPF " + cpfbusca + " não encontrado.");
                    }
                    break;
                case 10:

                    System.out.println("\n\n==== LISTA DE MEDICOS ==== ");
                    MedicoController.listarMedicos();
                    break;
                case 11:

                    System.out.println("====> Saindo <====");
                    break;
                default:

                    System.out.println("Opção inválida.");
                    break;
            }

        } while (op != 11);

        leitor.close();
    }
}