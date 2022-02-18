package com.bytebank;

public class CriaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.titular = "Elaine Cruz";
        conta1.agencia = 1425;
        conta1.numero = 1073338;
        conta1.saldo = 5512.12;

        System.out.println(conta1.titular);
        System.out.println(conta1.agencia);
        System.out.println(conta1.numero);
        System.out.println(conta1.saldo);

    }
}
