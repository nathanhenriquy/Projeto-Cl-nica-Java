import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArquivoPaciente {
    private static final String FILE_NAME = "pacientes.txt";
    Scanner leitor = new Scanner(System.in);

    public static void salvarPacientes(ArrayList<Paciente> pacientes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(pacientes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Paciente> lerPacientes() {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            pacientes = (ArrayList<Paciente>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Arquivo não encontrado, retornando lista vazia
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return pacientes;
    }

    public static void adicionarPaciente(Paciente paciente) {
        ArrayList<Paciente> pacientes = lerPacientes();
        pacientes.add(paciente);
        salvarPacientes(pacientes);
    }

    public static void listarPacientes() {
        ArrayList<Paciente> pacientes = lerPacientes();
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(pacientes.get(i));
        }
    }

    public static void buscarPacientePorCpf(String cpf) {
        ArrayList<Paciente> pacientes = lerPacientes();
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getCpf().equals(cpf)) {
                System.out.println(pacientes.get(i));
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }
}