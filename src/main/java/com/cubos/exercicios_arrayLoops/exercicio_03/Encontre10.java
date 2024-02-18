package com.cubos.exercicios_arrayLoops.exercicio_03;

import java.util.List;

public class Encontre10 {
    public static void main(String[] args) {
        Integer[] numeros = {54, 22, 14, 87, 284,10};
        List<Integer> lista = List.of(numeros);

        int index = lista.indexOf(10);

        System.out.println(index);        
    }
}
