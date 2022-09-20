package br.ufrn.imd.dominio;

import java.util.ArrayList;

public class Cliente extends Pessoa { 
    private ArrayList<Conta> contas;

    public Cliente(){
        this.contas = new ArrayList<Conta>();
    }

    public Cliente(ArrayList<Conta> contas) {
        this.contas = new ArrayList<Conta>();
        this.contas = contas;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta){
        contas.add(conta);
    }
}
