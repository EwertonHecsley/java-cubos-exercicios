package com.cubos.exercicios.exercicio_04;

import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        double capital,taxaFixa,periodo;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Digite o capital:");
            capital = s.nextDouble();

            System.out.println("Digite a taxa fixa:");
            taxaFixa = s.nextDouble();

            System.out.println("Digite o periodo:");
            periodo = s.nextDouble();

            double montante = capital * Math.pow(1 + taxaFixa, periodo);

            System.out.println(Math.round(montante));
        }

        
    }
}
