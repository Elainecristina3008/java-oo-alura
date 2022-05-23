package com.pilha;

public class TestAccountwithExceptionChecked {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.deposita();
        }catch (MinhaExcecao ex){
            System.out.println("tratamento da exceção ....");
        }

    }
}
