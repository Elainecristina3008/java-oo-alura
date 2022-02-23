package com.banco;

public class TestaValores {

    public static void main(String[] args) {

        Account conta = new Account(3431, 1073338);


        //Dados inconsistentes
        //conta.setAgencia(-5200);
        //conta.setNumero(-107333);

        System.out.println(conta.getAgencia());

    }
}
