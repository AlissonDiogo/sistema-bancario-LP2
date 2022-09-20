package br.ufrn.imd.dominio;

public class Banco {
    private int id;
    private String nome;

    public Banco(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getIdBanco() {
        return id;
    }
    public void setIdBanco(int idBanco) {
        this.id = idBanco;
    }
    public String getNomeBanco() {
        return nome;
    }
    public void setNomeBanco(String nomeBanco) {
        this.nome = nomeBanco;
    }

}
