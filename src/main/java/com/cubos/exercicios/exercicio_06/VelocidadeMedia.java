package com.cubos.exercicios.exercicio_06;

public class VelocidadeMedia {
    public static void main(String[] args) {
        int distPercorrida = 500;
        int tempo = 10;

        double velocidadeMedia = distPercorrida/tempo;
        double velocidadeKm = velocidadeMedia * 3.6;

        System.out.println(Math.round(velocidadeKm));
    }
}
