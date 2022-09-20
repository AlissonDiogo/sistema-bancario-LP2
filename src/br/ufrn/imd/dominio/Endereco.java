package br.ufrn.imd.dominio; 

public class Endereco {
    private String logradouro;
    private String cidade;
    private String bairro;
    private String numero;

    public Endereco(String logradouro, String cidade, String bairro, String numero) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
    }
    
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    
}