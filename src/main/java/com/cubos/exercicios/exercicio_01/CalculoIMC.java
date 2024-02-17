package com.cubos.exercicios.exercicio_01;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        double altura,peso,imc;

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Digite sua altura:");
            altura = s.nextDouble();

            System.out.println("Digite seu peso:");
            peso = s.nextDouble();
        }

        imc = peso / (Math.pow(altura, 2));

        String imcFormatado = String.format("%.1f",imc);

        System.out.println("Seu IMC é: " + imcFormatado);

    }
}
