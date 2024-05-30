package br.com.acme.solid.liskov;

public class EstudanteDaGraduacao extends Estudante{
    public EstudanteDaGraduacao(String nome) {
        super(nome);
    }
    public void entregarTCC(){
        System.out.println("Entregando meu TCC");
    }
}
