package model;

import factory.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoLocarCadeiraTest {

    @Test
    void deveRegitrarPedidoCliente(){
        IServico servico = ServicoFactory.obterServico("LocarCadeira");
        assertEquals("Locação combo 40 cadeiras simples - BRANCA", servico.abrirPedidoLocacao());
    }
    @Test
    void deveReceberPagamentoCliente(){
        IServico servico = ServicoFactory.obterServico("LocarCadeira");
        assertEquals("Pagamento recebido - R$ 89,90", servico.receberPagamento());
    }

    @Test
    void devePrepararProdutoCliente(){
        IServico servico = ServicoFactory.obterServico("LocarCadeira");
        assertEquals("Produto em preparação para entrega", servico.prepararProduto());
    }
    @Test
    void deveEntregarPedidoCliente(){
        IServico servico = ServicoFactory.obterServico("LocarCadeira");
        assertEquals("Produto repassado para entregador", servico.repassarEntrega());
    }

}
