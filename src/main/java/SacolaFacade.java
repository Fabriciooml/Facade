public class SacolaFacade {

    public static boolean isCashbackEmDobro(Sacola sacola) {
        boolean isCashbackEmDobroValido = true;
        if (sacola.produto.isProdutoInvalido(sacola.produto)){
            isCashbackEmDobroValido = false;
        }
        if (!sacola.cliente.isClienteAssinante()){
            isCashbackEmDobroValido = false;
        }
        if (!sacola.loja.isLojaParceira(sacola.loja)){
            isCashbackEmDobroValido = false;
        }
        return isCashbackEmDobroValido;
    }
}
