package br.com.acme.solid.openclosed;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        AprovaExame aprovaExame = new AprovaExameDeSangue();
        AprovaExame aprovaExameRaioX = new AprovaExameRaioX();
        AprovaExame ressonancia = new AprovaExameRessonancia();
        List<AprovaExame> aprovacoes = List.of(aprovaExame, aprovaExameRaioX,ressonancia);
        for(AprovaExame aprovacao : aprovacoes){
            Exame exame = new Exame();
            aprovacao.aprovarSolicitacaoExame(exame);
        }
        aprovaExame.aprovarSolicitacaoExame(new Exame());
    }
}
