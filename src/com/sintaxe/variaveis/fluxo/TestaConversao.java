package com.sintaxe.variaveis.fluxo;

public class TestaConversao {
    public static void main(String[] args) {
        double salario = 3622.58;
        int valor = (int) salario; // este procedimento é chamado de casting

        System.out.println(valor); // só vai imprimir na tela a parte inteira do valor, desconsiderando o ponto flutuante.
    }
}
