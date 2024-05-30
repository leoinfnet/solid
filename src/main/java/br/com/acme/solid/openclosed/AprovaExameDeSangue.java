package br.com.acme.solid.openclosed;

public class AprovaExameDeSangue implements AprovaExame{
    @Override
    public void aprovarSolicitacaoExame(Exame exame) {
        if(verificarCondicoesExame(exame)){
            System.out.println("Exame Aprovado!");
        }
    }
    @Override
    public boolean verificarCondicoesExame(Exame exame) {
        return false;
    }
}
