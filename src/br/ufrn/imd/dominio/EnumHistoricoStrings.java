package br.ufrn.imd.dominio;

public enum EnumHistoricoStrings {
    ERRO_SACAR_SALDO_INSUFICIENTE("Saldo insuficiente."),
    VALOR_SACADO_SUCESSO("Valor sacado com sucesso.");

    private String valor;
    EnumHistoricoStrings(String valorOpcao){
        valor = valorOpcao;
    }

    public String getValor() {
        return valor;
    }
}
