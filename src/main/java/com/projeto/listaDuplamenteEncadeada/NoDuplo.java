package com.projeto.listaDuplamenteEncadeada;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noProximno;
    private NoDuplo<T> noPrevio;

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoProximno() {
        return noProximno;
    }

    public void setNoProximno(NoDuplo<T> noProximno) {
        this.noProximno = noProximno;
    }

    public NoDuplo<T> getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(NoDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
