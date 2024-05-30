package br.com.acme.solid.dependencyInversion;

public class PedidoRepositoryMongoDB implements PedidoRepository{
    @Override
    public void salvarPedido() {
        System.out.println("Salvando no Mongo");
    }
}
