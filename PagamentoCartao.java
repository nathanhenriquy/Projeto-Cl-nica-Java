public class PagamentoCartao implements Pagamento {

    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public void realizarPagamento(double valor, String nomePaciente, String dataConsulta) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
    }

    @Override
    public void emitirRecibo(double valor, String nomePaciente, String dataConsulta) {
        System.out.println("\n\n==== RECIBO ====");
        System.out.println("Nome do Paciente: " + nomePaciente);
        System.out.println("Data da Consulta: " + dataConsulta);
        System.out.println("Valor: R$" + valor);
        System.out.println("Método de Pagamento: Cartão de Crédito");
    }
}
