package com.cubos.exercicios_arrayLoops.exercicio_09;

public class Pensador {
    public static void main(String[] args) {
        int[] numeros = {8,20, 11, 4, 10};
        int maiorDiferenca = 0;

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length; j++){
                int diferenca = numeros[i]-numeros[j];
                if(diferenca > maiorDiferenca){
                    maiorDiferenca = diferenca;
                }
            }
        }

        System.out.println("Maior diferença é: " + maiorDiferenca);
    }
}
