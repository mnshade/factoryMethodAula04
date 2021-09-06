package model;

import factory.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoLocarMesaTest {

    @Test
    void deveRegitrarPedidoCliente(){
        IServico servico = ServicoFactory.obterServico("LocarMesa");
        assertEquals("Locação combo 10 mesas simples - BRANCA", servico.abrirPedidoLocacao());
    }
    @Test
    void deveReceberPagamentoCliente(){
        IServico servico = ServicoFactory.obterServico("LocarMesa");
        assertEquals("Pagamento recebido - R$ 59,90", servico.receberPagamento());
    }

    @Test
    void devePrepararProdutoCliente(){
        IServico servico = ServicoFactory.obterServico("LocarMesa");
        assertEquals("Produto em preparação para entrega", servico.prepararProduto());
    }
    @Test
    void deveEntregarPedidoCliente(){
        IServico servico = ServicoFactory.obterServico("LocarMesa");
        assertEquals("Produto repassado para entregador", servico.repassarEntrega());
    }
}
