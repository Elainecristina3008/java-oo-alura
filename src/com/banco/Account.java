package com.banco;

import com.bytebank.Conta;

public class Account {
    private int agencia;
    private int numero;
    private double saldo;
    Client titular;

    public int getAgencia(){
        return agencia;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    /*public void setSaldo (double saldo){
        this.saldo = saldo;
    }*/

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
