package Semana3.Hospital;

public class Financeiro  extends Funcionario{
    public Financeiro(String dataAdmissao, String comportamentoAoBaterPonto) {
        super.dataAdmissao = dataAdmissao;
        super.comportamentoAoBaterPonto = comportamentoAoBaterPonto;
    }

    ;

    public void pagarSalario(Funcionario funcionario) {
        System.out.println("Funcionário " + funcionario.getNome() + " devidamente pago.");
    }

    ;
}
