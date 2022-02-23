package com.banco;

import com.bytebank.Conta;

public class TesteSacaNegativo {
    public static void main(String[] args) {
        Account contaTeste = new Account(7367, 24563);
        //contaTeste.deposita(100);
        //contaTeste.sacar(200);

        boolean conseguiuSacar = contaTeste.sacar(200);
        System.out.println(conseguiuSacar);
        System.out.println(contaTeste.getSaldo());

        //contaTeste.saldo -= 101;
        //System.out.println(contaTeste.getSaldo());

        // Por egurança os atributos não devem ser acessados ou manuseados, o ideal é fazer isso através dos métodos
    }
}
