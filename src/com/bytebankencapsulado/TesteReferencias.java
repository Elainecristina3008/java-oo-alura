package com.bytebankencapsulado;

public class TesteReferencias {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        //lado esquerdo é a referência e do lado direito o tipo
        gerente1.setNome("Elaine");
        String nome = gerente1.getNome();
        gerente1.setSalario(2000.0);
        System.out.println(nome);

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setSalario(1000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(1500.0);


        // gerente1.autentica(1551); Não funciona pois o método autentica é exclusivo da classe gerente e não de funcionário.

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente1);
        controle.registra(funcionario1);
        controle.registra(ev);

        System.out.println(controle.getSoma());


    }
}
