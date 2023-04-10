package com.dio.ex1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calculadora");
        System.out.println(Calculadora.somar(3,6));
        System.out.println(Calculadora.subtrair(10,6));
        System.out.println(Calculadora.multiplicar(3,6));
        System.out.println(Calculadora.dividir(12,6));
        System.out.println("------------------");


        System.out.println("Mensagem");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(3);
        System.out.println("------------------");


    }
}
