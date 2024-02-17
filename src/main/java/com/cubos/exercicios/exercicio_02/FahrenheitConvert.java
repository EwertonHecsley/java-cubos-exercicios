package com.cubos.exercicios.exercicio_02;

import java.util.Scanner;

public class FahrenheitConvert {
    public static void main(String[] args) {
        double celsius;

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Digite a temperatura em graus Fahrenheit:");
            double fahrenheit = s.nextDouble();

            celsius = Math.round((fahrenheit - 32) * 5/9);
        }

        System.out.println("A temperatura em Celsius é: " + celsius);
    }
}