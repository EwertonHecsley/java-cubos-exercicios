package com.cubos.exercicios.exercicio_05;

import java.util.Scanner;

public class CalcularDistancia {
    //Calcular a distancia entre dois pontos

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Digite o valor da distancia x1");
            int x1 = s.nextInt();

            System.out.println("Digite o valor da distanca x2");
            int x2 = s.nextInt();

            System.out.println("Digite o valor da distancia y1");
            int y1 = s.nextInt();

            System.out.println("Digite o valor da distancia y2");
            int y2 = s.nextInt();

            double distancia = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));

            System.out.println(Math.round(distancia));
        }
    }
}
