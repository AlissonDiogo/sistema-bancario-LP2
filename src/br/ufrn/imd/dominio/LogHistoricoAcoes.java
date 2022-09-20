package br.ufrn.imd.dominio;

public class LogHistoricoAcoes {
    private int id;
    private int codigoLog;
    private String textoLog;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigoLog() {
        return codigoLog;
    }

    public void setCodigoLog(int codigoLog) {
        this.codigoLog = codigoLog;
    }

    public String getTextoLog() {
        return textoLog;
    }

    public void setTextoLog(String textoLog) {
        this.textoLog = textoLog;
    }

    @Override
    public String toString() {
        return this.textoLog;
    }

}
