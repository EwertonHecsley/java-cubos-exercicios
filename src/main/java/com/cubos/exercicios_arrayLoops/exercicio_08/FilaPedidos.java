package com.cubos.exercicios_arrayLoops.exercicio_08;

import java.util.LinkedList;

public class FilaPedidos {
    public static void main(String[] args) {
        LinkedList<String> filaPedidos = new LinkedList<String>();  

        filaPedidos.add("pedido 12");
        filaPedidos.add("pedido 13");
        filaPedidos.add("pedido 14");


        filaPedidos.add("pedido 15");

        filaPedidos.removeFirst();

        System.out.println(filaPedidos);
    }
}
