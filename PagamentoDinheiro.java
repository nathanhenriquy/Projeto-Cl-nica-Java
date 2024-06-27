public class PagamentoDinheiro implements Pagamento {
    
    private double quantiaRecebida;

    public PagamentoDinheiro(double quantiaRecebida) {
        this.quantiaRecebida = quantiaRecebida;
    }

    public double getQuantiaRecebida() {
        return quantiaRecebida;
    }

    public void setQuantiaRecebida(double quantiaRecebida) {
        this.quantiaRecebida = quantiaRecebida;
    }

    @Override
    public void realizarPagamento(double valor, String nomePaciente, String dataConsulta) {
        System.out.println("Pagamento de R$" + valor + " realizado em dinheiro.");
    }

    @Override
    public void emitirRecibo(double valor, String nomePaciente, String dataConsulta) {
        System.out.println("\n\n==== RECIBO ====");
        System.out.println("Nome do Paciente: " + nomePaciente);
        System.out.println("Data da Consulta: " + dataConsulta);
        System.out.println("Valor: R$" + valor);
        System.out.println("Método de Pagamento: Dinheiro");
    }

}
