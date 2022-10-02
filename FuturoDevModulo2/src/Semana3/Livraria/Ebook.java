package Semana3.Livraria;

public class Ebook extends Livro{
    private Double desconto = 0.0;



    public Ebook(String nome, String descricao, Autor autor, String codigoISBN, Double valor, Double desconto) {
        super.nome = nome;
        super.descricao = descricao;
        super.autor = autor;
        super.codigoISBN = codigoISBN;
        super.valor = valor;
        this.desconto = desconto;
    }

    public Ebook() {

    }

    @Override
    public String toString(){
        return super.nome + ", Descrição: " + super.descricao + ". Autor: " + super.autor.getNome() + ", Código" +
                " ISBN: " + super.codigoISBN + ", valor: " + super.valor + ", desconto: " + desconto +
                " preço com desconto: " + (valor - desconto);
    }

}
