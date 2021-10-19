package com.projeto.fila;

public class Main {

    public static void main(String[] args) {

        Fila minhafila = new Fila();

        minhafila.enqueue(new No("primeiro"));
        minhafila.enqueue(new No("segundo"));
        minhafila.enqueue(new No("terceiro"));
        minhafila.enqueue(new No("quarto"));
       ;

        System.out.println(minhafila);

        System.out.println(minhafila.dequeue());



    }
}
