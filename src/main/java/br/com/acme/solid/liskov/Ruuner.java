package br.com.acme.solid.liskov;

public class Ruuner {
    public static void main(String[] args) {
        EstudanteDaGraduacao leonardo = new EstudanteDaGraduacao("Leonardo");
        leonardo.estudar();
        leonardo.entregarTCC();

        EstudanteDeMestrado joao = new EstudanteDeMestrado("Joao");
        joao.estudar();

    }
}
