package br.ufrn.imd.dominio;

public enum EnumHistoricoStrings {
    ERRO_SACAR_SALDO_INSUFICIENTE("Saldo insuficiente."),
    VALOR_SACADO_SUCESSO("Valor sacado com sucesso."),
    VALOR_DEPOSITADO_SUCESSO("Valor depositado com sucesso: "),
    ERRO_COMPRA("Compra não autorizada."),
    COMPRA_SUCESSO("Compra realizada com sucesso."),
    ERRO_AUMENTO_LIMITE("Aumento de limite não concedido."),
    AUMENTO_LIMITE_SUCESSO("Aumento de limite concedido.");

    private String valor;
    EnumHistoricoStrings(String valorOpcao){
        valor = valorOpcao;
    }

    public String getValor() {
        return valor;
    }
}
