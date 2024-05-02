package Negocios;

import Classes.Medico;
import Repositorios.RepositorioMedico;
import java.util.List;

public class ServicoMedico {
    private RepositorioMedico repositorioMedico = new RepositorioMedico();

    public void adicionarMedico(Medico medico) throws Exception {
        if (medico == null) {
            throw new IllegalArgumentException("Médico não pode ser nulo.");
        }

        try {
            // Validar se o médico já existe no repositório
            if (repositorioMedico.getListaMedicos().contains(medico)) {
                throw new Exception("Médico já existe no sistema.");
            }
            
            // Adicionar o médico ao repositório
            repositorioMedico.adicionarMedico(medico);
        } catch (Exception ex) {
            // Tratar exceção específica do repositório ou lançar uma exceção personalizada.
            throw new Exception("Erro ao adicionar médico: " + ex.getMessage());
        }
    }

    public List<Medico> listarMedicos() throws Exception {
        try {
            return repositorioMedico.getListaMedicos();
        } catch (Exception ex) {
            // Tratar exceção específica do repositório ou lançar uma exceção personalizada.
            throw new Exception("Erro ao listar médicos: " + ex.getMessage());
        }
    }
}
