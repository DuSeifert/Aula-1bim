package br.com.unicesumar;

public class Pedido {
    private int id;
    private String descricao;
    private StatusPedido status;

    public Pedido(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.status = StatusPedido.Novo;
    }

    public StatusPedido getStatus(){
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                '}';
    }



}
