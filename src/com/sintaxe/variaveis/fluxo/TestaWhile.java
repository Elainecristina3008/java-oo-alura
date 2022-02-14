package com.sintaxe.variaveis.fluxo;

public class TestaWhile {
    public static void main(String[] args) {
        int contador = 0;
        while(contador <= 10){
            System.out.println("contador " + contador);
            contador ++;
            //ou contador = contador +1
            //ou contador += 1;
        }
        System.out.println("Contador " + contador);
    }
}
