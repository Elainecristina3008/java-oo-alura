package com.bytebank;

public class TestaReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 500.00;

        System.out.println("Saldo da primeira conta é: " + primeiraConta.saldo);


        //referência do mesmo objeto
        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println(segundaConta.saldo);
        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("São a mesmíssima conta");
        }else {
            System.out.println("São contas diferentes");
        }
    }
}
