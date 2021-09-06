package model;

public class ServicoLocarCadeira implements IServico {
    public String abrirPedidoLocacao(){
        return ("Locação combo 40 cadeiras simples - BRANCA");
    }
    public String receberPagamento(){
        return ("Pagamento recebido - R$ 89,90");
    }
    public String prepararProduto(){
        return ("Produto em preparação para entrega");
    }
    public String repassarEntrega() {
        return ("Produto repassado para entregador");
    }
}
