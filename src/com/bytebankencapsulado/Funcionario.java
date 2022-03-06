package com.bytebankencapsulado;

public  abstract class Funcionario { // Classes abstratas não podem ser instanciadas, as classes filhas(Classes concretas) que herdam os métodos e atributos que devem ser instanciadas

    private String nome;
    private String cpf;
    private double salario; //protected - publico para os filhos - privado para os demais.


    // o atributo get pode ser feito mesmo sem o atributo.
    public double getBonificacao(){
        return this.salario * 0.1;
    }

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
