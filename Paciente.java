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

    public Paciente(String nome, String cpf, String dataNascimento, Endereco endereco) {
        super(nome, cpf, dataNascimento);
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

    @Override
    public String toString() {
        return getNome() + "," + getCpf() + "," + getDataNascimento() + "," + endereco.toString();
    }

    public static Paciente fromString(String linha) {
        String[] campos = linha.split(",");
        String nome = campos[0];
        String cpf = campos[1];
        String dataNascimento = campos[2];
        Endereco endereco = Endereco.fromString(campos[3], campos[4], campos[5], campos[6], campos[7]);
        return new Paciente(nome, cpf, dataNascimento, endereco);
    }
    
}
