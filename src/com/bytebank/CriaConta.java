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

        //Dando um espaçoi entre uma conta e outra.
        System.out.println(" ");
        System.out.println("****************************************************************");
        System.out.println(" ");




        Conta conta2 = new Conta();
        conta2.titular = "Elaine Cristina";
        conta2.agencia = 2514;
        conta2.numero = 8333701;
        conta2.saldo = 15512.12;

        System.out.println(conta2.titular);
        System.out.println(conta2.agencia);
        System.out.println(conta2.numero);
        System.out.println(conta2.saldo);

    }
}
