package Semana3.Hospital;

public class Paciente {
    private String dataInternacao;
    private String comportamentoConsumoRemedio;
    private String nome;

    public Paciente(String dataInternacao, String comportamentoConsumoRemedio, String nome) {
        this.dataInternacao = dataInternacao;
        this.comportamentoConsumoRemedio = comportamentoConsumoRemedio;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
