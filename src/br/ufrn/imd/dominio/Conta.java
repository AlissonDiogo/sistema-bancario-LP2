package br.ufrn.imd.dominio;

import java.util.ArrayList;

public class Conta {
    private String numero;
    private Agencia agencia;
    private String tipo;
    private double saldo; 
    private HistoricoAcoesConta historicoAcoes;
    private CartaoCredito cartaoDeCredito;

    public Conta() {
        this.historicoAcoes = new HistoricoAcoesConta();
        this.cartaoDeCredito = new CartaoCredito();
    }

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.historicoAcoes = new HistoricoAcoesConta();
        this.cartaoDeCredito = new CartaoCredito();
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

}
