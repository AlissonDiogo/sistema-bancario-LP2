package br.ufrn.imd.dominio;

import java.util.Random;

public class CartaoCredito {
    private String numero;
    private double limiteTotal;
    private double limiteUsado;

    public CartaoCredito() {
        Random rand = new Random();
        int firstSequence = rand.nextInt(9999);
        int secondSequence = rand.nextInt(9999);
        int thirdSequence = rand.nextInt(9999);
        int fourthSequence = rand.nextInt(9999);

        this.numero = firstSequence + " " + secondSequence + " " + thirdSequence + " " + fourthSequence;
        this.limiteTotal = rand.nextDouble() * 2000;
        this.limiteUsado = 0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public double getLimiteUsado() {
        return limiteUsado;
    }

    public void setLimiteUsado(double limiteUsado) {
        this.limiteUsado = limiteUsado;
    }

    public boolean solicitarAumentoLimite(double valorSolicitado) {
        if (valorSolicitado > 500) { // aumento de limite negado
            return false;
        } else { // Aumento de limite aceito; fazer log disso?
            this.limiteTotal += valorSolicitado;
            return true;
        }
    }

    public boolean realizarCompra(double valorCompra) {
        if ((limiteTotal - limiteUsado - valorCompra) > 0) { // compra pode ser realizada
            limiteUsado += valorCompra;
            return true;
        }
        return false; // compra negada

    }
}
