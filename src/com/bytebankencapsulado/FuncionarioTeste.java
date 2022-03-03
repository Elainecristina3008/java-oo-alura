package com.bytebankencapsulado;

public class FuncionarioTeste {

    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0; //0-funcionaro comum, 1- Gerente, 2 - Diretor


    // o atributo get pode ser feito mesmo sem o atributo.


    public double getBonificacao(){
        if(tipo == 0){ // Funcionário comum.
            return this.salario * 0.1;
        }else if(tipo == 1){ // Gerente
            return this.salario * 0.5;
        }else{ // Diretor
            return this.salario + 2000.00;
        }
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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
