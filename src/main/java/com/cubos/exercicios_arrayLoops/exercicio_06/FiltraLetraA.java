package com.cubos.exercicios_arrayLoops.exercicio_06;

import java.util.ArrayList;
import java.util.List;

public class FiltraLetraA {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Joana", "Carlos", "amanda"};
        List<String> resultado = new ArrayList<String>();

        for(String nome : nomes){
            if(nome.startsWith("a") || nome.startsWith("A")){
                resultado.add(nome);
            }
        }

        System.out.println(resultado);
    }
}
