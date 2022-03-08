package com.bytebankencapsulado;

public class SistemaInterno {

    private int senha = 1514;

    public void autentica (FuncionarioAutenticavel g){
        boolean autenticou = g.autentica(this.senha);
        if (autenticou){
            System.out.println("Senha validada com sucesso, usuário pode acessar o sistema");
        }else{
            System.out.println("Para acesso ao sistema é preciso validar a senha");
        }

    }
}
