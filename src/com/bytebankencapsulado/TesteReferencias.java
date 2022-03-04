package com.bytebankencapsulado;

public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario gerente1 = new Gerente();

        gerente1.setNome("Elaine");
        String nome = gerente1.getNome();

        System.out.println(nome);

        // gerente1.autentica(1551); Não funciona pois o método autentica é exclusivo da classe gerente e não de funcionário.


    }
}
