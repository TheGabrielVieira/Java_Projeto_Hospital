//Arquivo classe RepositorioMedico
package Repositorios;

import java.util.ArrayList;
import java.util.List;
import Classes.Medico;

public class RepositorioMedico {
    private List<Medico> listaMedicos = new ArrayList<Medico>();

    public void adicionarMedico(Medico medico) {
        listaMedicos.add(medico);
    }

    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }
}
