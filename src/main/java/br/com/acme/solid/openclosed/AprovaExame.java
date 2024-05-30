package br.com.acme.solid.openclosed;

public interface AprovaExame {
    void aprovarSolicitacaoExame(Exame exame);
    boolean verificarCondicoesExame(Exame exame);
}
