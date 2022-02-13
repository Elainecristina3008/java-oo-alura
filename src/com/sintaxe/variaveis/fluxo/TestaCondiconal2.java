package com.sintaxe.variaveis.fluxo;

public class TestaCondiconal2 {
    public static void main(String[] args) {
        System.out.println("Testando consicionais");
        int idade = 19;
        int numeroAcompanhantes = 2;
        boolean acompanhado = numeroAcompanhantes >=2;

        /*if(idade>=18 || numeroAcompanhantes >=2){
            System.out.println("Sua entrada é permitida");
            System.out.println("Seja bem vindo");
        }else{
            System.out.println("Infelizmente sua entrada não é permitida");
        }*/
        if(idade >=18 && acompanhado){
            System.out.println("Sua entrada é permitida");
            System.out.println("Seja bem vindo");
        }else{
            System.out.println("Infelizmente sua entrada não é permitida");
        }
    }
}
