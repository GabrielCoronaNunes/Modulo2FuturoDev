package Semana3.Hospital;

public class Medico extends Funcionario{
    private String numeroCRM;


    public Medico(String dataAdmissao, String comportamentoAoBaterPonto, String numeroCRM, String nome) {
        super.dataAdmissao = dataAdmissao;
        super.comportamentoAoBaterPonto = comportamentoAoBaterPonto;
        this.numeroCRM = numeroCRM;
        super.nome = nome;
    }

    public void realizarConsultas(Paciente paciente) {
        System.out.println("Paciente " + paciente.getNome() + " devidamente tratado.");
    }

    ;

    public void receitarTratamentos(Paciente paciente) {
        System.out.println("Paciente " + paciente.getNome() + " devidamente remedicado.");
    }

    ;

    public void operarPaciente(Paciente paciente) {
        System.out.println("Paciente " + paciente.getNome() + " devidamente operado.");
    }

}
