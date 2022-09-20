package br.ufrn.imd.dominio;

public class CartaoCredito {
    private String numero;
    private double limiteTotal;
    private double limiteUsado;
    
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

    
}
