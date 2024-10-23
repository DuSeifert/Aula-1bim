package br.com.unicesumar;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidos {
    private List<Pedido> pedidos;

    public GerenciadorPedidos() {
        this.pedidos = new ArrayList<Pedido>();
    }

    public void criarPedido(int id, String descricao){
        Pedido p = new Pedido(id, descricao);
        pedidos.add(p);
        System.out.println("Pedido criado - "+ p);
    }

    public void atuaizarStatusPedido(int id, StatusPedido st){
        for(Pedido p : pedidos){
            if(p.getId() == id){
                p.setStatus(st);
                System.out.println("Pedido atualizado - "+ p);
                return;
            }
        }
        System.out.println("Pedido não encontrado");
    }

    public void listarPedidosStatus(StatusPedido st){
        for(Pedido p : pedidos){
            if(p.getStatus() == st){
                System.out.println("Pedido encontrado - "+ p);
                return;
            }
        }
        System.out.println("Não há pedidos de status: " + st);
    }

}
