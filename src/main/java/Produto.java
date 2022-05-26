import java.util.ArrayList;
import java.util.List;

public class Produto {

    private List<Produto> produtosInvalidos = new ArrayList<Produto>();

    public Produto() {}

    public void addProdutoInvalido(Produto produto) {
        this.produtosInvalidos.add(produto);
    }

    public boolean isProdutoInvalido(Produto produto) {
        return this.produtosInvalidos.contains(produto);
    }
}
