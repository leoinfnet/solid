package br.com.acme.solid.openclosed;

public class AprovarExame {
    public void aprovarSolicitacaoDeExame(Exame exame){
        if (exame.tipo == TipoExame.SANGUE) {
            if(verificarConficoesDoExameDeSangue(exame)){
                System.out.println("Exame aprovado!");
            }
        } else if(exame.tipo == TipoExame.RAIO_X){
            if(verificarConficoesDoExameDeRaioX(exame)){
                System.out.println( "Exame RAIO X aprovado");
            }
        } else if(exame.tipo == TipoExame.RESSONANCIA){
            if(verificarConficoesDoExameDeRessonancia(exame)){
                System.out.println("Ressonancia aprovada!");
            }
        }else if(exame.tipo == TipoExame.ULTRA){
            if(verificarConficoesDoExameDeUltrasom(exame)){
                System.out.println("ULTRASOM APROVADO");
            }
        }
    }
    private boolean verificarConficoesDoExameDeSangue(Exame exame) {
        return true;
    }
    private boolean verificarConficoesDoExameDeRaioX(Exame exame) {
        return true;
    }
    private boolean verificarConficoesDoExameDeRessonancia(Exame exame) {
        return true;
    }
    private boolean verificarConficoesDoExameDeUltrasom(Exame exame) {
        return true;
    }

}
