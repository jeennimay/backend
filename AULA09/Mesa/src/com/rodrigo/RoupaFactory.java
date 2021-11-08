package com.rodrigo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RoupaFactory {

    private static HashMap<String,Roupa> lista = new HashMap();

    public static Roupa getRoupa(String tamanho, String tipo, boolean eNova, boolean importado) {
        Roupa roupa = lista.get(tipo);
        if (roupa == null) {
            roupa = new Roupa(tamanho, tipo, eNova, importado);
            lista.put(tipo,roupa);
        }else{
            roupa.seteNova(eNova);
            roupa.setImportado(importado);
            roupa.setTamanho(tamanho);
        }
        return roupa;
    }

    public static int getQtd(){
        return lista.size();
    }
}
