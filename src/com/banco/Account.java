package com.banco;

import com.bytebank.Conta;

public class Account {
    int agencia;
    int numero;
    double saldo;
    Client titular;

    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }

    }

    public boolean transferir(double valor, Conta destino){
        if (this.saldo >= valor){
            this.sacar(valor);
            destino.deposita(valor);
            return true;
        }else {
            return false;
        }
    }
}
