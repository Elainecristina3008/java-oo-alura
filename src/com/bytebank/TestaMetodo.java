package com.bytebank;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDaElaine = new Conta();
        contaDaElaine.saldo = 200.00;
        contaDaElaine.deposita(150.00);
        System.out.println("O saldo atual é " + contaDaElaine.saldo);

    }
}
