package br.com.acme.solid.dependencyInversion;

public class Runner {
    public static void main(String[] args) {
        PedidoRepository oracle = new PedidoRepositoryOracle();
        PedidoRepository mongoDB = new PedidoRepositoryMongoDB();
        new PedidoService(oracle);
        new PedidoService(mongoDB);
    }
}
