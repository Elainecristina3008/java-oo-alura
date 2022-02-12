package com.sintaxe.variaveis.fluxo;

public class TestaCaracteres {
    public static void main(String[] args) {
        char letra = 'a'; // o valor da variável char é deve ser colocado dentro de aspas simples.
        System.out.println(letra);

        char valor = 66;
        System.out.println(valor);

        valor = (char) (valor + 1); //Outro exemplo da casting
        System.out.println(valor);

        // O charconverte os valores numericos em letras
        //O string é tipo referência

        String palavra = "Alura cursos online de tecnologia";
        System.out.println(palavra);

        palavra = palavra + " " + 2022;
        System.out.println(palavra);



    }
}
