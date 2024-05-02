//Arquivo classe RepositorioPaciente
package Repositorios;

import Classes.Paciente;
import java.util.ArrayList;
import java.util.List;

public class RepositorioPaciente {
    private List<Paciente> listaPacientes = new ArrayList<Paciente>();

    public void adicionarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }
}
