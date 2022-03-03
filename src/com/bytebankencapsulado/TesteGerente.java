package com.bytebankencapsulado;

public class TesteGerente {


    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Elaine");
        gerente.setCpf("12345678910");
        gerente.setSalario(7500.00);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getBonificacao());

        gerente.setSenha(1415);
        boolean autenticou = gerente.autentica(1415);
        System.out.println(autenticou);

    }
}
