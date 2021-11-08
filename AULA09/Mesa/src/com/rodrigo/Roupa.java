package com.rodrigo;

import java.util.Objects;

public class Roupa {

    private String tamanho;
    private String tipo;
    private boolean eNova;
    private boolean importado;

    public Roupa(String tamanho, String tipo, boolean eNova, boolean importado) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.eNova = eNova;
        this.importado = importado;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void seteNova(boolean eNova) {
        this.eNova = eNova;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }
}
