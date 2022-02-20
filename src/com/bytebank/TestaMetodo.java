package com.bytebank;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDaElaine = new Conta();
        contaDaElaine.saldo = 200.00;
        contaDaElaine.deposita(150.00);
        System.out.println("O saldo atual é " + contaDaElaine.saldo);
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------------------------------------");
        System.out.println();
        System.out.println();

        boolean conseguiuRetirar = contaDaElaine.sacar(20.50);
        System.out.println(contaDaElaine.saldo);
        System.out.println(conseguiuRetirar);


        Conta contaDoDiego = new Conta();
        contaDoDiego.saldo = 500.75;
       // contaDoDiego.transferir(250, contaDaElaine);
        boolean conseguiuTransferir = contaDoDiego.transferir(250, contaDaElaine);
        System.out.println("Novo saldo da conta da Elaine " + contaDaElaine.saldo);
        System.out.println("Novo saldo da conta do Diego " + contaDoDiego.saldo);
        System.out.println("Transferência realizada?: " + conseguiuTransferir);

    }
}
