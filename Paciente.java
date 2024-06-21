public class Paciente extends Pessoa{

    private String nomePlano;
    private String numeroCarteiraPlano;
    private Endereco endereco;
    
    public Paciente(String nome, String cpf, String dataNascimento,String nomePlano, String numeroCarteiraPlano, Endereco endereco) {
        super(nome, cpf, dataNascimento);
       this.nomePlano = nomePlano;
       this.numeroCarteiraPlano = numeroCarteiraPlano;
       this.endereco = endereco;

    }
  
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }    
    
    public String getNomePlano() {
        return nomePlano;
    }
    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }
    public String getNumeroCarteiraPlano() {
        return numeroCarteiraPlano;
    }
    public void setNumeroCarteiraPlano(String numeroCarteiraPlano) {
        this.numeroCarteiraPlano = numeroCarteiraPlano;
    }

    
}
