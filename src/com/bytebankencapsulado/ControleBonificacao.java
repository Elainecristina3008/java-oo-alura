package com.bytebankencapsulado;

public class ControleBonificacao {

    private double soma;


    public void registra(Funcionario f){
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    } // vai funcionar, pois esse exemplo é da classe mais genérica.

    public double getSoma() {
        return soma;
    }
}
