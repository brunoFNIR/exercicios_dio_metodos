package com.dio.ex2and3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Base Quadrado");
        System.out.println(AreaQuadrados.area(25));
        System.out.println("-------------");

        System.out.println("Base Retângulo");
        System.out.println(AreaQuadrados.area(10,6));
        System.out.println("-------------");

        System.out.println("Base Trapézio");
        System.out.println(AreaQuadrados.area(20,13, 7.5));
        System.out.println("-------------");
    }
}
