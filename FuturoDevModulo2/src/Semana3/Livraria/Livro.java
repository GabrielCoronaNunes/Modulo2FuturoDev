package Semana3.Livraria;

public class Livro {
    protected String nome;
    protected String descricao;
    protected Autor autor;
    protected Double valor = 0.0;
    protected String codigoISBN;
    protected Double desconto;

    public Livro(String nome, String descricao, Autor autor, String codigoISBN, Double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.autor = autor;
        this.codigoISBN = codigoISBN;
        this.valor = valor;
    }

    public Livro() {

    }

    @Override
    public String toString() {
        return this.nome + ", Descrição: " + this.descricao + ". Autor: " + this.autor.getNome() + ", Código" +
                " ISBN: " + this.codigoISBN + ", valor: " + this.valor + ".";
    }

    public void aplicarDesconto() {
        valor -= desconto;

    }
}
