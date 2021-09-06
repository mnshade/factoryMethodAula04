package model;

public class ServicoLocarMesa implements IServico {
    public String abrirPedidoLocacao(){
        return ("Locação combo 10 mesas simples - BRANCA");
    }
    public String receberPagamento(){
        return ("Pagamento recebido - R$ 59,90");
    }
    public String prepararProduto(){
        return ("Produto em preparação para entrega");
    }
    public String repassarEntrega() {
        return ("Produto repassado para entregador");
    }
}
