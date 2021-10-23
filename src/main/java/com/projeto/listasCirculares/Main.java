package com.projeto.listasCirculares;

public class Main {

    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);

        System.out.println(minhaListaCircular);

        minhaListaCircular.add("1");
        minhaListaCircular.add("2");
        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.get(0));
        System.out.println(minhaListaCircular.get(2));
        System.out.println(minhaListaCircular.get(3));
    }
}
