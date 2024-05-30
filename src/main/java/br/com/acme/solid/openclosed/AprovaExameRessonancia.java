package br.com.acme.solid.openclosed;

public class AprovaExameRessonancia implements AprovaExame{
    @Override
    public void aprovarSolicitacaoExame(Exame exame) {
        if(verificarCondicoesExame(exame)) System.out.println("Exame aprovado!");
    }

    @Override
    public boolean verificarCondicoesExame(Exame exame) {
        System.out.println("Muito dificil de aprovar!");
        return false;
    }
}
