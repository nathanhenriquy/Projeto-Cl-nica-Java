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
            System.out.println("1. Cadastrar Paciente"); //funcionando
            System.out.println("2. Agendar Consulta"); //funcionando
            System.out.println("3. Realizar Consulta"); //funcionando
            System.out.println("4. Gerar Receita Médica"); //funcionando
            System.out.println("5. Agendar Exame"); //funcionando
            System.out.println("6. Emitir Resultado do Exame"); //funcionado
            System.out.println("7. Listar Pacientes"); //funcionando
            System.out.println("8. Buscar Paciente por CPF");//funcionado
            System.out.println("9. Listar Médicos"); //funcionado
            System.out.println("10. Sair");
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

                    System.out.println("\n\n==== AGENDAR CONSULTA ==== ");
                    System.out.print("Digite o CPF do paciente: ");
                    String cpfConsulta = leitor.nextLine();
                    String pacienteConsultaString = ArquivoPaciente.buscarPacientePorCpf(cpfConsulta);
                    Paciente pacienteConsulta = Paciente.fromString(pacienteConsultaString);

                    if (pacienteConsulta != null) {

                        System.out.println("Paciente encontrado: " + pacienteConsulta.getNome());
                        System.out.println("Selecione o médico para a consulta:");
                        MedicoController.listarMedicos();
                        System.out.print("Escolha o número do médico: ");
                        int numMedicoConsulta = Integer.parseInt(leitor.nextLine());
                        Medico medicoConsulta = MedicoController.medicos.get(numMedicoConsulta - 1);

                        System.out.println("Selecione o dia para a consulta:");
                        List<String> diasDisponiveis = Arrays.asList("01/07/2024", "02/07/2024", "03/07/2024",
                                "04/07/2024", "05/07/2024");

                        for (int i = 0; i < diasDisponiveis.size(); i++) {
                            System.out.println((i + 1) + ". " + diasDisponiveis.get(i));
                        }

                        System.out.print("Escolha o número do dia: ");
                        int diaEscolhido = Integer.parseInt(leitor.nextLine());
                        String dataAgendamento = diasDisponiveis.get(diaEscolhido - 1);

                        System.out.print("Digite o horário da consulta (HH:MM): ");
                        String horarioAgendamento = leitor.nextLine();

                        Agendamento agendamento = new Agendamento();
                        agendamento.setDataAgendamento(dataAgendamento);
                        agendamento.setHorarioAgendamento(horarioAgendamento);
                        agendamento.setPaciente(pacienteConsulta);
                        agendamento.setMedico(medicoConsulta);

                        agendamentos.add(agendamento);

                        System.out.println("---> Consulta agendada com sucesso para " + dataAgendamento + " às "
                                + horarioAgendamento);
                    } else {
                        System.out.println("Paciente não encontrado.");
                    }

                    break;

                case 3:

                    System.out.println("\n\n==== CONSULTAS AGENDADAS ==== ");
                    for (int i = 0; i < agendamentos.size(); i++) {
                        Agendamento agendamento = agendamentos.get(i);
                        System.out.println((i + 1) + ". " + agendamento.getDataAgendamento() + " "
                                + agendamento.getHorarioAgendamento() + " - " + agendamento.getPaciente().getNome());
                    }

                    System.out.print("Escolha o número da consulta que deseja realizar: ");
                    int consultaEscolhida = Integer.parseInt(leitor.nextLine());
                    Agendamento agendamento = agendamentos.get(consultaEscolhida - 1);

                    Consulta consulta = new Consulta();
                    consulta.setMedico(agendamento.getMedico());
                    consulta.setPaciente(agendamento.getPaciente());

                                       
                    agendamentos.remove(consultaEscolhida - 1);

                    System.out.println("\n\n==== PAGAMENTO ==== ");
                    System.out.print("Digite o valor da consulta: ");
                    double valorConsulta = Double.parseDouble(leitor.nextLine());
                    System.out.println("Escolha o método de pagamento:");
                    System.out.println("1. Cartão de Crédito");
                    System.out.println("2. Dinheiro");
                    System.out.println("3. PIX");
                    System.out.print("Escolha uma opção: ");
                    int opcaoPagamento = Integer.parseInt(leitor.nextLine());

                    Pagamento pagamento = null;

                    switch (opcaoPagamento) {
                        case 1:
                            PagamentoCartao pagamentoCartao = new PagamentoCartao();
                            System.out.print("Número do Cartão: ");
                            pagamentoCartao.setNumeroCartao(leitor.nextLine());
                            System.out.print("Nome do Titular: ");
                            pagamentoCartao.setNomeTitular(leitor.nextLine());
                            System.out.print("Data de Validade (MM/AA): ");
                            pagamentoCartao.setDataValidade(leitor.nextLine());
                            pagamento = pagamentoCartao;
                            break;
                        case 2:
                            System.out.print("Quantia Recebida: ");
                            double quantiaRecebida = Double.parseDouble(leitor.nextLine());
                            pagamento = new PagamentoDinheiro(quantiaRecebida);
                            break;
                        case 3:
                            PagamentoPix pagamentoPix = new PagamentoPix();
                            System.out.print("Chave PIX: ");
                            pagamentoPix.setChavePix(leitor.nextLine());
                            pagamento = pagamentoPix;
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            return;
                    }

                    pagamento.realizarPagamento(valorConsulta, consulta.getPaciente().getNome(),consulta.getDataConsulta());
                    pagamento.emitirRecibo(valorConsulta, consulta.getPaciente().getNome(), consulta.getDataConsulta());

                    break;

                case 4:
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
                                Paciente.fromString(pacienteEncontrado));
                        receita.imprimirReceita();

                    } else {
                        System.out.println("Paciente não encontrado.");
                    }

                    break;

                case 5:
                    Exames.agendarExame(leitor);
                    break;
                case 6:

                    Exames.emitirResultadoExame(leitor);
                    break;
                case 7:

                    System.out.println("\n\n==== LISTA DE PACIENTES ==== ");
                    ArquivoPaciente.listarPacientes();

                    List<String> pacientes = ArquivoPaciente.listarPacientes();
                    for (String pacienteTemp : pacientes) {
                        System.out.println(pacienteTemp);
                    }

                    break;
                case 8:

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
                case 9:

                    System.out.println("\n\n==== LISTA DE MEDICOS ==== ");
                    MedicoController.listarMedicos();
                    break;

                case 10:

                    System.out.println("====> Saindo <====");
                    break;
                default:

                    System.out.println("Opção inválida.");
                    break;
            }

        } while (op != 10);

        leitor.close();
    }
}

