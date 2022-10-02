package Semana2;

public class Pessoa {


    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(){
        this.nome = "";
        this.idade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void envelhecer() {
        ++idade;
    }


    public void print(){
        System.out.println("A idade dessa pessoa é: " + this.idade + ". O nome dessa pessoa é: " + this.nome);
    }

    public void clonar(){
        Pessoa clone = new Pessoa(this.nome, this.idade);
        System.out.println("A idade dessa pessoa é: " + clone.getIdade() + ". O nome dessa pessoa é: " + clone.getNome());
    }
}
