public class PagamentoPix implements Pagamento {

    private String chavePix;

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void realizarPagamento(double valor, String nomePaciente, String dataConsulta) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
    }

    @Override
    public void emitirRecibo(double valor, String nomePaciente, String dataConsulta) {
        System.out.println("\n\n==== RECIBO ====");
        System.out.println("Nome do Paciente: " + nomePaciente);
        System.out.println("Data da Consulta: " + dataConsulta);
        System.out.println("Valor: R$" + valor);
        System.out.println("Método de Pagamento: PIX");
    }
}