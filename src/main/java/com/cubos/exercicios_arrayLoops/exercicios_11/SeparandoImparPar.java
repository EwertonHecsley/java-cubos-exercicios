package com.cubos.exercicios_arrayLoops.exercicios_11;

import java.util.ArrayList;
import java.util.List;

public class SeparandoImparPar {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> par = new ArrayList<Integer>();
        List<Integer> impar = new ArrayList<Integer>();

        for(int index : numeros) {
            if(index % 2 == 0) {
                par.add(index);
            } else {
                impar.add(index);
            }
        }

        System.out.println(par);
        System.out.println(impar);
    }
}
