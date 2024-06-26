import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArquivoPaciente {
    private static final String FILE_NAME = "pacientes.txt";
    Scanner leitor = new Scanner(System.in);

    public static void salvarPaciente(Paciente paciente) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(paciente.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Paciente buscarPacientePorCpf(String cpf) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Paciente paciente = Paciente.fromString(line);
                if (paciente.getCpf().equals(cpf)) {
                    return paciente;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
