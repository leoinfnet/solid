package br.com.acme.solid.liskov;

public class EstudanteDeMestrado extends Estudante{

    public EstudanteDeMestrado(String nome) {
        super(nome);
    }
    @Override
    public void estudar() {
        System.out.println(nome + "Esta estudando e pesquisando!");
    }
}
