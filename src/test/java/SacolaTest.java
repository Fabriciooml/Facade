import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SacolaTest {

    @Test
    void deveRetornarClienteNaoAssinante() {
        Cliente cliente = new Cliente(false);
        Produto produto = new Produto();
        Loja loja = new Loja();

        Sacola sacola = new Sacola(cliente, produto, loja);
        sacola.loja.addLojaParceira(loja);

        assertEquals(false, sacola.aplicarCashbackEmDobro());
    }

    @Test
    void deveRetornarProdutoInvalido() {
        Cliente cliente = new Cliente(true);
        Produto produto = new Produto();
        Loja loja = new Loja();

        Sacola sacola = new Sacola(cliente, produto, loja);

        sacola.produto.addProdutoInvalido(produto);
        sacola.loja.addLojaParceira(loja);

        assertEquals(false, sacola.aplicarCashbackEmDobro());
    }

    @Test
    void deveRetornarLojaNaoParceira() {
        Cliente cliente = new Cliente(true);
        Produto produto = new Produto();
        Loja loja = new Loja();

        Sacola sacola = new Sacola(cliente, produto, loja);

        assertEquals(false, sacola.aplicarCashbackEmDobro());
    }

    @Test
    void deveRetornarCashbackEmDobroAprovado() {
        Cliente cliente = new Cliente(true);
        Produto produto = new Produto();
        Loja loja = new Loja();

        Sacola sacola = new Sacola(cliente, produto, loja);

        sacola.loja.addLojaParceira(loja);

        assertEquals(true, sacola.aplicarCashbackEmDobro());
    }

}