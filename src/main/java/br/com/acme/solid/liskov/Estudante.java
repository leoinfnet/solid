package br.com.acme.solid.liskov;

public class Estudante {
    String nome;

    public Estudante(String nome) {
        this.nome = nome;
    }
    public void estudar(){
        System.out.println(nome + " está estudando!");
    }

}
