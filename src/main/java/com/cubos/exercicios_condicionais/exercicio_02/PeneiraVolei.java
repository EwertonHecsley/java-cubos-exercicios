package com.cubos.exercicios_condicionais.exercicio_02;

import java.util.Scanner;

public class PeneiraVolei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resultado;

        System.out.println("Digite sua altura em centimetros:");
        double altura = scanner.nextDouble();

        if(altura < 180){
            resultado = "Reprovado";
        }else if(altura >= 180 && altura <=185){
            resultado = "Libero";
        }else if(altura >= 186 && altura <= 195){
            resultado = "Ponteiro";
        }else if(altura >= 196 && altura <= 205){
            resultado = "Oposto";
        }else{
            resultado = "Central";
        }

        scanner.close();

        System.out.println(resultado);
    }
}
