package com.cubos.exercicio_funcoes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    public static void main(String[] args) {
        
        Carrinho carrinho = new Carrinho("Ewerton Hecsley");
        carrinho.adicionarProduto(new Produto("Camisa", 3, 3000));
        carrinho.adicionarProduto(new Produto("Bermuda", 2, 5000));

        imprimirResumoDoCarrinho(carrinho);
    }

    public static void imprimirResumoDoCarrinho(Carrinho carrinho) {
        System.out.println("Cliente: " + carrinho.getNomeDoCliente());
        System.out.println("Total de itens: " + carrinho.getTotalDeItens() + " itens");
        System.out.println("Total a pagar: R$ " + carrinho.getTotalAPagar());
    }
}

class Produto {
    private String nome;
    private int quantidade;
    private double precoUnitario;

    public Produto(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}

class Carrinho {
    private String nomeDoCliente;
    private List<Produto> produtos;

    public Carrinho(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
        this.produtos = new ArrayList<>();
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public int getTotalDeItens() {
        return produtos.stream().mapToInt(Produto::getQuantidade).sum();
    }

    public double getTotalAPagar() {
        return produtos.stream().mapToDouble(p -> p.getQuantidade() * p.getPrecoUnitario()).sum() / 100;
    }
}

