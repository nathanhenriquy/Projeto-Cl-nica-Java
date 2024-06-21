public class PagamentoPix implements Pagamento {

    private String chavePix;

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
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