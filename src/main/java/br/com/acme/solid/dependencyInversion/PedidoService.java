package br.com.acme.solid.dependencyInversion;

public class PedidoService {
    private PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void processarPedido(Pedido pedido){
        pedidoRepository.salvarPedido();

    }
}
