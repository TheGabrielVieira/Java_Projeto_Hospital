package Negocios;

import Classes.Paciente;
import Repositorios.RepositorioPaciente;
import java.util.List;

public class ServicoPaciente {
    private RepositorioPaciente repositorioPaciente = new RepositorioPaciente();

    public void adicionarPaciente(Paciente paciente) throws Exception{
        if (paciente == null){
            throw new IllegalArgumentException("Paciente não pode ser nulo.");
        }

        try {

            if(repositorioPaciente.getListaPacientes().contains(paciente)){
                throw new Exception("Paciente já existe no sistema.");
            }

            repositorioPaciente.adicionarPaciente(paciente);
            
        } catch (Exception ex) {
            throw new Exception("Erro ao adicionar paciente: " + ex.getMessage());
        }
    }

    public List<Paciente> listarPacientes() throws Exception {

        try {
            return repositorioPaciente.getListaPacientes();
        } catch (Exception ex) {
            throw new Exception("Erro ao listar pacientes:" + ex.getMessage());
        }
    }
}
