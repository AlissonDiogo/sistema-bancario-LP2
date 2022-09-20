package br.ufrn.imd.dominio;

import java.util.ArrayList;

public class Banco {
    private int id;
    private String nome;
    private ArrayList<Agencia> agencias;

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
    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }
    public void setAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }

}
