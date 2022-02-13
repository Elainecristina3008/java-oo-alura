package com.sintaxe.variaveis.fluxo;

public class TestaCondicional {
    public static void main(String[] args) {

        System.out.println("Testando consicionais");
        int idade = 14;
        int numeroAcompanhantes = 1;

        if(idade>=18){
            System.out.println("você tem mais de 18 anos");
            System.out.println("Seja bem vindo");
        }else{
            if(numeroAcompanhantes >=2){
                System.out.println("Sua entrada é permitida apesar de ser menor de idade, por estar acompanhado");
            }else{
                System.out.println("Infelizmente a sua entrada não é permitida");
            }
        }
    }
}
