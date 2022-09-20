package br.ufrn.imd.dominio;

public class Agencia {
    private int id;
    private Endereco endereco;
    private Banco banco;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    
}
