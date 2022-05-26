import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Loja> lojasInvalidas = new ArrayList<Loja>();

    public Loja() {}

    public void addLojaParceira(Loja loja) {
        this.lojasInvalidas.add(loja);
    }

    public boolean isLojaParceira(Loja loja) {
        return this.lojasInvalidas.contains(loja);
    }
}
