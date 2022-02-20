package com.banco;

public class TestBank {

    public static void main(String[] args) {
        Client elaineCruz = new Client();
        elaineCruz.name = "Elaine Cruz";
        elaineCruz.cpf = "123.456.789-10";
        elaineCruz.work = "Analista de Sistemas";

        Account contaElaine = new Account();
        contaElaine.agencia = 1425;
        contaElaine.numero = 1073338;
        contaElaine.saldo = 300.00;

        contaElaine.deposita(1500.75);
        System.out.println("Novo saldo da conta é: " + contaElaine.saldo);

        //essa linha representa composição de Objetos.
        System.out.println(contaElaine.titular.name);

    }
}
