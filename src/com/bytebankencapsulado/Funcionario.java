package com.bytebankencapsulado;

public  abstract class Funcionario { // Classes abstratas não podem ser instanciadas, as classes filhas() que herdam os métodos e atributos que devem ser instanciadas

    private String nome;
    private String cpf;
    private double salario; //protected - publico para os filhos - privado para os demais.


    // o atributo get pode ser feito mesmo sem o atributo.
    //Médodo abstrato não tem corpo, a implementação só é possível nas classes filhas.
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
