public class Cliente {

    protected boolean assinante;

    public Cliente(boolean assinante) {
        this.assinante = assinante;
    }

    public boolean isClienteAssinante() {
        return this.assinante;
    }

    public void setAssinante(boolean assinante) {
        this.assinante = assinante;
    }
}
