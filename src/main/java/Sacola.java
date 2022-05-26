public class Sacola {

    protected Cliente cliente;
    protected Produto produto;
    protected Loja loja;

    public Sacola(Cliente cliente, Produto produto, Loja loja) {
        this.cliente = cliente;
        this.produto = produto;
        this.loja = loja;
    }

    public boolean aplicarCashbackEmDobro() {
        return SacolaFacade.isCashbackEmDobro(this);
    }
}
