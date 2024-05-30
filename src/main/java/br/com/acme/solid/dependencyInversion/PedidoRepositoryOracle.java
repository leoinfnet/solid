package br.com.acme.solid.dependencyInversion;

public class PedidoRepositoryOracle implements PedidoRepository{
    @Override
    public void salvarPedido() {
        System.out.println("Salvando no Oracle");
    }
}
