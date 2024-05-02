import Classes.Medico;
import Classes.Paciente;
import Negocios.ServicoMedico;
import Negocios.ServicoPaciente;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static ServicoMedico servicoMedico = new ServicoMedico();
    private static ServicoPaciente servicoPaciente = new ServicoPaciente();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sair = false;
        while (!sair) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar médico");
            System.out.println("2 - Adicionar paciente");
            System.out.println("3 - Listar médicos");
            System.out.println("4 - Listar pacientes");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    adicionarMedico();
                    break;
                case 2:
                    adicionarPaciente();
                    break;
                case 3:

                
                    listarMedicos();
                    break;
                case 4:
                    listarPacientes();
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void adicionarMedico() {
        try {
            System.out.println("Adicionar novo médico:");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer
            System.out.print("Especialidade: ");
            String especialidade = scanner.nextLine();

            Medico medico = new Medico(nome, idade, especialidade);
            servicoMedico.adicionarMedico(medico);
            System.out.println("Médico adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar médico: " + e.getMessage());
        }
    }


    private static void adicionarPaciente() {
        try {
            System.out.println("Adicionar novo paciente:");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer
            System.out.print("Diagnóstico: ");
            String diagnostico = scanner.nextLine();

            Paciente paciente = new Paciente(nome, idade, diagnostico);
            servicoPaciente.adicionarPaciente(paciente);
            System.out.println("Paciente adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar paciente: " + e.getMessage());
        }
    }

    private static void listarMedicos() {
        try {
            System.out.println("=== Lista de Médicos ===");
            List<Medico> medicos = servicoMedico.listarMedicos();
            if (medicos.isEmpty()) {
                System.out.println("Nenhum médico cadastrado.");
            } else {
                for (Medico medico : medicos) {
                    System.out.println("Nome: " + medico.getNome() + ", Idade: " + medico.getIdade() + ", Especialidade: " + medico.getEspecialidade());
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar médicos: " + e.getMessage());
        }
    }
    

    private static void listarPacientes() {
        try {
            System.out.println("=== Lista de Pacientes ===");
            List<Paciente> pacientes = servicoPaciente.listarPacientes();
            if (pacientes.isEmpty()) {
                System.out.println("Nenhum paciente cadastrado.");
            } else {
                for (Paciente paciente : pacientes) {
                    System.out.println("Nome: " + paciente.getNome() + ", Idade: " + paciente.getIdade() + ", Diagnóstico: " + paciente.getDiagnostico());
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar pacientes: " + e.getMessage());
        }
    }
}
