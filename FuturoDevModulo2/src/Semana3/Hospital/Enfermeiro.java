package Semana3.Hospital;

public class Enfermeiro extends Funcionario{
    private String numeroCoren;

    public Enfermeiro(String dataAdmissao, String comportamentoAoBaterPonto, String numeroCoren, String nome) {
        super.dataAdmissao = dataAdmissao;
        super.comportamentoAoBaterPonto = comportamentoAoBaterPonto;
        this.numeroCoren = numeroCoren;
        super.nome = nome;
    }

    public void auxiliarMedico(Medico medico) {
        System.out.println("Médico " + medico.getNome() + " devidamente auxiliado.");

    }

    ;

    public void tratarPaciente(Paciente paciente) {
        System.out.println("Paciente " + paciente.getNome() + " devidamente tratado.");
    }

    ;

}
