package com.cubos.exercicios_arrayLoops.exercicios_10;

import java.util.ArrayList;
import java.util.List;

public class filtrandoNumeros {
    public static void main(String[] args) {
        Integer[] numeros = {5, 7, 13, 17, 26, 34, 118, 245};
        List<Integer> arrayNumeros = new ArrayList<Integer>();

        for(int index : numeros){
            if(index >= 10 && index <= 20 || index > 100){
                arrayNumeros.add(index);
            }
        }
        System.out.println(arrayNumeros);
    }
}
