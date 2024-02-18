package com.cubos.exercicios_arrayLoops.exercicio_07;

import java.util.Arrays;
import java.util.Collections;

public class MaiorNumero {
    public static void main(String[] args) {
        Integer[] numeros = {3, 4, 1, 8, 11, 7, 5};
        int maiorNumero;

        Arrays.sort(numeros,Collections.reverseOrder());

        maiorNumero = numeros[0];

        System.out.println(maiorNumero);
    }
}
