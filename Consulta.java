    import java.util.Random;
    import java.util.Scanner;

    public class Consulta {
        
        private double valor;
        private String dataConsulta;
        private Medico medico;
        private Paciente paciente;

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public String getDataConsulta() {
            return dataConsulta;
        }

        public void setDataConsulta(String dataConsulta) {
            this.dataConsulta = dataConsulta;
        }

        public Medico getMedico() {
            return medico;
        }

        public void setMedico(Medico medico) {
            this.medico = medico;
        }

        public Paciente getPaciente() {
            return paciente;
        }

        public void setPaciente(Paciente paciente) {
            this.paciente = paciente;
        }

        public boolean realizarConsulta() { // apesar do metodo, retorna se o exame será marcado
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
        
            System.out.println("Paciente em consulta, aguarde o resultado...");

            int tempoConsulta = 5000;

            try {
                Thread.sleep(tempoConsulta);
            } catch (InterruptedException e) {
                System.err.println("Consulta foi interrompida: " + e.getMessage());
            }

            int temp = random.nextInt();

            if(temp > 0) {
                System.out.println("Sua saúde está perfeita");
            }
            else if(temp < 0) {
                System.out.println("Você está com um problema de saúde, deseja marcar um exame?\nDigite S para Sim e N para Não");
                String op = scanner.nextLine();

                if (op.equals("S") || op.equals("s")) {
                    scanner.close();
                    return true;
                }
                else if (op.equals("N") || op.equals("n")) {
                    scanner.close();
                    return false;
                }
            }

            scanner.close();
            return false;
        }
    }