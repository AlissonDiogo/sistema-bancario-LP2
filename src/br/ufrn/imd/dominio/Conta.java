package br.ufrn.imd.dominio;

import java.util.ArrayList;

public class Conta {
    private String numero;
    private Agencia agencia;
    private double saldo;
    private HistoricoAcoesConta historicoAcoes;
    private CartaoCredito cartaoDeCredito;

    public Conta(String numero, Agencia agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.historicoAcoes = new HistoricoAcoesConta();
        this.cartaoDeCredito = new CartaoCredito();
    }

    @Override
    public String toString() {
        return this.numero + " " + this.agencia.getBanco().getNomeBanco();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public CartaoCredito getCartaoDeCredito() {
        return cartaoDeCredito;
    }

    public void setCartaoDeCredito(CartaoCredito cartaoDeCredito) {
        this.cartaoDeCredito = cartaoDeCredito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<LogHistoricoAcoes> getHistoricoAcoes() {
        return historicoAcoes.getAcoes();
    }

    public boolean sacar(double valorParaSacar) {
        if (saldo < valorParaSacar) {
            // não tem saldo suficiente
            historicoAcoes.addLogAcao(EnumHistoricoStrings.ERRO_SACAR_SALDO_INSUFICIENTE, 1);
            return false;
        }
        // sacado com sucesso
        saldo -= valorParaSacar;
        historicoAcoes.addLogAcao(EnumHistoricoStrings.VALOR_SACADO_SUCESSO, 2);
        return true;
    }

    public void depositar(double valorDeDeposito){
        this.saldo += valorDeDeposito;
        historicoAcoes.addLogAcao(EnumHistoricoStrings.VALOR_DEPOSITADO_SUCESSO, 3, valorDeDeposito);
    }

    public boolean solicitarAumentoLimite(double valorSolicitado) {
        boolean sucesso = this.cartaoDeCredito.solicitarAumentoLimite(valorSolicitado);
        EnumHistoricoStrings enumLog = (sucesso)? EnumHistoricoStrings.AUMENTO_LIMITE_SUCESSO : EnumHistoricoStrings.ERRO_AUMENTO_LIMITE;
        this.historicoAcoes.addLogAcao(enumLog, 3);
        return sucesso;
    }

    public boolean realizarCompra(double valorCompra) {
        boolean sucesso = this.cartaoDeCredito.realizarCompra(valorCompra);
        EnumHistoricoStrings enumLog = (sucesso)? EnumHistoricoStrings.COMPRA_SUCESSO : EnumHistoricoStrings.ERRO_COMPRA;
        this.historicoAcoes.addLogAcao(enumLog, 3);
        return sucesso;
    }

}
