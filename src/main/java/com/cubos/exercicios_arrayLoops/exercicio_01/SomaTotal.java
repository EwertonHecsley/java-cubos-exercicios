package com.cubos.exercicios_arrayLoops.exercicio_01;

public class SomaTotal {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int soma = 0;

        for (int i : numeros) {
            soma += i;
        }
        System.out.println(soma);
    }
}
