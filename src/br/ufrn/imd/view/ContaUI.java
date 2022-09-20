package br.ufrn.imd.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.ufrn.imd.dominio.Cliente;
import br.ufrn.imd.dominio.Conta;
import br.ufrn.imd.dominio.LogHistoricoAcoes;

public class ContaUI {
    public static void showSaudacaoCliente(Cliente cliente) {
        System.out.println("Olá, " + cliente.getNome() + "!");
    }

    public static void showClienteContas(ArrayList<Conta> contas) {
        System.out.println("Estas são suas contas:");
        for(Conta conta : contas) {
            System.out.println(conta);
        }
        System.out.println("Informe o número da conta:");
    }

    public static void showMenuConta(Conta contaSelecionada) {
        System.out.println();
        System.out.println(contaSelecionada);
        System.out.println("Saldo débito: " + contaSelecionada.getSaldo());
        System.out.println("Limite usado crédito: " + contaSelecionada.getCartaoDeCredito().getLimiteUsado());
        System.out.println("Limite crédito: " + contaSelecionada.getCartaoDeCredito().getLimiteTotal());
        System.out.println();

        System.out.println("Informe a operação desejada:");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Comprar");
        System.out.println("4 - Aumentar limite");
        System.out.println("0 - Sair");

        System.out.println("Informe a opção: ");
    }

    public static void showUltimoLogDaConta(Conta conta) {
        int qntHistoricoAcoes = conta.getHistoricoAcoes().size();
        LogHistoricoAcoes ultimoLog = conta.getHistoricoAcoes().get(qntHistoricoAcoes-1);
        System.out.println(ultimoLog);
    }
}
