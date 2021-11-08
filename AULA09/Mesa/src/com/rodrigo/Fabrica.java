package com.rodrigo;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {

    private List<Roupa> tamanhosXS = new ArrayList<>();
    private List<Roupa> tamanhosS = new ArrayList<>();
    private List<Roupa> tamanhosM = new ArrayList<>();
    private List<Roupa> importadas = new ArrayList<>();
    private List<Roupa> masCondicoes = new ArrayList<>();
    private int qtdEstoque = 0;

    public void addRoupa(String tamanho, String tipo, boolean eNova, boolean importado) {
        Roupa roupa = RoupaFactory.getRoupa(tamanho, tipo, eNova, importado);
        qtdEstoque++;

        switch (tamanho) {
            case "XS":
                tamanhosXS.add(roupa);
                break;
            case "S":
                tamanhosS.add(roupa);
                break;
            case "M":
                tamanhosM.add(roupa);
                break;
            default:
                break;
        }
        if (!eNova)
            masCondicoes.add(roupa);
        if (importado)
            importadas.add(roupa);

    }

    public void getQtdEstoque(){
        System.out.printf("Quantidade de roupa %d.\nRealmente estanciadas %d.",qtdEstoque,RoupaFactory.getQtd());
    }
}
