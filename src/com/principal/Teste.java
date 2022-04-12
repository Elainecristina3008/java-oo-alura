package com.principal;

public class Teste {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("rodando..."));

        t.setPriority(1);
        t.start();
    }
}
