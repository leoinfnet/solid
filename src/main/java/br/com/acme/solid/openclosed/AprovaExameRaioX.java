package br.com.acme.solid.openclosed;

public class AprovaExameRaioX implements AprovaExame{
    @Override
    public void aprovarSolicitacaoExame(Exame exame) {
        if(verificarCondicoesExame(exame)){
            System.out.println("Exame de Raio X Aprovado");
        }
    }

    @Override
    public boolean verificarCondicoesExame(Exame exame) {
        return true;
    }
}
