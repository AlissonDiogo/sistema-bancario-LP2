package br.ufrn.imd.dominio;

import java.util.Date;
import java.util.ArrayList;

public class Cliente extends Pessoa { 
    private ArrayList<Conta> contas;

    public Cliente(String nome, Endereco endereco, String cpf, Date date, ArrayList<Conta> contas) {
        super(nome, endereco, cpf, date);
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
