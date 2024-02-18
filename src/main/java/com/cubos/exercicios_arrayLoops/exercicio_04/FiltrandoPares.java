package com.cubos.exercicios_arrayLoops.exercicio_04;

import java.util.ArrayList;
import java.util.List;

public class FiltrandoPares {
    public static void main(String[] args) {
        Integer[] numeros = {1,2,3,4,5,6,10,11,15,25,32,41,53,60};
        List<Integer> resultado = new ArrayList();
        
        for(int i : numeros){
            if(i % 2 == 0){
                resultado.add(i);
            }
        }

        System.out.println(resultado);
    }
}
