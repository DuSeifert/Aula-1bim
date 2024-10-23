package br.com.unicesumar;

public class Main {
    public static void main(String[] args) {

        GerenciadorPedidos gerenciador = new GerenciadorPedidos();

        gerenciador.criarPedido(1, "Pão d'alho");
        gerenciador.criarPedido(2, "Alho de pão");

        gerenciador.atuaizarStatusPedido(1, StatusPedido.Preparando);
        gerenciador.atuaizarStatusPedido(2, StatusPedido.Pronto);

        gerenciador.listarPedidosStatus(StatusPedido.Entregando);
    }
}