import java.util.ArrayList;

public class MedicoController {

    public static ArrayList<Medico> medicos = new ArrayList<>();

    public static void pre_colocados() {
        medicos.add(new Medico("Dr. Gilmar", "11111111111", "24/04/1995", "CRM001", "Dentista"));
        medicos.add(new Medico("Dr. Juliana", "22222222222", "45/02/1995", "CRM002", "Dermatologia"));
        medicos.add(new Medico("Dr. Joao", "33333333333", "23/12/1995", "CRM003", "Neurologia"));
        medicos.add(new Medico("Dr. Ricardo", "44444444444", "31/09/1995", "CRM004", "Ortopedia"));
        medicos.add(new Medico("Dr. Kauan", "55555555555", "05/01/1995", "CRM005", "Pediatria"));
    }

    
    public static void listarMedicos() {
       if (medicos.isEmpty()) {
            System.out.println("Não há médicos cadastrados.");
        } else {
            for (int i = 0; i < medicos.size(); i++) {
                Medico medico = medicos.get(i);
                System.out.println("Medico: " + (i + 1));
                System.out.println("Nome: " + medico.getNome());
                System.out.println("CPF: " + medico.getCpf());
                System.out.println("Data de Nascimento: " + medico.getDataNascimento());
                System.out.println("CRM: " + medico.getCrm());
                System.out.println("Especialidade: " + medico.getEspecialidade());
                System.out.println("\n");
            }
        }
    }
}