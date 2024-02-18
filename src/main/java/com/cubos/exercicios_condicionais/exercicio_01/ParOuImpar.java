package com.cubos.exercicios_condicionais.exercicio_01;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor jogador 1:");
        int jogador1 = scanner.nextInt();

        System.out.println("Valor jogador 2:");
        int jogador2 = scanner.nextInt();

        int resultado = jogador1 + jogador2;

        if(resultado % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }

        scanner.close();
    }
}
