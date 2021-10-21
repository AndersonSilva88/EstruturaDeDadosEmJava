package com.projeto.fila;

public class Main {

    public static void main(String[] args) {

        Fila<String> minhafila = new Fila<>();

        minhafila.enqueue("primeiro");
        minhafila.enqueue("segundo");
        minhafila.enqueue("terceiro");
        minhafila.enqueue("quarto");


        System.out.println(minhafila);

        System.out.println(minhafila.dequeue());



    }
}
