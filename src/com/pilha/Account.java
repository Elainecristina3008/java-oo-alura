package com.pilha;

public class Account {
    private int ag;
    private int numero;
    String titular;
    private double saldo;

    public Account(){

    }

    public Account(int ag, int numero, double saldo){
        this.ag = ag;
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getAg() {
        return ag;
    }

    public void setAg(int ag) {
        this.ag = ag;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }


    void deposita()throws MinhaExcecao{

    }
}
