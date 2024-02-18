package com.cubos.exercicios_arrayLoops.exercicio_05;

public class SomaPares {
    public static void main(String[] args) {
        Integer[] numeros = {3, 4, 7, 8, 1, 6, 5, 10};
        int resultado = 0;

        for(int i : numeros){
            if(i % 2 == 0){
                resultado += i;
            }
        }
        System.out.println(resultado);
    }
}
