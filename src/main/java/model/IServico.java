package model;

public interface IServico {
    String abrirPedidoLocacao();
    String receberPagamento();
    String prepararProduto();
    String repassarEntrega();
}