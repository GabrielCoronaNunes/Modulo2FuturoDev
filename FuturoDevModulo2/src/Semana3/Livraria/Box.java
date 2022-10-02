package Semana3.Livraria;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private String nome;
    private Double desconto;
    private Double valorTotal;

    List<Livro> listaLivros = new ArrayList<>();


    public Box(String nome, Double desconto) {
        this.nome = nome;
        this.desconto = desconto;
        this.valorTotal = 0.0;
    }

    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
        valorTotal += livro.valor;
    }

    public void adicionarLivro(Ebook ebook) {
        listaLivros.add(ebook);
        valorTotal += ebook.valor;
    }

    public void adicionarLivro(Livro... livros) {
        for (Livro livro: livros
        ) {
            listaLivros.add(livro);
            valorTotal += livro.valor;

        }
    }

    public void ajustarDesconto() {
        valorTotal -= desconto;
    }

    public void conferirPreco() {
        System.out.println(valorTotal);
    }

}
