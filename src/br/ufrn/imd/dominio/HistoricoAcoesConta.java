package br.ufrn.imd.dominio;

import java.util.ArrayList;

public class HistoricoAcoesConta {
    private ArrayList<LogHistoricoAcoes> acoes;

    public void addLogAcao(EnumHistoricoStrings enumError, int codigo_erro) {
        LogHistoricoAcoes newLogAcao = new LogHistoricoAcoes();
        newLogAcao.setId(acoes.size());
        newLogAcao.setCodigoLog(codigo_erro);
        newLogAcao.setTextoLog(enumError.getValor());
        acoes.add(newLogAcao);
    }

    public void addLogAcao(EnumHistoricoStrings enumError, int codigo_erro, double valorParaInserirNoTexto) {
        LogHistoricoAcoes newLogAcao = new LogHistoricoAcoes();
        newLogAcao.setId(acoes.size());
        newLogAcao.setCodigoLog(codigo_erro);
        newLogAcao.setTextoLog(enumError.getValor().concat(valorParaInserirNoTexto + "."));
        acoes.add(newLogAcao);
    }

    public ArrayList<LogHistoricoAcoes> getAcoes() {
        return acoes;
    }

}