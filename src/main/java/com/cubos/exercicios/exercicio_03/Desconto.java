package com.cubos.exercicios.exercicio_03;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        double valorDesconto,valorProduto,meudinheiro,descontoPercentual;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Digite o valor do produto:");
            valorProduto = s.nextDouble();

            System.out.println("Digite o valor do seu dinheiro:");
            meudinheiro = s.nextDouble();
        }

        valorDesconto = valorProduto - meudinheiro;

        descontoPercentual =(valorDesconto / valorProduto) * 100;

        String result = String.format("%.2f", descontoPercentual);

        System.out.println("O desconto total em % é: " + result);
    }
}
