package com.cubos.exercicios_arrayLoops.exercicio_02;

public class ContandoLetras {
    public static void main(String[] args) {
        String[] letras = {"A", "a", "B", "E", "L", "e"};
        int contador = 0;

        for(String index : letras){
            if(index == "e" || index == "E"){
                contador += 1;
            }
        }

        if(contador == 0){
            System.out.println("Não foi encontrado nenhuma letra 'e' ou 'E'");
        }else{
            System.out.println("Forão encontrados " + contador + " letra(as) 'e' ou 'E'");   
        }
    }
}
