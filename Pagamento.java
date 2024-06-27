public interface Pagamento {
    void realizarPagamento(double valor, String nomePaciente, String dataConsulta);
    void emitirRecibo(double valor, String nomePaciente, String dataConsulta);

}