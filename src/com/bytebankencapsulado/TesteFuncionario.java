package com.bytebankencapsulado;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario elaine = new Gerente();

        elaine.setNome("Elaine Cruz");
        elaine.setCpf("111222333-4");
        elaine.setSalario(3600.00);

        System.out.println(elaine.getNome());
        System.out.println(elaine.getBonificacao());
    }
}
