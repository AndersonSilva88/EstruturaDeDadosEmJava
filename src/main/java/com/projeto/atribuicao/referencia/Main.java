package com.projeto.atribuicao.referencia;

public class Main {

    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + ", intB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + ", intB = "+ intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("a = " + objA + ", b = "+ objB);
        objA.setNum(2);
        System.out.println("A = " + objA + ", B = " + objB);

    }
}
