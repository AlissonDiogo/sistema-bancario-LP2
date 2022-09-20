package br.ufrn.imd.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import br.ufrn.imd.dominio.Agencia;
import br.ufrn.imd.dominio.Banco;
import br.ufrn.imd.dominio.Cliente;
import br.ufrn.imd.dominio.Conta;
import br.ufrn.imd.dominio.Endereco;
import br.ufrn.imd.view.ContaUI;

public class App {
    public static Cliente initCliente() {
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(Calendar.DATE, 27);
        dataNascimento.set(Calendar.MONTH, 07);
        dataNascimento.set(Calendar.YEAR, 2001);

        Endereco enderecoCliente = new Endereco("Rua da Pessoa", "Santa Cruz", "Barro Vermelho", "654");
        Endereco enderecoAgencia1 = new Endereco("Rua da Agência 1", "Santa Cruz", "Barro Vermelho", "123");
        Endereco enderecoAgencia2 = new Endereco("Rua da Agência 2", "Natal", "Alecrim", "555");

        Banco banco1 = new Banco(1, "Bradesco");
        Banco banco2 = new Banco(2, "Banco do Brasil");
        
        Agencia agencia1 = new Agencia(1, enderecoAgencia1, banco1);
        Agencia agencia2 = new Agencia(2, enderecoAgencia2, banco2);

        Conta conta1 = new Conta("111", agencia1, 100);
        Conta conta2 = new Conta("123", agencia2, 500);

        ArrayList<Conta> contasCliente = new ArrayList<>();
        contasCliente.add(conta1);

        Cliente cliente = new Cliente("Isaac Lourenço", enderecoCliente, "123.123.132-12", dataNascimento.getTime(), contasCliente);
        cliente.addConta(conta2);
        return cliente;
    }

    

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = initCliente();
        ContaUI.showSaudacaoCliente(cliente);
        ContaUI.showClienteContas(cliente.getContas());
        String numero = sc.nextLine();

        Conta contaSelecionada = cliente.getContas().get(0);
        for (Conta conta : cliente.getContas()) {
            if (conta.getNumero().equals(numero)) {
                contaSelecionada = conta;
            }
        }
        
        ContaUI.showMenuConta(contaSelecionada);
        int opcaoOperacao = sc.nextInt();

        switch(opcaoOperacao) {
            case 1:
                contaSelecionada.depositar(ContaUI.solicitarValor());
                break;
            case 2:
                contaSelecionada.sacar(ContaUI.solicitarValor());
                break;
            case 3:
                contaSelecionada.realizarCompra(ContaUI.solicitarValor());
                break;
            case 4:
                contaSelecionada.solicitarAumentoLimite(ContaUI.solicitarValor());
                break;
            case 0:
        }
        
        ContaUI.showUltimoLogDaConta(contaSelecionada);

        sc.close();
    }
}
