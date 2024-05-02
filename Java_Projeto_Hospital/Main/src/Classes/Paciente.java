//Arquivo classe Paciente
package Classes;

public class Paciente extends Pessoa{
     private String diagnostico;

    public Paciente(String nome, int idade, String diagnostico) {
        super(nome, idade);
        this.diagnostico = diagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }     
}
