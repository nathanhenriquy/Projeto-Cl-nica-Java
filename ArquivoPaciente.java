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

    public static List<String> listarPacientes() {
        List<String> pacientes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (!linha.trim().isEmpty()) {
                    pacientes.add(linha);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pacientes;
    }

    /* 
    public static void listarPacientes() {
        ArrayList<Paciente> pacientes = lerPacientes();
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(pacientes.get(i));
        }
    }
    */
    public static Paciente buscarPacientePorCpf(String cpf) {
        ArrayList<Paciente> pacientes = lerPacientes();
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getCpf().equals(cpf)) {
                System.out.println(pacientes.get(i));
                return null;
            }
        }
        System.out.println("Paciente não encontrado.");
        return null;
    }


}