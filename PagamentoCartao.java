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
    public void realizarPagamento() {
        // dps faço
    }

    @Override
    public void emitirRecibo() {
        // dps faço
    }
}